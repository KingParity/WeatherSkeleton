package com.kingparity.weatherskeleton.entity;

import com.kingparity.weatherskeleton.core.ModItems;
import com.kingparity.weatherskeleton.core.ModSounds;
import com.kingparity.weatherskeleton.network.PacketHandler;
import com.kingparity.weatherskeleton.network.message.MessageWeatherSkeleton;
import net.minecraft.block.BlockState;
import net.minecraft.entity.*;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.CompoundNBT;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class WeatherSkeletonEntity extends CreatureEntity
{
    private static final DataParameter<Integer> HAT = EntityDataManager.createKey(WeatherSkeletonEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> HEAD = EntityDataManager.createKey(WeatherSkeletonEntity.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> SHIRT = EntityDataManager.createKey(WeatherSkeletonEntity.class, DataSerializers.VARINT);
    
    private boolean flag;
    
    public WeatherSkeletonEntity(EntityType<? extends CreatureEntity> type, World world)
    {
        super(type, world);
        this.setCanPickUpLoot(true);
    }
    
    @Override
    protected void registerData()
    {
        super.registerData();
        this.dataManager.register(HAT, 1);
        this.dataManager.register(HEAD, 1);
        this.dataManager.register(SHIRT, 1);
    }
    
    @Override
    protected void registerGoals()
    {
        this.goalSelector.addGoal(0, new SwimGoal(this));
        this.goalSelector.addGoal(1, new AvoidEntityGoal<>(this, WolfEntity.class, 6.0F, 1.0D, 1.2D));
        this.goalSelector.addGoal(2, new WaterAvoidingRandomWalkingGoal(this, 0.6D));
        this.goalSelector.addGoal(3, new LookAtGoal(this, PlayerEntity.class, 8.0F));
        this.goalSelector.addGoal(4, new LookRandomlyGoal(this));
    }
    
    @Nullable
    @Override
    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_SKELETON_AMBIENT;
    }
    
    @Nullable
    @Override
    protected SoundEvent getHurtSound(DamageSource source)
    {
        return ModSounds.SCREAM;
    }
    
    @Nullable
    @Override
    protected SoundEvent getDeathSound()
    {
        return ModSounds.SCREAM;
    }
    
    @Override
    protected void playStepSound(BlockPos pos, BlockState state)
    {
        this.playSound(SoundEvents.ENTITY_SKELETON_STEP, 0.15F, 1.0F);
    }
    
    @Override
    protected void registerAttributes()
    {
        super.registerAttributes();
        this.getAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        this.getAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
    }
    
    @Override
    public void livingTick()
    {
        super.livingTick();
        if(world.getClosestPlayer(this, 5) != null)
        {
            if(!flag)
            {
                if(!world.isRemote)
                {
                    PacketHandler.sendToServer(new MessageWeatherSkeleton(this.getEntityId()));
                }
                flag = true;
            }
        }
        else
        {
            flag = false;
        }
    }
    
    @Override
    public float getEyeHeight(Pose pose)
    {
        return 1.74F;
    }
    
    @Override
    public void writeAdditional(CompoundNBT compound)
    {
        super.writeAdditional(compound);
        compound.putInt("Hat", this.getHat());
        compound.putInt("Head", this.getHead());
        compound.putInt("Shirt", this.getShirt());
        compound.putBoolean("Flag", this.getFlag());
    }
    
    @Override
    public void readAdditional(CompoundNBT compound)
    {
        super.readAdditional(compound);
        this.setHat(compound.getInt("Hat"));
        this.setHead(compound.getInt("Head"));
        this.setShirt(compound.getInt("Shirt"));
        this.setFlag(compound.getBoolean("Flag"));
        
        this.setCanPickUpLoot(true);
    }
    
    @Nullable
    @Override
    public ILivingEntityData onInitialSpawn(IWorld world, DifficultyInstance difficulty, SpawnReason reason, @Nullable ILivingEntityData data, @Nullable CompoundNBT compound)
    {
        data = super.onInitialSpawn(world, difficulty, reason, data, compound);
        this.setHat(getRandomHat(this.world.rand));
        this.setHead(getRandomHead(this.world.rand));
        this.setShirt(getRandomShirt(this.world.rand));
        if(this.world.rand.nextInt(10) > 8)
        {
            this.replaceItemInInventory(98, new ItemStack(ModItems.KOA_SWORD));
        }
        return data;
    }
    
    public static int getRandomHat(Random random)
    {
        return random.nextInt(5);
    }
    
    public static int getRandomHead(Random random)
    {
        return random.nextInt(5);
    }
    
    public static int getRandomShirt(Random random)
    {
        return random.nextInt(8);
    }
    
    public void setHat(int hat)
    {
        this.dataManager.set(HAT, hat);
    }
    
    public void setHead(int head)
    {
        this.dataManager.set(HEAD, head);
    }
    
    public void setShirt(int shirt)
    {
        this.dataManager.set(SHIRT, shirt);
    }
    
    public void setFlag(boolean flag)
    {
        this.flag = flag;
    }
    
    public int getHat()
    {
        return this.dataManager.get(HAT);
    }
    
    public int getHead()
    {
        return this.dataManager.get(HEAD);
    }
    
    public int getShirt()
    {
        return this.dataManager.get(SHIRT);
    }
    
    public boolean getFlag()
    {
        return this.flag;
    }
}

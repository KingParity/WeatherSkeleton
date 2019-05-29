package com.william.weatherskeleton.entity;

import com.william.weatherskeleton.init.WeatherItems;
import com.william.weatherskeleton.init.WeatherLootTables;
import com.william.weatherskeleton.init.WeatherSounds;
import com.william.weatherskeleton.network.MessageWeatherSkeleton;
import com.william.weatherskeleton.network.PacketHandler;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.*;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.Random;

public class EntityWeatherSkeleton extends EntityCreature
{
    private static final DataParameter<Integer> HAT = EntityDataManager.createKey(EntityWeatherSkeleton.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> HEAD = EntityDataManager.createKey(EntityWeatherSkeleton.class, DataSerializers.VARINT);
    private static final DataParameter<Integer> SHIRT = EntityDataManager.createKey(EntityWeatherSkeleton.class, DataSerializers.VARINT);
    
    public EntityWeatherSkeleton(World worldIn)
    {
        super(worldIn);
        this.setSize(0.6F, 2.1F);
        this.setCanPickUpLoot(true);
    }
    
    @Override
    protected void entityInit()
    {
        super.entityInit();
        this.dataManager.register(HAT, 1);
        this.dataManager.register(HEAD, 1);
        this.dataManager.register(SHIRT, 1);
    }
    
    @Override
    protected void initEntityAI()
    {
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIAvoidEntity(this, EntityWolf.class, 6.0F, 1.0D, 1.2D));
        this.tasks.addTask(2, new EntityAIWanderAvoidWater(this, 0.6D));
        this.tasks.addTask(3, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
        this.tasks.addTask(4, new EntityAILookIdle(this));
    }
    
    @Override
    protected ResourceLocation getLootTable()
    {
        return WeatherLootTables.WEATHER_SKELETON;
    }
    
    @Override
    protected SoundEvent getAmbientSound()
    {
        return SoundEvents.ENTITY_SKELETON_AMBIENT;
    }
    
    @Override
    protected SoundEvent getHurtSound(DamageSource damageSourceIn)
    {
        return WeatherSounds.getSound("scream");
    }
    
    @Override
    protected SoundEvent getDeathSound()
    {
        //return WeatherSounds.getSound("death_scream");
        return WeatherSounds.getSound("scream");
    }
    
    @Override
    protected void playStepSound(BlockPos pos, Block blockIn)
    {
        this.playSound(SoundEvents.ENTITY_SKELETON_STEP, 0.15F, 1.0F);
    }
    
    @Override
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.25D);
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(20.0D);
    }
    
    @Override
    protected boolean processInteract(EntityPlayer player, EnumHand hand)
    {
        ItemStack itemstack = player.getHeldItem(hand);
        boolean flag = itemstack.getItem() == Items.NAME_TAG;
    
        if(flag)
        {
            itemstack.interactWithEntity(player, this, hand);
            return true;
        }
        else if(!world.isRemote)
        {
            PacketHandler.INSTANCE.sendToServer(new MessageWeatherSkeleton(this.getEntityId()));
        }
        return true;
    }
    
    @Override
    public float getEyeHeight()
    {
        return 1.74F;
    }
    
    @Override
    public void writeEntityToNBT(NBTTagCompound compound)
    {
        super.writeEntityToNBT(compound);
        compound.setInteger("Hat", this.getHat());
        compound.setInteger("Head", this.getHead());
        compound.setInteger("Shirt", this.getShirt());
    }
    
    @Override
    public void readEntityFromNBT(NBTTagCompound compound)
    {
        super.readEntityFromNBT(compound);
        this.setHat(compound.getInteger("Hat"));
        this.setHead(compound.getInteger("Head"));
        this.setShirt(compound.getInteger("Shirt"));
        
        this.setCanPickUpLoot(true);
    }
    
    @Nullable
    @Override
    public IEntityLivingData onInitialSpawn(DifficultyInstance difficulty, @Nullable IEntityLivingData livingdata)
    {
        livingdata = super.onInitialSpawn(difficulty, livingdata);
        this.setHat(getRandomHat(this.world.rand));
        this.setHead(getRandomHead(this.world.rand));
        this.setShirt(getRandomShirt(this.world.rand));
        if(this.world.rand.nextInt(10) > 8)
        {
            this.replaceItemInInventory(98, new ItemStack(WeatherItems.KOA_SWORD));
        }
        return livingdata;
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
}
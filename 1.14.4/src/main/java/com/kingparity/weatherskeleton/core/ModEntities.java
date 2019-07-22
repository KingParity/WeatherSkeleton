package com.kingparity.weatherskeleton.core;

import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import com.kingparity.weatherskeleton.names.EntityNames;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.LinkedList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEntities
{
    @ObjectHolder(EntityNames.WEATHER_SKELETON)
    public static final EntityType<WeatherSkeletonEntity> WEATHER_SKELETON = null;
    
    private static final List<EntityType<?>> ENTITY_TYPES = new LinkedList<>();
    
    @SubscribeEvent
    public static void registerEntities(final RegistryEvent.Register<EntityType<?>> event)
    {
        register(WeatherSkeletonEntity::new, EntityClassification.AMBIENT, EntityNames.WEATHER_SKELETON, 50, 0.6F, 2.1F, 5, 1, 1, BiomeDictionary.Type.END, BiomeDictionary.Type.NETHER);
        
        ENTITY_TYPES.forEach(entityType -> event.getRegistry().register(entityType));
    }
    
    private static <T extends Entity> void register(EntityType.IFactory<T> factory, EntityClassification classification, String name, int range, float width, float height, int weight, int minGroupCount, int maxGroupCount, BiomeDictionary.Type... types)
    {
        EntityType<T> type = EntityType.Builder.create(factory, classification).size(width, height).setTrackingRange(range).setUpdateInterval(1).setShouldReceiveVelocityUpdates(true).build(name);
        type.setRegistryName(name);
        for(Biome biome : Biome.BIOMES)
        {
            boolean hasType = false;
            for(BiomeDictionary.Type biomeType : types)
            {
                if(BiomeDictionary.hasType(biome, biomeType))
                {
                    hasType = true;
                    break;
                }
            }
            if(hasType)
            {
                continue;
            }
            biome.getSpawns(type.getClassification()).add(new Biome.SpawnListEntry(type, weight, minGroupCount, maxGroupCount));
        }
        ENTITY_TYPES.add(type);
    }
}

package com.kingparity.weatherskeleton.core;

import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import com.kingparity.weatherskeleton.names.EntityNames;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
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
        register(WeatherSkeletonEntity::new, EntityClassification.MONSTER, EntityNames.WEATHER_SKELETON, 50, 0.6F, 2.1F);
        
        ENTITY_TYPES.forEach(entityType -> event.getRegistry().register(entityType));
    }
    
    private static <T extends Entity> void register(EntityType.IFactory<T> factory, EntityClassification classification, String name, int range, float width, float height)
    {
        register(factory, classification, name, range, 1, true, width, height);
    }
    
    private static <T extends Entity> void register(EntityType.IFactory<T> factory, EntityClassification classification, String name, int range, int updateFrequency, boolean sendVelocityUpdates, float width, float height)
    {
        EntityType<T> type = EntityType.Builder.create(factory, classification).size(width, height).setTrackingRange(range).setUpdateInterval(updateFrequency).setShouldReceiveVelocityUpdates(sendVelocityUpdates).build(Reference.ID + ":" + name);
        type.setRegistryName(name);
        ENTITY_TYPES.add(type);
    }
}

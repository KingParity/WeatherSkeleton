package com.kingparity.weatherskeleton.core;

import com.kingparity.weatherskeleton.WeatherSkeletonMod;
import com.kingparity.weatherskeleton.names.ItemNames;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.LinkedList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModItems
{
    @ObjectHolder(ItemNames.KOA_SWORD)
    public static final Item KOA_SWORD = null;
    
    @ObjectHolder(ItemNames.WEATHER_SKELETON_SPAWN_EGG)
    public static final Item WEATHER_SKELETON_SPAWN_EGG = null;
    
    private static final List<Item> ITEMS = new LinkedList<>();
    
    public static void add(Item item)
    {
        ITEMS.add(item);
    }
    
    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        register(ItemNames.KOA_SWORD);
        
        registerSpawnEgg(ItemNames.WEATHER_SKELETON_SPAWN_EGG, ModEntities.WEATHER_SKELETON, 11437146, 0);
        
        ITEMS.forEach(item -> event.getRegistry().register(item));
    }
    
    private static void register(String name)
    {
        register(name, new Item(new Item.Properties().group(WeatherSkeletonMod.GROUP)));
    }
    
    private static void registerSpawnEgg(String name, EntityType entity, int primary, int secondary)
    {
        register(name, new SpawnEggItem(entity, primary, secondary, new Item.Properties().group(WeatherSkeletonMod.GROUP)));
    }
    
    private static void register(String name, Item item)
    {
        item.setRegistryName(name);
        ITEMS.add(item);
    }
}

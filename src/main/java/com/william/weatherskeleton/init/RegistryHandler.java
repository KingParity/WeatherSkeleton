package com.william.weatherskeleton.init;

import com.william.weatherskeleton.util.Reference;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

import java.util.LinkedList;
import java.util.List;

public class RegistryHandler
{
    @Mod.EventBusSubscriber(modid = Reference.ID)
    public static class Items
    {
        private static final List<Item> ITEMS = new LinkedList<>();

        public static void add(Item item)
        {
            ITEMS.add(item);
        }

        public static List<Item> getItems()
        {
            return ITEMS;
        }

        @SubscribeEvent
        public static void register(final RegistryEvent.Register<Item> event)
        {
            ITEMS.forEach(item -> event.getRegistry().register(item));
        }
    }

    @Mod.EventBusSubscriber(modid = Reference.ID)
    public static class Blocks
    {
        private static final List<Block> BLOCKS = new LinkedList<>();

        public static void add(Block block)
        {
            BLOCKS.add(block);
        }

        public static List<Block> getBlocks()
        {
            return BLOCKS;
        }

        @SubscribeEvent
        public static void register(final RegistryEvent.Register<Block> event)
        {
            BLOCKS.forEach(block -> event.getRegistry().register(block));
        }
    }

    @Mod.EventBusSubscriber(modid = Reference.ID, value = Side.CLIENT)
    public static class Models
    {
        @SubscribeEvent
        public static void register(ModelRegistryEvent event)
        {
            RegistryHandler.Items.ITEMS.forEach(RegistryHandler.Models::registerRender);
        }
    
        private static void registerRender(Item item)
        {
            ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
        }
    }
    
    @Mod.EventBusSubscriber(modid = Reference.ID)
    public static class Sounds
    {
        private static final List<SoundEvent> SOUNDS = new LinkedList<>();
        
        static void add(SoundEvent sound)
        {
            SOUNDS.add(sound);
        }
        
        @SubscribeEvent
        public static void registerSounds(final RegistryEvent.Register<SoundEvent> event)
        {
            SOUNDS.forEach(sound -> event.getRegistry().register(sound));
        }
    }
    
    public static void init()
    {
        WeatherItems.register();
        WeatherSounds.register();
        
        WeatherEntities.registerEntities();
    }
}
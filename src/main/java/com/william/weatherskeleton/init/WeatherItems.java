package com.william.weatherskeleton.init;

import com.william.weatherskeleton.WeatherSkeleton;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WeatherItems
{
    public static Item BONEFOOT, NOLEGS, PEG;
    
    public static void register()
    {
        register(BONEFOOT = new Item(), "bonefoot", WeatherSkeleton.tabWeather);
        register(NOLEGS = new Item(), "nolegs", WeatherSkeleton.tabWeather);
        register(PEG = new Item(), "peg", WeatherSkeleton.tabWeather);
    }
    
    private static void register(Item item, String name, CreativeTabs tab)
    {
        item.setCreativeTab(tab);
        register(item, name);
    }
    
    private static void register(Item item, String name)
    {
        item.setUnlocalizedName(name);
        item.setRegistryName(name);
        RegistryHandler.Items.add(item);
    }
}

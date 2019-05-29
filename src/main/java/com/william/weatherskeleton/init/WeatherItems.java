package com.william.weatherskeleton.init;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class WeatherItems
{
    public static Item KOA_SWORD;
    
    public static void register()
    {
        register(KOA_SWORD = new Item(), "koa_sword", CreativeTabs.COMBAT);
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

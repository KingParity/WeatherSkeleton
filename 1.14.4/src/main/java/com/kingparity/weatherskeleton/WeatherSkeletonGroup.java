package com.kingparity.weatherskeleton;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

public class WeatherSkeletonGroup extends ItemGroup
{
    public WeatherSkeletonGroup(String label)
    {
        super(label);
    }
    
    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(Items.FEATHER);
    }
}
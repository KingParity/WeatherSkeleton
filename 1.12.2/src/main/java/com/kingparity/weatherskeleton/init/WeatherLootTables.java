package com.kingparity.weatherskeleton.init;

import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class WeatherLootTables
{
    public static final ResourceLocation WEATHER_SKELETON = LootTableList.register(new ResourceLocation(Reference.ID, "weather_skeleton"));
}

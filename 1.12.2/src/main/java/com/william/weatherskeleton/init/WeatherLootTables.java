package com.william.weatherskeleton.init;

import com.william.weatherskeleton.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootTableList;

public class WeatherLootTables
{
    public static final ResourceLocation WEATHER_SKELETON = LootTableList.register(new ResourceLocation(Reference.ID, "weather_skeleton"));
}

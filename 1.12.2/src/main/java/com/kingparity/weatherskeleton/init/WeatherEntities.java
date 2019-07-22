package com.kingparity.weatherskeleton.init;

import com.kingparity.weatherskeleton.WeatherSkeleton;
import com.kingparity.weatherskeleton.entity.EntityWeatherSkeleton;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEnd;
import net.minecraft.world.biome.BiomeHell;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class WeatherEntities
{
    public static void registerEntities()
    {
        register("weather_skeleton", EntityWeatherSkeleton.class, 201, 50, 11437146, 00000000);
        addSpawns();
    }
    
    private static void register(String name, Class entity, int id, int range, int color1, int color2)
    {
        EntityRegistry.registerModEntity(new ResourceLocation(Reference.ID + ":" + name), entity, name, id, WeatherSkeleton.instance, range, 1, true, color1, color2);
    }
    
    private static void addSpawns()
    {
        copySpawns(EntityWeatherSkeleton.class, EnumCreatureType.AMBIENT, EntitySkeleton.class, EnumCreatureType.AMBIENT);
    }
    
    private static void copySpawns(final Class classToAdd, final EnumCreatureType creatureTypeToAdd, final Class classToCopy, final EnumCreatureType creatureTypeToCopy)
    {
        for(Biome biome : ForgeRegistries.BIOMES)
        {
            if(!(biome instanceof BiomeEnd) && !(biome instanceof BiomeHell))
            {
                //Creature type the weather skeleton is and what creature to copy from
                biome.getSpawnableList(creatureTypeToCopy).stream().filter(entry -> entry.entityClass == classToCopy).findFirst().ifPresent(spawnListEntry ->
                        //Creature type to add
                        biome.getSpawnableList(creatureTypeToAdd)
                                //Adds the weather skeleton to the biome's spawnable
                                .add(new Biome.SpawnListEntry(classToAdd, 5, 1, 1)));
            }
        }
    }
}
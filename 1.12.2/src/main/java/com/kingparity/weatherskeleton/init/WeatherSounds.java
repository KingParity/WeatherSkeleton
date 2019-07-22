package com.kingparity.weatherskeleton.init;

import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

public class WeatherSounds
{
    private static final Map<String, SoundEvent> SOUNDS = new HashMap<>();
    
    public static SoundEvent scream;
    
    static
    {
        register("scream");
    }
    
    private static void register(String name)
    {
        if(!SOUNDS.containsKey(name))
        {
            ResourceLocation sound = new ResourceLocation(Reference.ID, name);
            SoundEvent event = new SoundEvent(sound).setRegistryName(name);
            SOUNDS.put(name, event);
        }
    }
    
    public static void register()
    {
        SOUNDS.values().forEach(RegistryHandler.Sounds::add);
    }
    
    @Nullable
    public static SoundEvent getSound(String name)
    {
        return SOUNDS.get(name);
    }
}

package com.kingparity.weatherskeleton.core;

import com.kingparity.weatherskeleton.names.SoundNames;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ObjectHolder;

import java.util.ArrayList;
import java.util.List;

@Mod.EventBusSubscriber(modid = Reference.ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModSounds
{
    @ObjectHolder(SoundNames.SCREAM)
    public static final SoundEvent SCREAM = null;
    
    private static final List<SoundEvent> SOUND_EVENTS = new ArrayList<>();
    
    @SubscribeEvent
    public static void registerSoundEvents(final RegistryEvent.Register<SoundEvent> event)
    {
        register(SoundNames.SCREAM);
        
        SOUND_EVENTS.forEach(soundEvent -> event.getRegistry().register(soundEvent));
    }
    
    private static void register(String name)
    {
        SoundEvent event = new SoundEvent(new ResourceLocation(name));
        event.setRegistryName(name);
        SOUND_EVENTS.add(event);
    }
}

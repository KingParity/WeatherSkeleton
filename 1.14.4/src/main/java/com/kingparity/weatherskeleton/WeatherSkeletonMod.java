package com.kingparity.weatherskeleton;

import com.kingparity.weatherskeleton.network.PacketHandler;
import com.kingparity.weatherskeleton.proxy.ClientProxy;
import com.kingparity.weatherskeleton.proxy.CommonProxy;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.DeferredWorkQueue;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(Reference.ID)
public class WeatherSkeletonMod
{
    public static final Logger LOGGER = LogManager.getLogger(Reference.ID);
    public static final ItemGroup GROUP = new WeatherSkeletonGroup(Reference.ID);
    public static final CommonProxy PROXY = DistExecutor.runForDist(() -> ClientProxy::new, () -> CommonProxy::new);

    public WeatherSkeletonMod()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onCommonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::onClientSetup);
    
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    private void onCommonSetup(final FMLCommonSetupEvent event)
    {
        DeferredWorkQueue.runLater(PacketHandler::register);
        
        PROXY.onSetupCommon();
        LOGGER.debug("onCommonSetup method registered");
    }
    
    private void onClientSetup(final FMLClientSetupEvent event)
    {
        PROXY.onSetupClient();
        LOGGER.debug("onClientSetup method registered");
    }
}
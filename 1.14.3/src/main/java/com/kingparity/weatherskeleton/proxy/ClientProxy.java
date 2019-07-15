package com.kingparity.weatherskeleton.proxy;

import com.kingparity.weatherskeleton.client.renderer.WeatherSkeletonRenderer;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy extends CommonProxy
{
    @Override
    public void onSetupClient()
    {
        MinecraftForge.EVENT_BUS.register(this);
        
        RenderingRegistry.registerEntityRenderingHandler(WeatherSkeletonEntity.class, WeatherSkeletonRenderer::new);
    }
}

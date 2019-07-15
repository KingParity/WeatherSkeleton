package com.william.weatherskeleton.proxy;

import com.william.weatherskeleton.client.render.RenderWeatherSkeleton;
import com.william.weatherskeleton.entity.EntityWeatherSkeleton;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class ClientProxy implements IProxy
{
	@Override
	public void preInit()
	{
		MinecraftForge.EVENT_BUS.register(this);
		
		RenderingRegistry.registerEntityRenderingHandler(EntityWeatherSkeleton.class, (RenderManager manager) -> new RenderWeatherSkeleton(manager));
		//RenderingRegistry.registerEntityRenderingHandler(EntityWeatherSkeletonDev.class, (RenderManager manager) -> new RenderWeatherSkeletonDev(manager));
	}
	
	@Override
	public void init()
	{
	
	}
}

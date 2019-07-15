package com.william.weatherskeleton.proxy;

import net.minecraftforge.common.MinecraftForge;

public class ServerProxy implements IProxy
{
    @Override
    public void preInit()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    @Override
    public void init()
    {
    
    }
}

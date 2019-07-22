package com.kingparity.weatherskeleton.proxy;

import net.minecraftforge.common.MinecraftForge;

public class CommonProxy
{
    public void onSetupCommon()
    {
        MinecraftForge.EVENT_BUS.register(this);
    }
    
    public void onSetupClient() {}
}

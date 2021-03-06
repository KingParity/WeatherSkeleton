package com.kingparity.weatherskeleton.network;

import com.kingparity.weatherskeleton.util.Reference;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

public class PacketHandler
{
    public static final SimpleNetworkWrapper INSTANCE = NetworkRegistry.INSTANCE.newSimpleChannel(Reference.ID);
    private static int messageId = 0;
    
    private static enum Side
    {
        CLIENT, SERVER, BOTH;
    }
    
    public static void init()
    {
        registerMessage(MessageWeatherSkeleton.class, Side.SERVER);
    }
    
    private static void registerMessage(Class packet, Side side)
    {
        if(side != Side.CLIENT)
            registerMessage(packet, net.minecraftforge.fml.relauncher.Side.SERVER);
        if(side != Side.SERVER)
            registerMessage(packet, net.minecraftforge.fml.relauncher.Side.CLIENT);
    }
    
    private static void registerMessage(Class packet, net.minecraftforge.fml.relauncher.Side side)
    {
        INSTANCE.registerMessage(packet, packet, messageId++, side);
    }
}

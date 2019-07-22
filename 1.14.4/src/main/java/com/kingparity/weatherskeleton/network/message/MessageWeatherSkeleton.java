package com.kingparity.weatherskeleton.network.message;

import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.network.PacketBuffer;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TextFormatting;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.fml.network.NetworkEvent;

import java.util.function.Supplier;

public class MessageWeatherSkeleton
{
    private int entityId;
    
    public MessageWeatherSkeleton(int entityId)
    {
        this.entityId = entityId;
    }
    
    public static void encode(MessageWeatherSkeleton pkt, PacketBuffer buf)
    {
        buf.writeVarInt(pkt.entityId);
    }
    
    public static MessageWeatherSkeleton decode(PacketBuffer buf)
    {
        int entityId = buf.readVarInt();
        return new MessageWeatherSkeleton(entityId);
    }
    
    //onMessage
    public static class Handler
    {
        public static void handle(final MessageWeatherSkeleton pkt, Supplier<NetworkEvent.Context> ctx)
        {
            ctx.get().enqueueWork(() -> {
                ServerPlayerEntity player = ctx.get().getSender();
                World world = player.world;
                Entity targetEntity = world.getEntityByID(pkt.entityId);
                if(targetEntity instanceof WeatherSkeletonEntity)
                {
                    ITextComponent message = new StringTextComponent("bobmbombo");
                    String output;
                    boolean isDaytime;
                    if(world.rand.nextInt(2) == 0)
                    {
                        output = "Howdy ho, Budrow Billson! ";
                    }
                    else
                    {
                        output = "Hawdy hey, Budrow Billson! ";
                    }
                    if(world.getGameTime() > 22500 || world.getGameTime() <= 1000)
                    {
                        output += "Welcome to the waking hours. Good on you for finding the will to get out of bed. ";
                        isDaytime = true;
                    }
                    else if(world.getGameTime() > 1000 && world.getGameTime() <= 10000)
                    {
                        output += "It's just about noon ";
                        isDaytime = true;
                    }
                    else if(world.getGameTime() > 10000 && world.getGameTime() <= 12500)
                    {
                        output += "It's supper time ";
                        isDaytime = false;
                    }
                    else
                    {
                        output += "It's right about midnight ";
                        isDaytime = false;
                    }
        
                    if(world.isThundering())
                    {
                        output += "and there's a hell of a storm brewing topside";
                    }
                    else if(world.isRaining())
                    {
                        output += "and if you're fixing fish, the rain will rile them up for a bite too";
                    }
                    else if(isDaytime)
                    {
                        output += "and the sun is shining like there's no tomorrow";
                    }
                    else
                    {
                        if(world.rand.nextInt(30) < 29)
                        {
                            output += "and I have no clue what the hell to say about the weather";
                        }
                        else
                        {
                            output += "and the sky's so clear you can see every star in the heavens";
                        }
                    }
                    
                    player.sendMessage((new TranslationTextComponent(output, player.getDisplayName(), message.deepCopy())).applyTextStyle(TextFormatting.GRAY));
                }
            });
            ctx.get().setPacketHandled(true);
        }
    }
}

package com.kingparity.weatherskeleton.network;

import com.kingparity.weatherskeleton.entity.EntityWeatherSkeleton;
import io.netty.buffer.ByteBuf;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.simpleimpl.IMessage;
import net.minecraftforge.fml.common.network.simpleimpl.IMessageHandler;
import net.minecraftforge.fml.common.network.simpleimpl.MessageContext;

public class MessageWeatherSkeleton implements IMessage, IMessageHandler<MessageWeatherSkeleton, IMessage>
{
    private int entityId;
    
    public MessageWeatherSkeleton() {}
    
    public MessageWeatherSkeleton(int entityId)
    {
        this.entityId = entityId;
    }
    
    @Override
    public void toBytes(ByteBuf buf)
    {
        buf.writeInt(this.entityId);
    }
    
    @Override
    public void fromBytes(ByteBuf buf)
    {
        this.entityId = buf.readInt();
    }
    
    @Override
    public IMessage onMessage(MessageWeatherSkeleton message, MessageContext ctx)
    {
        EntityPlayerMP player = ctx.getServerHandler().player;
        World world = player.world;
        Entity targetEntity = world.getEntityByID(message.entityId);
        if(targetEntity instanceof EntityWeatherSkeleton)
        {
            ITextComponent iTextComponent = new TextComponentString("bobmbombo");
            String output;
            boolean isDaytime = true;
            if(world.rand.nextInt(2) == 0)
            {
                output = "Howdy ho, Budrow Billson! ";
            }
            else
            {
                output = "Hawdy hey, Budrow Billson! ";
            }
            if(world.getWorldTime() > 22500 || world.getWorldTime() <= 1000)
            {
                output += "Welcome to the waking hours. Good on you for finding the will to get out of bed. ";
                isDaytime = true;
            }
            else if(world.getWorldTime() > 1000 && world.getWorldTime() <= 10000)
            {
                output += "It's just about noon ";
                isDaytime = true;
            }
            else if(world.getWorldTime() > 10000 && world.getWorldTime() <= 12500)
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
            
            TextComponentTranslation textComponentTranslation = new TextComponentTranslation(output, new Object[] {new TextComponentString("fg"), iTextComponent.createCopy()});
            player.sendMessage(textComponentTranslation);
        }
        return null;
    }
}

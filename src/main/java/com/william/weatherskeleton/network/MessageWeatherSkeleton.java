package com.william.weatherskeleton.network;

import com.william.weatherskeleton.entity.EntityWeatherSkeleton;
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
            String output = "Hello " + player.getDisplayName().getFormattedText() + "! ";
            if(world.getWorldTime() > 22500 || world.getWorldTime() <= 1000)
            {
                output += "It's morning";
            }
            else if(world.getWorldTime() > 1000 && world.getWorldTime() <= 10000)
            {
                output += "It's midday";
            }
            else if(world.getWorldTime() > 10000 && world.getWorldTime() <= 12500)
            {
                output += "It's evening";
            }
            else
            {
                output += "It's nighttime";
            }
            
            if(world.isThundering())
            {
                output += " and it's thundering";
            }
            else if(world.isRaining())
            {
                output += " and it's raining";
            }
            TextComponentTranslation textComponentTranslation = new TextComponentTranslation(output, new Object[] {new TextComponentString("fg"), iTextComponent.createCopy()});
            player.sendMessage(textComponentTranslation);
        }
        return null;
    }
}

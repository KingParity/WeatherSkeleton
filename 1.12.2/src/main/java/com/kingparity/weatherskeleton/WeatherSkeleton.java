package com.kingparity.weatherskeleton;

import com.kingparity.weatherskeleton.init.RegistryHandler;
import com.kingparity.weatherskeleton.network.PacketHandler;
import com.kingparity.weatherskeleton.proxy.IProxy;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.ID, name = Reference.NAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class WeatherSkeleton
{
	@Instance(Reference.ID)
	public static WeatherSkeleton instance;
	
	public int nextEntityId;
	
	@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
	public static IProxy proxy;
	
	public static final CreativeTabs tabWeather = new CreativeTabs("tabWeather")
	{
		@Override
		public ItemStack getTabIconItem()
		{
			return new ItemStack(Items.FEATHER);
		}
	};

	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		RegistryHandler.init();
		PacketHandler.init();
		
		proxy.preInit();
	}

	@EventHandler
	public void init(FMLInitializationEvent event)
	{
		proxy.init();
	}
}

package com.william.weatherskeleton.util;

import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.network.datasync.DataParameter;
import net.minecraft.network.datasync.DataSerializers;
import net.minecraft.network.datasync.EntityDataManager;

public class Reference
{	
	public static final String NAME = "Weather Skeleton";
	public static final String VERSION = "indev";
	public static final String ID = "weatherskeleton";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	
	public static final String PROXY_CLIENT = "com.william.weatherskeleton.proxy.ClientProxy";
	public static final String PROXY_SERVER = "com.william.weatherskeleton.proxy.ServerProxy";
}

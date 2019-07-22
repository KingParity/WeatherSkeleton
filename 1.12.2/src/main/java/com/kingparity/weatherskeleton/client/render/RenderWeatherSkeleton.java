package com.kingparity.weatherskeleton.client.render;

import com.kingparity.weatherskeleton.client.layer.LayerWSHeldItem;
import com.kingparity.weatherskeleton.client.layer.LayerWSParts;
import com.kingparity.weatherskeleton.client.model.ModelWeatherSkeleton;
import com.kingparity.weatherskeleton.entity.EntityWeatherSkeleton;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;

public class RenderWeatherSkeleton extends RenderLiving<EntityWeatherSkeleton>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.ID + ":textures/entity/weather_skeleton.png");
    
    public RenderWeatherSkeleton(RenderManager manager)
    {
        super(manager, new ModelWeatherSkeleton(), 0.5F);
        this.addLayer(new LayerWSParts(this));
        this.addLayer(new LayerWSHeldItem(this));
    }
    
    @Override
    protected ResourceLocation getEntityTexture(EntityWeatherSkeleton entity)
    {
        return TEXTURES;
    }
    
    @Override
    protected void applyRotations(EntityWeatherSkeleton entityLiving, float p_77043_2_, float rotationYaw, float partialTicks)
    {
        super.applyRotations(entityLiving, p_77043_2_, rotationYaw, partialTicks);
    }
}
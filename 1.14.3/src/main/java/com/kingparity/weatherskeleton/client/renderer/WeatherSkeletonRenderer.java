package com.kingparity.weatherskeleton.client.renderer;

import com.kingparity.weatherskeleton.client.layer.WeatherSkeletonHeldItemLayer;
import com.kingparity.weatherskeleton.client.layer.WeatherSkeletonPartsLayer;
import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.client.renderer.entity.EntityRendererManager;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.util.ResourceLocation;

public class WeatherSkeletonRenderer extends MobRenderer<WeatherSkeletonEntity, WeatherSkeletonModel<WeatherSkeletonEntity>>
{
    public static final ResourceLocation TEXTURES = new ResourceLocation(Reference.ID + ":textures/entity/weather_skeleton.png");
    
    public WeatherSkeletonRenderer(EntityRendererManager manager)
    {
        super(manager, new WeatherSkeletonModel<>(), 0.5F);
        this.addLayer(new WeatherSkeletonPartsLayer(this));
        this.addLayer(new WeatherSkeletonHeldItemLayer(this));
    }
    
    @Override
    protected ResourceLocation getEntityTexture(WeatherSkeletonEntity weatherSkeleton)
    {
        return TEXTURES;
    }
}
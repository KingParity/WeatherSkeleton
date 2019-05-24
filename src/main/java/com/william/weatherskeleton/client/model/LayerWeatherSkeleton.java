package com.william.weatherskeleton.client.model;

import com.william.weatherskeleton.client.render.RenderWeatherSkeleton;
import com.william.weatherskeleton.entity.EntityWeatherSkeleton;
import com.william.weatherskeleton.util.Reference;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class LayerWeatherSkeleton implements LayerRenderer<EntityWeatherSkeleton>
{
    private final RenderWeatherSkeleton renderer;
    private ModelWeatherSkeleton hat, head, shirt;
    
    public LayerWeatherSkeleton(RenderWeatherSkeleton rendererIn)
    {
        this.renderer = rendererIn;
    }
    
    @Override
    public void doRenderLayer(EntityWeatherSkeleton entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        this.renderer.bindTexture(new ResourceLocation(Reference.ID + ":textures/entity/weather_skeleton.png"));
    
        switch(entitylivingbaseIn.getHat())
        {
            case 0:
                this.hat = new ModelWhiteHat();
                break;
            case 1:
                this.hat = new ModelTanHat();
                break;
            case 2:
                this.hat = new ModelTanHat2();
                break;
            default:
                this.hat = new ModelBlackHat();
                break;
        }
    
        switch(entitylivingbaseIn.getHead())
        {
            case 0:
                this.head = new ModelHead2();
                break;
            case 1:
                this.head = new ModelHead3();
                break;
            case 2:
                this.head = new ModelHead4();
                break;
            default:
                this.head = new ModelHead1();
                break;
        }
    
        switch(entitylivingbaseIn.getShirt())
        {
            case 0:
                this.shirt = new ModelRedShirt();
                break;
            case 1:
                this.shirt = new ModelCCShirt();
                break;
            case 2:
                this.shirt = new ModelCCShirt2();
                break;
            case 3:
                this.shirt = new ModelVSShirt();
                break;
            case 4:
                this.shirt = new ModelBLShirt();
                break;
            default:
                this.shirt = new ModelNoShirt();
                break;
        }
        
        this.hat.setModelAttributes(this.renderer.getMainModel());
        this.hat.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
        this.hat.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        
        this.head.setModelAttributes(this.renderer.getMainModel());
        this.head.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
        this.head.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        
        this.shirt.setModelAttributes(this.renderer.getMainModel());
        this.shirt.setLivingAnimations(entitylivingbaseIn, limbSwing, limbSwingAmount, partialTicks);
        this.shirt.render(entitylivingbaseIn, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    }
    
    @Override
    public boolean shouldCombineTextures()
    {
        return true;
    }
}
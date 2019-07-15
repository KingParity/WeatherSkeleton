package com.kingparity.weatherskeleton.client.layer;

import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.client.model.accessories.*;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;

public class WeatherSkeletonPartsLayer extends LayerRenderer<WeatherSkeletonEntity, WeatherSkeletonModel<WeatherSkeletonEntity>>
{
    private WeatherSkeletonModel hat, head, shirt;
    
    public WeatherSkeletonPartsLayer(IEntityRenderer<WeatherSkeletonEntity, WeatherSkeletonModel<WeatherSkeletonEntity>> model)
    {
        super(model);
    }
    
    @Override
    public void render(WeatherSkeletonEntity weatherSkeleton, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        this.bindTexture(new ResourceLocation(Reference.ID + ":textures/entity/weather_skeleton.png"));
    
        switch(weatherSkeleton.getHat())
        {
            case 0:
                this.hat = new ModelHatStrawWhite();
                break;
            case 1:
                this.hat = new ModelHatTan();
                break;
            case 2:
                this.hat = new ModelHatStrawTan();
                break;
            case 3:
                this.hat = new ModelHatBlack();
                break;
            default:
                this.hat = new ModelHatStrawBlack();
                break;
        }
    
        switch(weatherSkeleton.getHead())
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
            case 3:
                this.head = new ModelHead5();
                break;
            default:
                this.head = new ModelHead1();
                break;
        }
    
        switch(weatherSkeleton.getShirt())
        {
            case 0:
                this.shirt = new ModelShirtRed();
                break;
            case 1:
                this.shirt = new ModelShirtCC();
                break;
            case 2:
                this.shirt = new ModelShirtCCSwirl();
                break;
            case 3:
                this.shirt = new ModelShirtVS();
                break;
            case 4:
                this.shirt = new ModelShirtBL();
                break;
            case 5:
                this.shirt = new ModelShirtSS();
                break;
            case 6:
                this.shirt = new ModelShirtFL();
                break;
            default:
                this.shirt = new ModelShirtNone();
                break;
        }
        
        this.hat.setModelAttributes(this.getEntityModel());
        this.hat.setLivingAnimations(weatherSkeleton, limbSwing, limbSwingAmount, partialTicks);
        this.hat.render(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        
        this.head.setModelAttributes(this.getEntityModel());
        this.head.setLivingAnimations(weatherSkeleton, limbSwing, limbSwingAmount, partialTicks);
        this.head.render(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    
        this.shirt.setModelAttributes(this.getEntityModel());
        this.shirt.setLivingAnimations(weatherSkeleton, limbSwing, limbSwingAmount, partialTicks);
        this.shirt.render(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    }
    
    @Override
    public boolean shouldCombineTextures()
    {
        return true;
    }
}
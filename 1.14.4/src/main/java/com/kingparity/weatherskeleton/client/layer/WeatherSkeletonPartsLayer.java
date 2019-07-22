package com.kingparity.weatherskeleton.client.layer;

import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.client.model.accessories.*;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import com.kingparity.weatherskeleton.util.Reference;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class WeatherSkeletonPartsLayer extends LayerRenderer<WeatherSkeletonEntity, WeatherSkeletonModel<WeatherSkeletonEntity>>
{
    private WeatherSkeletonModel<WeatherSkeletonEntity> hat, head, shirt;
    
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
                this.hat = new HatStrawWhiteModel();
                break;
            case 1:
                this.hat = new HatTanModel();
                break;
            case 2:
                this.hat = new HatStrawTanModel();
                break;
            case 3:
                this.hat = new HatBlackModel();
                break;
            default:
                this.hat = new HatStrawBlackModel();
                break;
        }
    
        switch(weatherSkeleton.getHead())
        {
            case 0:
                this.head = new Head2Model();
                break;
            case 1:
                this.head = new Head3Model();
                break;
            case 2:
                this.head = new Head4Model();
                break;
            case 3:
                this.head = new Head5Model();
                break;
            default:
                this.head = new Head1Model();
                break;
        }
    
        switch(weatherSkeleton.getShirt())
        {
            case 0:
                this.shirt = new ShirtRedModel<>();
                break;
            case 1:
                this.shirt = new ShirtCCModel<>();
                break;
            case 2:
                this.shirt = new ShirtCCSwirlModel<>();
                break;
            case 3:
                this.shirt = new ShirtVSModel<>();
                break;
            case 4:
                this.shirt = new ShirtBLModel<>();
                break;
            case 5:
                this.shirt = new ShirtSSModel<>();
                break;
            case 6:
                this.shirt = new ShirtFLModel<>();
                break;
            default:
                this.shirt = new ShirtNoneModel<>();
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
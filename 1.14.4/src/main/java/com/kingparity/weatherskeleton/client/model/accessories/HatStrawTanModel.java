package com.kingparity.weatherskeleton.client.model.accessories;

import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class HatStrawTanModel<T extends WeatherSkeletonEntity> extends WeatherSkeletonModel<T>
{
    public HatStrawTanModel()
    {
        textureWidth = 244;
        textureHeight = 195;
        
        hat = new RendererModel(this);
        hat.setRotationPoint(0.0F, 1.0F, 0.0F);
        hat.cubeList.add(new ModelBox(hat, 210, 19, -5.0F, -6.0F, -5.0F, 1, 1, 10, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 208, 19, -6.0F, -6.0F, -4.0F, 1, 1, 8, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 215, 22, -7.0F, -6.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 208, 32, -4.0F, -6.0F, -6.0F, 8, 1, 2, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 214, 23, -2.0F, -6.0F, -7.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 216, 21, 6.0F, -6.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 208, 19, 5.0F, -6.0F, -4.0F, 1, 1, 8, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 208, 19, 4.0F, -6.0F, -5.0F, 1, 1, 10, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 208, 21, -4.0F, -6.0F, 4.0F, 8, 1, 2, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 215, 22, -2.0F, -6.0F, 6.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 115, 58, -3.0F, -7.0F, 4.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 116, 57, -4.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 110, 56, -5.0F, -7.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 111, 59, -4.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 100, 60, -3.0F, -7.0F, -5.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 113, 57, 3.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 116, 59, 4.0F, -7.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 115, 57, 3.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 220, 24, 3.0F, -8.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 212, 19, 3.0F, -9.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 212, 20, 4.0F, -8.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 212, 21, -3.0F, -8.0F, 4.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 219, 25, -4.0F, -8.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 214, 19, -5.0F, -8.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 217, 22, -4.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 213, 20, -3.0F, -8.0F, -5.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 218, 23, 3.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 213, 24, -2.0F, -10.0F, -3.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 214, 22, 2.0F, -10.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 213, 23, -2.0F, -10.0F, -2.0F, 4, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 214, 23, -2.0F, -10.0F, 2.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 218, 20, -3.0F, -10.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 214, 19, -4.0F, -9.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 207, 17, -3.0F, -9.0F, -4.0F, 6, 1, 8, 0.0F, false));
    }
    
    @Override
    public void setRotationAngles(T weatherSkeleton, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        super.setRotationAngles(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }
}

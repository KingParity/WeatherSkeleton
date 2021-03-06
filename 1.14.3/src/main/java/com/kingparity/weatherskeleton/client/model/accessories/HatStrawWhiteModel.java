package com.kingparity.weatherskeleton.client.model.accessories;

import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class HatStrawWhiteModel<T extends WeatherSkeletonEntity> extends WeatherSkeletonModel<T>
{
    public HatStrawWhiteModel()
    {
        textureWidth = 244;
        textureHeight = 195;
        
        hat = new RendererModel(this);
        hat.setRotationPoint(0.0F, 1.0F, 0.0F);
        hat.cubeList.add(new ModelBox(hat, 204, 112, -5.0F, -6.0F, -5.0F, 1, 1, 10, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 205, 115, -6.0F, -6.0F, -4.0F, 1, 1, 8, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 205, 122, -7.0F, -6.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 116, -4.0F, -6.0F, -6.0F, 8, 1, 2, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 118, -2.0F, -6.0F, -7.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 207, 116, 6.0F, -6.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 205, 118, 5.0F, -6.0F, -4.0F, 1, 1, 8, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 203, 108, 4.0F, -6.0F, -5.0F, 1, 1, 10, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 204, 109, -4.0F, -6.0F, 4.0F, 8, 1, 2, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 221, 118, -2.0F, -6.0F, 6.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 115, 58, -3.0F, -7.0F, 4.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 116, 57, -4.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 110, 56, -5.0F, -7.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 111, 59, -4.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 100, 60, -3.0F, -7.0F, -5.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 113, 57, 3.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 116, 59, 4.0F, -7.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 115, 57, 3.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 104, 3.0F, -8.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 112, 3.0F, -9.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 104, 4.0F, -8.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 104, -3.0F, -8.0F, 4.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 104, -4.0F, -8.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 104, -5.0F, -8.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 104, -4.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 104, -3.0F, -8.0F, -5.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 104, 3.0F, -8.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 112, -2.0F, -10.0F, -3.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 112, 2.0F, -10.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 112, -2.0F, -10.0F, -2.0F, 4, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 112, -2.0F, -10.0F, 2.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 112, -3.0F, -10.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 112, -4.0F, -9.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 202, 112, -3.0F, -9.0F, -4.0F, 6, 1, 8, 0.0F, false));
    }
    
    @Override
    public void setRotationAngles(T weatherSkeleton, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        super.setRotationAngles(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }
}

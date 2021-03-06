package com.kingparity.weatherskeleton.client.model.accessories;


import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class Head3Model<T extends WeatherSkeletonEntity> extends WeatherSkeletonModel<T>
{
    public Head3Model()
    {
        textureWidth = 244;
        textureHeight = 195;
        
        head = new RendererModel(this);
        head.setRotationPoint(0.0F, 1.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -8.0F, -3.0F, 6, 3, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, 2.0F, -2.0F, -4.0F, 1, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -2.0F, -4.0F, 1, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 49, 51, -2.0F, -2.0F, -3.0F, 4, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 21, 25, 2.0F, -3.0F, -4.0F, 1, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 49, 51, 1.0F, -5.0F, -3.0F, 2, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 49, 51, -3.0F, -5.0F, -3.0F, 2, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 59, 61, -3.0F, -3.0F, -3.0F, 1, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -4.0F, -4.0F, 2, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -3.0F, -3.0F, 4, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, 1.0F, -4.0F, -4.0F, 2, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -1.0F, -5.0F, -4.0F, 2, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 16, 0, -3.0F, -8.0F, -4.0F, 6, 3, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -1.0F, -3.0F, 6, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -1.0F, -4.0F, 6, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, 3.0F, -1.0F, -3.0F, 1, 1, 5, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, 3.0F, -2.0F, -3.0F, 1, 1, 6, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, 3.0F, -6.0F, -3.0F, 1, 4, 6, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, 3.0F, -6.0F, -4.0F, 1, 4, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -2.0F, -3.0F, -4.0F, 4, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 49, 51, -1.0F, -4.0F, -3.0F, 2, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -6.0F, -3.0F, 1, 4, 6, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -2.0F, -3.0F, 1, 1, 6, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -1.0F, -3.0F, 1, 1, 5, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 22, 0, -4.0F, -6.0F, -4.0F, 1, 4, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 2, -3.0F, -8.0F, -2.0F, 6, 8, 6, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -4.0F, -6.0F, 3.0F, 1, 4, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, 3.0F, -6.0F, 3.0F, 1, 4, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 73, 153, -2.0F, -2.0F, -6.0F, 1, 1, 3, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 128, 30, -2.0F, -2.0F, -7.0F, 1, 1, 1, 0.0F, false));
    }
    
    @Override
    public void setRotationAngles(T weatherSkeleton, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        super.setRotationAngles(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }
}

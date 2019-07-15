package com.william.weatherskeleton.client.model;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHatBlack extends ModelWeatherSkeleton
{
    public ModelHatBlack()
    {
        textureWidth = 244;
        textureHeight = 195;
    
        hat = new ModelRenderer(this);
        hat.setRotationPoint(0.0F, 1.0F, 0.0F);
        hat.cubeList.add(new ModelBox(hat, 65, 69, -5.0F, -6.0F, -4.0F, 1, 1, 9, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 83, 69, -6.0F, -6.0F, -2.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 63, 72, -4.0F, -6.0F, -5.0F, 8, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 83, 70, -2.0F, -6.0F, -7.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 65, 70, 5.0F, -6.0F, -2.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 64, 68, 4.0F, -6.0F, -4.0F, 1, 1, 9, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 63, 72, -4.0F, -6.0F, 4.0F, 8, 1, 2, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 85, 70, -2.0F, -6.0F, 6.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 115, 58, -3.0F, -7.0F, 4.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 116, 57, -4.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 110, 56, -4.0F, -7.0F, -2.0F, 1, 1, 5, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 111, 59, -4.0F, -7.0F, -4.0F, 1, 1, 2, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 100, 60, -3.0F, -7.0F, -5.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 113, 57, 3.0F, -7.0F, -4.0F, 1, 1, 2, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 116, 59, 3.0F, -7.0F, -2.0F, 1, 1, 5, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 115, 57, 3.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 88, 68, 3.0F, -8.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 83, 70, 3.0F, -9.0F, -2.0F, 1, 1, 5, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 67, 69, 3.0F, -8.0F, -2.0F, 1, 1, 5, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 81, 73, -3.0F, -8.0F, 4.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 86, 73, -4.0F, -8.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 81, 67, -4.0F, -8.0F, -2.0F, 1, 1, 5, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 72, 68, -4.0F, -8.0F, -4.0F, 1, 1, 2, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 66, 71, -3.0F, -8.0F, -5.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 70, 70, 3.0F, -8.0F, -4.0F, 1, 1, 2, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 67, 70, -2.0F, -10.0F, -3.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 84, 72, 2.0F, -10.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 83, 69, -2.0F, -10.0F, -2.0F, 4, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 69, 73, -2.0F, -10.0F, 2.0F, 4, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 85, 70, -3.0F, -10.0F, -2.0F, 1, 1, 4, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 83, 70, -4.0F, -9.0F, -2.0F, 1, 1, 5, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 67, 70, -3.0F, -9.0F, -4.0F, 6, 1, 8, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 62, 75, -3.0F, -6.0F, -6.0F, 6, 1, 1, 0.0F, false));
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    }
}

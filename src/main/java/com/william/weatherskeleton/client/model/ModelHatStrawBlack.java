package com.william.weatherskeleton.client.model;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHatStrawBlack extends ModelWeatherSkeleton
{
    public ModelHatStrawBlack()
    {
        textureWidth = 244;
        textureHeight = 195;
    
        hat = new ModelRenderer(this);
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
        hat.cubeList.add(new ModelBox(hat, 58, 58, -3.0F, -7.0F, 4.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 58, 58, -4.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 58, 58, -5.0F, -7.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 58, 58, -4.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 58, 58, -3.0F, -7.0F, -5.0F, 6, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 58, 58, 3.0F, -7.0F, -4.0F, 1, 1, 1, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 58, 58, 4.0F, -7.0F, -3.0F, 1, 1, 6, 0.0F, false));
        hat.cubeList.add(new ModelBox(hat, 58, 58, 3.0F, -7.0F, 3.0F, 1, 1, 1, 0.0F, false));
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
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    }
}

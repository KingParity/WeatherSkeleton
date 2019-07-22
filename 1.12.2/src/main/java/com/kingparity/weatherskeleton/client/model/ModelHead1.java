package com.kingparity.weatherskeleton.client.model;

import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelHead1 extends ModelWeatherSkeleton
{
    public ModelHead1()
    {
        textureWidth = 244;
        textureHeight = 195;
    
        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 1.0F, 0.0F);
        head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -8.0F, -3.0F, 6, 3, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, 2.0F, -2.0F, -4.0F, 1, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 0, 0, -3.0F, -2.0F, -4.0F, 1, 1, 2, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 49, 51, -2.0F, -2.0F, -3.0F, 4, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 49, 51, 2.0F, -3.0F, -3.0F, 1, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 49, 51, 1.0F, -5.0F, -3.0F, 2, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 49, 51, -3.0F, -5.0F, -3.0F, 2, 1, 1, 0.0F, false));
        head.cubeList.add(new ModelBox(head, 49, 51, -3.0F, -3.0F, -3.0F, 1, 1, 1, 0.0F, false));
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
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        super.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entityIn);
    }
}

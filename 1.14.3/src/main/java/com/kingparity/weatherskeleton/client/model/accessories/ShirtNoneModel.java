package com.kingparity.weatherskeleton.client.model.accessories;
//Made with Blockbench
//Paste this code into your mod.


import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class ShirtNoneModel<T extends WeatherSkeletonEntity> extends WeatherSkeletonModel<T>
{
    public ShirtNoneModel()
    {
        textureWidth = 244;
        textureHeight = 195;
        
        left_arm = new RendererModel(this);
        left_arm.setRotationPoint(5.0F, 3.0F, 0.0F);
        left_arm.cubeList.add(new ModelBox(left_arm, 0, 0, -1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F, false));
        
        right_arm = new RendererModel(this);
        right_arm.setRotationPoint(-5.0F, 3.0F, 0.0F);
        right_arm.cubeList.add(new ModelBox(right_arm, 0, 0, -1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F, false));
        
        main = new RendererModel(this);
        main.setRotationPoint(0.0F, 24.0F, 0.0F);
        main.cubeList.add(new ModelBox(main, 170, 70, -2.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -12.0F, -2.0F, 6, 1, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -13.0F, 1.0F, 6, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -13.0F, -2.0F, 6, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 3.0F, -13.0F, -2.0F, 1, 2, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -13.0F, -2.0F, 1, 2, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -23.0F, 1.0F, 2, 10, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -17.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -17.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -18.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -18.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 165, 72, 3.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 70, 2.0F, -22.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -23.0F, -2.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -23.0F, -2.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -19.0F, -1.0F, 1, 1, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -19.0F, -1.0F, 1, 1, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -19.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -19.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -21.0F, -1.0F, 1, 1, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -19.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 3.0F, -21.0F, -1.0F, 1, 1, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -21.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -21.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -23.0F, -1.0F, 1, 1, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -23.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -23.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 3.0F, -23.0F, -1.0F, 1, 1, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 161, 64, -3.0F, -19.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 161, 64, 1.0F, -19.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 165, 72, -4.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 165, 72, -1.0F, -20.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 2, -3.0F, -20.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 2, 1.0F, -20.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 70, -4.0F, -22.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 70, 1.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, -4.0F, -21.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, 2.0F, -21.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, -1.0F, -21.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, -2.0F, -22.0F, -2.0F, 4, 1, 1, 0.0F, false));
    }
    
    @Override
    public void setRotationAngles(T weatherSkeleton, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        super.setRotationAngles(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }
}
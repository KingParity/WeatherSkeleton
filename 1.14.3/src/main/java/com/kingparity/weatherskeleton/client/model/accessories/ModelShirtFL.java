package com.kingparity.weatherskeleton.client.model.accessories;
//Made with Blockbench
//Paste this code into your mod.


import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class ModelShirtFL<T extends WeatherSkeletonEntity> extends WeatherSkeletonModel<T>
{
    public ModelShirtFL()
    {
        textureWidth = 244;
        textureHeight = 195;
        
        left_arm = new RendererModel(this);
        left_arm.setRotationPoint(5.0F, 3.0F, 0.0F);
        left_arm.cubeList.add(new ModelBox(left_arm, 0, 0, -1.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 113, 122, -1.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 99, 119, 1.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 109, 122, -1.0F, -1.0F, -2.0F, 2, 2, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 118, 125, -1.0F, -1.0F, 1.0F, 2, 2, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 118, 118, -1.0F, 1.0F, -2.0F, 2, 2, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 101, 118, 1.0F, 1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 122, 114, -1.0F, 1.0F, 1.0F, 2, 2, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 122, 114, -1.0F, 2.0F, 2.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 122, 114, -1.0F, 2.0F, -3.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 122, 114, 1.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 122, 114, 2.0F, 2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 122, 114, 1.0F, 2.0F, 1.0F, 1, 1, 1, 0.0F, false));
        
        right_arm = new RendererModel(this);
        right_arm.setRotationPoint(-5.0F, 3.0F, 0.0F);
        right_arm.cubeList.add(new ModelBox(right_arm, 0, 0, -1.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 112, 118, -1.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 117, 115, -1.0F, 1.0F, -2.0F, 2, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 114, 118, -1.0F, -1.0F, 1.0F, 2, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 105, 119, -2.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 111, 114, -1.0F, -1.0F, -2.0F, 2, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 116, 115, -2.0F, 1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 120, 123, -1.0F, 1.0F, 1.0F, 2, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 117, 115, -1.0F, 2.0F, -3.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 117, 115, -1.0F, 2.0F, 2.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 117, 115, -2.0F, 2.0F, -2.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 117, 115, -2.0F, 2.0F, 1.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 117, 115, -3.0F, 2.0F, -1.0F, 1, 1, 2, 0.0F, false));
        
        main = new RendererModel(this);
        main.setRotationPoint(0.0F, 24.0F, 0.0F);
        main.cubeList.add(new ModelBox(main, 170, 70, -2.0F, -21.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -12.0F, -1.0F, 6, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -13.0F, -1.0F, 6, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 102, 117, 3.0F, -13.0F, -2.0F, 1, 2, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 110, -4.0F, -13.0F, -2.0F, 1, 2, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -23.0F, 0.0F, 2, 10, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -17.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -17.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -18.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -18.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 70, 2.0F, -22.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -23.0F, -1.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -23.0F, -1.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -19.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 2.0F, -19.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -2.0F, -19.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -19.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -21.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -1.0F, -19.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 3.0F, -21.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -21.0F, 0.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -21.0F, 0.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -4.0F, -23.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -23.0F, 0.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 1.0F, -23.0F, 0.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, 3.0F, -23.0F, 0.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 161, 64, -3.0F, -19.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 161, 64, 1.0F, -19.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 165, 72, -1.0F, -20.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 2, -3.0F, -20.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 2, 1.0F, -20.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 70, -4.0F, -22.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 70, 1.0F, -21.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, -4.0F, -21.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, 2.0F, -21.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, -1.0F, -21.0F, -1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 2, -2.0F, -22.0F, -1.0F, 4, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 127, 116, 2.0F, -14.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 115, -3.0F, -14.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 129, 110, -2.0F, -16.0F, -2.0F, 1, 4, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 112, 1.0F, -16.0F, -2.0F, 1, 4, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 127, 111, -3.0F, -13.0F, 1.0F, 6, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 114, -4.0F, -23.0F, 1.0F, 1, 7, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 116, 115, -4.0F, -18.0F, -2.0F, 1, 5, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 119, -4.0F, -15.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 122, -4.0F, -20.0F, -1.0F, 1, 2, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 120, -4.0F, -23.0F, -2.0F, 2, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 116, 123, -4.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 107, -4.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 112, 103, -2.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 119, 110, -3.0F, -20.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 128, 112, -4.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 129, 115, -3.0F, -17.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 118, -2.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 129, 129, -2.0F, -15.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 120, -3.0F, -14.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 111, 116, -3.0F, -23.0F, 1.0F, 4, 6, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 117, -1.0F, -17.0F, 1.0F, 5, 4, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 125, -2.0F, -17.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 129, 112, 1.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 127, 108, 2.0F, -21.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 109, 3.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 123, 126, 1.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 123, 124, 1.0F, -23.0F, 1.0F, 3, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 116, 123, 3.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 110, 119, 3.0F, -19.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 134, 130, 1.0F, -19.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 122, 1.0F, -18.0F, 1.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 121, 2.0F, -15.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 104, 3.0F, -16.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 132, 114, 3.0F, -15.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 106, 122, 3.0F, -14.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 114, 118, 3.0F, -16.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 119, 3.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 114, 119, 3.0F, -20.0F, -2.0F, 1, 4, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 115, 2.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 122, -3.0F, -17.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 111, 119, -2.0F, -18.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 114, -2.0F, -22.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 117, 119, 1.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 123, 107, 2.0F, -22.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 110, 119, 3.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 109, 119, 1.0F, -19.0F, -2.0F, 2, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 129, 117, 1.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 112, 114, 1.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 117, 116, 3.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 122, 2.0F, -23.0F, -2.0F, 2, 1, 1, 0.0F, false));
    }
    
    @Override
    public void setRotationAngles(T weatherSkeleton, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        super.setRotationAngles(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }
}
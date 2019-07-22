package com.kingparity.weatherskeleton.client.model.accessories;
//Made with Blockbench
//Paste this code into your mod.


import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;

public class ShirtVSModel<T extends WeatherSkeletonEntity> extends WeatherSkeletonModel<T>
{
    public ShirtVSModel()
    {
        textureWidth = 244;
        textureHeight = 195;
        
        left_arm = new RendererModel(this);
        left_arm.setRotationPoint(-5.0F, 3.0F, 0.0F);
        left_arm.cubeList.add(new ModelBox(left_arm, 0, 0, 9.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 125, 72, 9.0F, -2.0F, 0.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 109, 81, 11.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 80, 113, 9.0F, -1.0F, -2.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 117, 76, 9.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 125, 71, 9.0F, -2.0F, -1.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 110, 74, 11.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 67, 112, 11.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 72, 112, 9.0F, -1.0F, 1.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 109, 73, 9.0F, 0.0F, -2.0F, 2, 1, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 86, 113, 11.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
        
        right_arm = new RendererModel(this);
        right_arm.setRotationPoint(5.0F, 3.0F, 0.0F);
        right_arm.cubeList.add(new ModelBox(right_arm, 0, 0, -11.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 121, 67, -11.0F, -2.0F, 0.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 73, 115, -11.0F, -1.0F, -2.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 122, 80, -11.0F, 0.0F, 1.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, -12.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 111, 62, -11.0F, -2.0F, -1.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 73, 112, -12.0F, -1.0F, -1.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 120, 73, -11.0F, 0.0F, -2.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 76, 125, -12.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 78, 114, -11.0F, -1.0F, 1.0F, 2, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, -12.0F, 1.0F, 0.0F, 1, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, -11.0F, 1.0F, -2.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, -11.0F, 1.0F, 1.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, -1.0F, 1.0F, 1.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, 1.0F, 1.0F, 0.0F, 1, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 110, 75, 0.0F, 1.0F, -2.0F, 1, 1, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 120, 77, -12.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, false));
        
        main = new RendererModel(this);
        main.setRotationPoint(0.0F, 24.0F, 0.0F);
        main.cubeList.add(new ModelBox(main, 170, 70, -2.0F, -21.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -12.0F, -1.0F, 6, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -13.0F, 1.0F, 1, 1, 0, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -13.0F, -1.0F, 6, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 159, 114, 3.0F, -13.0F, -1.0F, 1, 2, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 167, 126, -4.0F, -13.0F, -2.0F, 1, 2, 4, 0.0F, false));
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
        main.cubeList.add(new ModelBox(main, 167, 111, 2.0F, -12.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 171, 130, -3.0F, -12.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 163, 119, -2.0F, -15.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 71, 1.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 175, 113, -2.0F, -13.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 77, 113, -4.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 128, 78, -4.0F, -18.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 166, 121, -4.0F, -15.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 73, -4.0F, -20.0F, -1.0F, 1, 2, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 127, 73, -4.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 72, 115, -4.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 131, 69, -4.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 73, -2.0F, -18.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 75, -3.0F, -20.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 80, -4.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 127, 76, -3.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 109, 73, -2.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 169, 118, -2.0F, -14.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 126, 72, -3.0F, -14.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 69, -2.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 164, 122, -1.0F, -14.0F, 1.0F, 2, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 69, -1.0F, -20.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 81, 115, 2.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 171, 118, 1.0F, -19.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 71, 3.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 166, 114, 1.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 108, 80, 1.0F, -22.0F, 1.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 76, 112, 3.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 64, 3.0F, -19.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 74, 2.0F, -19.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 67, 3.0F, -18.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 169, 119, 2.0F, -14.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 128, 64, 3.0F, -16.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 75, 3.0F, -15.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 70, 3.0F, -14.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 114, 82, 3.0F, -16.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 79, 3.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 107, 80, 3.0F, -20.0F, -1.0F, 1, 4, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 112, 71, 2.0F, -15.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 80, -3.0F, -17.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 71, 115, -3.0F, -19.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 77, 112, -2.0F, -22.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 86, 104, 1.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 122, 67, 2.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 63, 3.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 67, 2.0F, -18.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 76, 1.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 74, 107, 1.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 113, 73, 3.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 74, 112, 2.0F, -23.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 165, 125, -3.0F, -13.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 174, 125, -3.0F, -14.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 80, -4.0F, -22.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 89, 108, -3.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 116, 72, -4.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 114, 80, -3.0F, -18.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 107, 71, -2.0F, -17.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 117, 70, -4.0F, -18.0F, -1.0F, 1, 5, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 78, -4.0F, -15.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 81, -3.0F, -15.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 123, 86, -3.0F, -16.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 163, 119, 1.0F, -15.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 164, 118, 3.0F, -12.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 105, 74, 2.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 176, 117, 3.0F, -13.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 131, 70, 3.0F, -17.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 73, 120, 1.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 126, 81, 1.0F, -18.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 80, 112, 2.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 72, 3.0F, -19.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 80, 108, 2.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 79, 108, 3.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 78, 118, -4.0F, -23.0F, -2.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 131, 79, -1.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 117, 61, 0.0F, -20.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 176, 120, -1.0F, -17.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 67, 2.0F, -17.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 123, 77, 2.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 173, 117, 1.0F, -14.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 173, 118, -1.0F, -15.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 70, 2.0F, -14.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 183, 112, 1.0F, -12.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 110, 75, 1.0F, -16.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 113, 0.0F, -17.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 174, 115, -1.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 127, 70, -4.0F, -20.0F, 1.0F, 1, 4, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 74, -3.0F, -19.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 79, 117, -2.0F, -19.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 73, 0.0F, -23.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 116, 65, -1.0F, -23.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 180, 109, -2.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 80, -3.0F, -22.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 165, 118, -4.0F, -23.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 169, 121, 3.0F, -15.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 169, 115, -3.0F, -12.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 173, 113, -3.0F, -13.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 118, 61, 2.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 165, 112, 2.0F, -13.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 168, 115, 1.0F, -13.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 109, 67, 3.0F, -14.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 120, 80, -2.0F, -15.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 124, 67, 3.0F, -17.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 169, 116, -3.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 112, 75, 1.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 164, 113, 1.0F, -17.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 70, 2.0F, -15.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 125, 77, 2.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 166, 115, -2.0F, -17.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 121, 76, -3.0F, -15.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 79, -2.0F, -23.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 79, -2.0F, -22.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 173, 117, -3.0F, -23.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 115, 79, -4.0F, -22.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 170, 113, 2.0F, -23.0F, 1.0F, 2, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 123, 77, 1.0F, -23.0F, 1.0F, 1, 1, 1, 0.0F, false));
    }
    
    @Override
    public void setRotationAngles(T weatherSkeleton, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        super.setRotationAngles(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor);
    }
}
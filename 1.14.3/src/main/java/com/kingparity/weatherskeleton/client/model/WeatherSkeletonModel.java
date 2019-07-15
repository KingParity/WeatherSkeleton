package com.kingparity.weatherskeleton.client.model;

import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import net.minecraft.client.renderer.entity.model.BipedModel;
import net.minecraft.client.renderer.entity.model.EntityModel;
import net.minecraft.client.renderer.entity.model.IHasArm;
import net.minecraft.client.renderer.entity.model.RendererModel;
import net.minecraft.client.renderer.model.ModelBox;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.util.Hand;
import net.minecraft.util.HandSide;
import net.minecraft.util.math.MathHelper;

public class WeatherSkeletonModel<T extends WeatherSkeletonEntity> extends EntityModel<T> implements IHasArm
{
    public RendererModel left_arm;
    public RendererModel right_arm;
    public RendererModel left_leg;
    public RendererModel right_leg;
    public RendererModel hat;
    public RendererModel main;
    public RendererModel head;
    
    public BipedModel.ArmPose left_arm_pose;
    public BipedModel.ArmPose right_arm_pose;
    
    public WeatherSkeletonModel()
    {
        this.left_arm_pose = BipedModel.ArmPose.EMPTY;
        this.right_arm_pose = BipedModel.ArmPose.EMPTY;
    
        textureWidth = 244;
        textureHeight = 195;
    
        head = new RendererModel(this);
        head.setRotationPoint(0.0F, 1.0F, 0.0F);
    
        left_arm = new RendererModel(this);
        left_arm.setRotationPoint(-5.0F, 3.0F, 0.0F);
        /*left_arm.cubeList.add(new ModelBox(left_arm, 0, 0, 9.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 22, 158, 9.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 29, 164, 11.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 20, 183, 9.0F, -1.0F, -2.0F, 2, 2, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 25, 166, 9.0F, -1.0F, 1.0F, 2, 2, 1, 0.0F, false));*/
    
        right_arm = new RendererModel(this);
        right_arm.setRotationPoint(5.0F, 3.0F, 0.0F);
        /*right_arm.cubeList.add(new ModelBox(right_arm, 0, 0, -11.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 17, 164, -11.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 118, 124, -11.0F, -1.0F, -2.0F, 2, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 22, 164, -11.0F, -1.0F, 1.0F, 2, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 23, 167, -12.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));*/
    
        left_leg = new RendererModel(this);
        left_leg.setRotationPoint(-2.0F, 13.0F, 0.0F);
        left_leg.cubeList.add(new ModelBox(left_leg, 0, 0, 3.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F, false));
    
        right_leg = new RendererModel(this);
        right_leg.setRotationPoint(2.0F, 13.0F, 0.0F);
        right_leg.cubeList.add(new ModelBox(right_leg, 0, 0, -5.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F, false));
    
        hat = new RendererModel(this);
        hat.setRotationPoint(0.0F, 1.0F, 0.0F);
    
        main = new RendererModel(this);
        main.setRotationPoint(0.0F, 24.0F, 0.0F);
        /*main.cubeList.add(new ModelBox(main, 170, 70, -2.0F, -21.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -12.0F, -1.0F, 6, 1, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 0, 0, -3.0F, -13.0F, -1.0F, 6, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 164, 19, 3.0F, -13.0F, -2.0F, 1, 2, 4, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 163, 22, -4.0F, -13.0F, -2.0F, 1, 2, 4, 0.0F, false));
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
        main.cubeList.add(new ModelBox(main, 164, 19, 2.0F, -14.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 164, 19, -3.0F, -14.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 164, 19, -2.0F, -16.0F, -2.0F, 1, 4, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 164, 19, 1.0F, -16.0F, -2.0F, 1, 4, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 164, 19, -3.0F, -13.0F, 1.0F, 6, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 39, 170, -4.0F, -23.0F, 1.0F, 1, 7, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 19, 169, -4.0F, -18.0F, -2.0F, 1, 5, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 37, 167, -4.0F, -15.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 154, -4.0F, -20.0F, -1.0F, 1, 2, 2, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 32, 162, -4.0F, -23.0F, -2.0F, 2, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 24, 173, -4.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 70, 21, -4.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 71, 18, -2.0F, -19.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 82, 16, -3.0F, -20.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 72, 26, -4.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 85, 25, -3.0F, -17.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 70, 21, -2.0F, -16.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 37, 176, -2.0F, -15.0F, 1.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 32, 168, -3.0F, -14.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 170, -3.0F, -23.0F, 1.0F, 4, 6, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 17, 159, -1.0F, -17.0F, 1.0F, 5, 4, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 24, 163, -2.0F, -17.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 88, 30, 1.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 80, 16, 2.0F, -21.0F, 1.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 77, 18, 3.0F, -20.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 20, 168, 1.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 32, 180, 1.0F, -23.0F, 1.0F, 3, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 12, 175, 3.0F, -21.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 23, 162, 3.0F, -19.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 32, 167, 1.0F, -19.0F, 1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 18, 167, 1.0F, -18.0F, 1.0F, 3, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 92, 22, 2.0F, -15.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 88, 18, 3.0F, -16.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 85, 16, 3.0F, -15.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 20, 178, 3.0F, -14.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 15, 156, 3.0F, -16.0F, -1.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 18, 160, 3.0F, -16.0F, 0.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 22, 177, 3.0F, -20.0F, -2.0F, 1, 4, 3, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 28, 175, 2.0F, -16.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 19, 174, -3.0F, -17.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 29, 165, -2.0F, -18.0F, -2.0F, 1, 2, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 29, 170, -2.0F, -22.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 89, 17, 1.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 93, 26, 2.0F, -22.0F, -2.0F, 1, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 64, 26, 3.0F, -21.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 25, 168, 1.0F, -19.0F, -2.0F, 2, 3, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 28, 167, 1.0F, -20.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 21, 163, 1.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 26, 172, 3.0F, -22.0F, -2.0F, 1, 1, 1, 0.0F, false));
        main.cubeList.add(new ModelBox(main, 20, 171, 2.0F, -23.0F, -2.0F, 2, 1, 1, 0.0F, false));*/
    }
    
    /**
     * Sets the models various rotation angles then renders the model.
     */
    @Override
    public void render(T weatherSkeleton, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        super.render(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        this.setRotationAngles(weatherSkeleton, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
    
        left_arm.render(scale);
        right_arm.render(scale);
        left_leg.render(scale);
        right_leg.render(scale);
        hat.render(scale);
        head.render(scale);
        main.render(scale);
    }
    
    public void setRotationAngle(RendererModel RendererModel, float x, float y, float z)
    {
        RendererModel.rotateAngleX = x;
        RendererModel.rotateAngleY = y;
        RendererModel.rotateAngleZ = z;
    }
    
    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the func_212844_a_ method.
     */
    @Override
    public void setLivingAnimations(T weatherSkeleton, float limbSwing, float limbSwingAmount, float partialTickTime)
    {
        this.left_arm_pose = BipedModel.ArmPose.EMPTY;
        this.right_arm_pose = BipedModel.ArmPose.EMPTY;
    
        super.setLivingAnimations(weatherSkeleton, limbSwing, limbSwingAmount, partialTickTime);
    }
    
    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    @Override
    public void setRotationAngles(T weatherSkeleton, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor)
    {
        this.main.rotateAngleY = 0.0F;
        /*this.right_arm.rotationPointZ = 0.0F;
        this.right_arm.rotationPointX = -5.0F;
        this.left_arm.rotationPointZ = 0.0F;
        this.left_arm.rotationPointX = 5.0F;*/
        float f = 1.0F;
    
        this.right_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 2.0F * limbSwingAmount * 0.5F / f;
        this.left_arm.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 2.0F * limbSwingAmount * 0.5F / f;
        this.right_arm.rotateAngleZ = 0.0F;
        this.left_arm.rotateAngleZ = 0.0F;
        this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount / f;
        this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount / f;
        this.right_leg.rotateAngleY = 0.0F;
        this.left_leg.rotateAngleY = 0.0F;
        this.right_leg.rotateAngleZ = 0.0F;
        this.left_leg.rotateAngleZ = 0.0F;
    
        if(this.isSitting)
        {
            this.right_arm.rotateAngleX += -((float)Math.PI / 5F);
            this.left_arm.rotateAngleX += -((float)Math.PI / 5F);
            this.right_leg.rotateAngleX = -1.4137167F;
            this.right_leg.rotateAngleY = ((float)Math.PI / 10F);
            this.right_leg.rotateAngleZ = 0.07853982F;
            this.left_leg.rotateAngleX = -1.4137167F;
            this.left_leg.rotateAngleY = -((float)Math.PI / 10F);
            this.left_leg.rotateAngleZ = -0.07853982F;
        }
    
        this.right_arm.rotateAngleY = 0.0F;
        this.right_arm.rotateAngleZ = 0.0F;
    
        switch (this.left_arm_pose)
        {
            case EMPTY:
                this.left_arm.rotateAngleY = 0.0F;
                break;
            case BLOCK:
                this.left_arm.rotateAngleX = this.left_arm.rotateAngleX * 0.5F - 0.9424779F;
                this.left_arm.rotateAngleY = 0.5235988F;
                break;
            case ITEM:
                this.left_arm.rotateAngleX = this.left_arm.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
                this.left_arm.rotateAngleY = 0.0F;
        }
    
        switch (this.right_arm_pose)
        {
            case EMPTY:
                this.right_arm.rotateAngleY = 0.0F;
                break;
            case BLOCK:
                this.right_arm.rotateAngleX = this.right_arm.rotateAngleX * 0.5F - 0.9424779F;
                this.right_arm.rotateAngleY = -0.5235988F;
                break;
            case ITEM:
                this.right_arm.rotateAngleX = this.right_arm.rotateAngleX * 0.5F - ((float)Math.PI / 10F);
                this.right_arm.rotateAngleY = 0.0F;
        }
    
        if (this.swingProgress > 0.0F)
        {
            HandSide handSide = this.getMainHand(weatherSkeleton);
            RendererModel renderer = this.getArmForSide(handSide);
            float f1 = this.swingProgress;
            this.main.rotateAngleY = MathHelper.sin(MathHelper.sqrt(f1) * ((float)Math.PI * 2F)) * 0.2F;
        
            //this.right_arm.rotationPointZ = MathHelper.sin(this.main.rotateAngleY) * 5.0F;
            //this.right_arm.rotationPointX = -MathHelper.cos(this.main.rotateAngleY) * 5.0F;
            //this.left_arm.rotationPointZ = -MathHelper.sin(this.main.rotateAngleY) * 5.0F;
            //this.left_arm.rotationPointX = MathHelper.cos(this.main.rotateAngleY) * 5.0F;
            this.right_arm.rotateAngleY += this.main.rotateAngleY;
            this.left_arm.rotateAngleY += this.main.rotateAngleY;
            this.left_arm.rotateAngleX += this.main.rotateAngleY;
            f1 = 1.0F - this.swingProgress;
            f1 = f1 * f1;
            f1 = f1 * f1;
            f1 = 1.0F - f1;
            float f2 = MathHelper.sin(f1 * (float)Math.PI);
            float f3 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.head.rotateAngleX - 0.7F) * 0.75F;
            renderer.rotateAngleX = (float)((double)right_arm.rotateAngleX - ((double)f2 * 1.2D + (double)f3));
            renderer.rotateAngleY += this.main.rotateAngleY * 2.0F;
            //right_arm.rotateAngleZ += MathHelper.sin(this.swingProgress * (float)Math.PI) * -0.4F;
        }
    
        //this.right_arm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        //this.left_arm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.right_arm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.left_arm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
    
        this.left_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
        this.right_leg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    
        this.head.rotateAngleY = netHeadYaw * 0.017453292F;
        this.head.rotateAngleX = headPitch * 0.017453292F;
    
        this.hat.rotateAngleZ = this.head.rotateAngleZ;
        this.hat.rotateAngleY = this.head.rotateAngleY;
        this.hat.rotateAngleX = this.head.rotateAngleX;
    }
    
    @Override
    public void postRenderArm(float scale, HandSide side)
    {
        this.getArmForSide(side).postRender(scale);
    }
    
    protected RendererModel getArmForSide(HandSide side)
    {
        return side == HandSide.LEFT ? this.left_arm : this.right_arm;
    }
    
    protected HandSide getMainHand(Entity entityIn)
    {
        if (entityIn instanceof LivingEntity)
        {
            LivingEntity entitylivingbase = (LivingEntity)entityIn;
            HandSide HandSide = entitylivingbase.getPrimaryHand();
            return entitylivingbase.swingingHand == Hand.MAIN_HAND ? HandSide : HandSide.opposite();
        }
        else
        {
            return HandSide.RIGHT;
        }
    }
    
    @Override
    public void setModelAttributes(EntityModel<T> model)
    {
        super.setModelAttributes(model);
    
        if(model instanceof WeatherSkeletonModel)
        {
            WeatherSkeletonModel WeatherSkeletonModel = (WeatherSkeletonModel)model;
            this.left_arm_pose = WeatherSkeletonModel.left_arm_pose;
            this.right_arm_pose = WeatherSkeletonModel.right_arm_pose;
            //this.isSneak = WeatherSkeletonModel.isSneak;
        }
    }
}
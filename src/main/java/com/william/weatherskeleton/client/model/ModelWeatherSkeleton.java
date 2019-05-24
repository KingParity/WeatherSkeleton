package com.william.weatherskeleton.client.model;
//Made with Blockbench
//Paste this code into your mod.

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

public class ModelWeatherSkeleton extends ModelBase
{
    public ModelRenderer left_arm;
    public ModelRenderer right_arm;
    public ModelRenderer left_leg;
    public ModelRenderer right_leg;
    public ModelRenderer hat;
    public ModelRenderer main;
    public ModelRenderer head;
    
    public ModelWeatherSkeleton()
    {
        textureWidth = 244;
        textureHeight = 195;
    
        head = new ModelRenderer(this);
        head.setRotationPoint(0.0F, 1.0F, 0.0F);
    
        left_arm = new ModelRenderer(this);
        left_arm.setRotationPoint(-5.0F, 3.0F, 0.0F);
        /*left_arm.cubeList.add(new ModelBox(left_arm, 0, 0, 9.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 22, 158, 9.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 29, 164, 11.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 20, 183, 9.0F, -1.0F, -2.0F, 2, 2, 1, 0.0F, false));
        left_arm.cubeList.add(new ModelBox(left_arm, 25, 166, 9.0F, -1.0F, 1.0F, 2, 2, 1, 0.0F, false));*/
    
        right_arm = new ModelRenderer(this);
        right_arm.setRotationPoint(5.0F, 3.0F, 0.0F);
        /*right_arm.cubeList.add(new ModelBox(right_arm, 0, 0, -11.0F, -1.0F, -1.0F, 2, 11, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 17, 164, -11.0F, -2.0F, -1.0F, 2, 1, 2, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 118, 124, -11.0F, -1.0F, -2.0F, 2, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 22, 164, -11.0F, -1.0F, 1.0F, 2, 2, 1, 0.0F, false));
        right_arm.cubeList.add(new ModelBox(right_arm, 23, 167, -12.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F, false));*/
    
        left_leg = new ModelRenderer(this);
        left_leg.setRotationPoint(-2.0F, 13.0F, 0.0F);
        left_leg.cubeList.add(new ModelBox(left_leg, 0, 0, 3.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F, false));
    
        right_leg = new ModelRenderer(this);
        right_leg.setRotationPoint(2.0F, 13.0F, 0.0F);
        right_leg.cubeList.add(new ModelBox(right_leg, 0, 0, -5.0F, 0.0F, -1.0F, 2, 11, 2, 0.0F, false));
    
        hat = new ModelRenderer(this);
        hat.setRotationPoint(0.0F, 1.0F, 0.0F);
    
        main = new ModelRenderer(this);
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
    
    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        
        left_arm.render(f5);
        right_arm.render(f5);
        left_leg.render(f5);
        right_leg.render(f5);
        hat.render(f5);
        head.render(f5);
        main.render(f5);
    }
    
    public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z)
    {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    @Override
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn)
    {
        this.main.rotateAngleY = 0.0F;
        /*this.right_arm.rotationPointZ = 0.0F;
        this.right_arm.rotationPointX = -5.0F;
        this.left_arm.rotationPointZ = 0.0F;
        this.left_arm.rotationPointX = 5.0F;*/
        float f = 1.0F;
        
        if (f < 1.0F)
        {
            f = 1.0F;
        }
        
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
        
        if (this.isRiding)
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
        
        this.left_arm.rotateAngleY = 0.0F;
        this.right_arm.rotateAngleY = 0.0F;
        
        if (this.swingProgress > 0.0F)
        {
            //EnumHandSide enumhandside = this.getMainHand(entityIn);
            //ModelRenderer modelrenderer = this.getArmForSide(enumhandside);
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
            //float f3 = MathHelper.sin(this.swingProgress * (float)Math.PI) * -(this.fake - 0.7F) * 0.75F;
            right_arm.rotateAngleX = (float)((double)right_arm.rotateAngleX - ((double)f2 * 1.2D + (double)f3));
            right_arm.rotateAngleY += this.main.rotateAngleY * 2.0F;
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
    
    /*public void setHeadVisible()
    {
        setVisible(true);
        this.head.showModel = false;
    }
    
    public void setHead1Visible()
    {
        setVisible(true);
        this.head1.showModel = false;
    }
    
    public void setHatVisible()
    {
        setVisible(true);
        this.hat.showModel = false;
    }
    
    public void setMainVisible()
    {
        setVisible(true);
        this.main.showModel = false;
        this.left_arm.showModel = false;
        this.right_arm.showModel = false;
        this.left_leg.showModel = false;
        this.right_leg.showModel = false;
    }
    
    public void setVisible(boolean visible)
    {
        this.hat.showModel = visible;
        this.main.showModel = visible;
        this.left_arm.showModel = visible;
        this.right_arm.showModel = visible;
        this.left_leg.showModel = visible;
        this.right_leg.showModel = visible;
    }*/
}
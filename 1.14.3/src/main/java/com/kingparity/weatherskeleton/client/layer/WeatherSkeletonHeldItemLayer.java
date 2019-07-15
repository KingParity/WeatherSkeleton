package com.kingparity.weatherskeleton.client.layer;

import com.kingparity.weatherskeleton.client.model.WeatherSkeletonModel;
import com.kingparity.weatherskeleton.entity.WeatherSkeletonEntity;
import com.mojang.blaze3d.platform.GlStateManager;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.IEntityRenderer;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.client.renderer.model.ItemCameraTransforms;
import net.minecraft.item.ItemStack;
import net.minecraft.util.HandSide;

public class WeatherSkeletonHeldItemLayer extends LayerRenderer<WeatherSkeletonEntity, WeatherSkeletonModel<WeatherSkeletonEntity>>
{
    public WeatherSkeletonHeldItemLayer(IEntityRenderer<WeatherSkeletonEntity, WeatherSkeletonModel<WeatherSkeletonEntity>> model)
    {
        super(model);
    }
    
    @Override
    public void render(WeatherSkeletonEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        boolean flag = entity.getPrimaryHand() == HandSide.RIGHT;
        ItemStack itemstack = flag ? entity.getHeldItemOffhand() : entity.getHeldItemMainhand();
        ItemStack itemstack1 = flag ? entity.getHeldItemMainhand() : entity.getHeldItemOffhand();
        
        if (!itemstack.isEmpty() || !itemstack1.isEmpty())
        {
            GlStateManager.pushMatrix();
            
            if(this.getEntityModel().isChild)
            {
                float f = 0.5F;
                GlStateManager.translatef(0.0F, 0.75F, 0.0F);
                GlStateManager.scalef(0.5F, 0.5F, 0.5F);
            }
            
            this.renderHeldItem(entity, itemstack1, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND, HandSide.RIGHT);
            this.renderHeldItem(entity, itemstack, ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND, HandSide.LEFT);
            GlStateManager.popMatrix();
        }
    }
    
    private void renderHeldItem(WeatherSkeletonEntity entity, ItemStack item, ItemCameraTransforms.TransformType transformType, HandSide handSide)
    {
        if (!item.isEmpty())
        {
            GlStateManager.pushMatrix();
            
            if (entity.isSneaking())
            {
                GlStateManager.translatef(0.0F, 0.2F, 0.0F);
            }
            // Forge: moved this call down, fixes incorrect offset while sneaking.
            this.translateToHand(handSide);
            GlStateManager.rotatef(-90.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotatef(180.0F, 0.0F, 1.0F, 0.0F);
            boolean flag = handSide == HandSide.LEFT;
            GlStateManager.translatef((float)(flag ? -10 : 10) / 16.0F, 0.125F, -0.625F);
            Minecraft.getInstance().getItemRenderer().renderItem(item, entity, transformType, flag);
            GlStateManager.popMatrix();
        }
    }
    
    protected void translateToHand(HandSide side)
    {
        (this.getEntityModel()).postRenderArm(0.0625F, side);
    }
    
    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}

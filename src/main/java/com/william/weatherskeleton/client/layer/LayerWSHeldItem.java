package com.william.weatherskeleton.client.layer;

import com.william.weatherskeleton.client.model.ModelWeatherSkeleton;
import com.william.weatherskeleton.client.render.RenderWeatherSkeleton;
import com.william.weatherskeleton.entity.EntityWeatherSkeleton;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.block.model.ItemCameraTransforms;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHandSide;

public class LayerWSHeldItem implements LayerRenderer<EntityWeatherSkeleton>
{
    protected final RenderWeatherSkeleton livingEntityRenderer;
    
    public LayerWSHeldItem(RenderWeatherSkeleton livingEntityRendererIn)
    {
        this.livingEntityRenderer = livingEntityRendererIn;
    }
    
    @Override
    public void doRenderLayer(EntityWeatherSkeleton entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale)
    {
        boolean flag = entity.getPrimaryHand() == EnumHandSide.RIGHT;
        ItemStack itemstack = flag ? entity.getHeldItemOffhand() : entity.getHeldItemMainhand();
        ItemStack itemstack1 = flag ? entity.getHeldItemMainhand() : entity.getHeldItemOffhand();
        
        if (!itemstack.isEmpty() || !itemstack1.isEmpty())
        {
            GlStateManager.pushMatrix();
            
            if (this.livingEntityRenderer.getMainModel().isChild)
            {
                float f = 0.5F;
                GlStateManager.translate(0.0F, 0.75F, 0.0F);
                GlStateManager.scale(0.5F, 0.5F, 0.5F);
            }
            
            this.renderHeldItem(entity, itemstack1, ItemCameraTransforms.TransformType.THIRD_PERSON_RIGHT_HAND, EnumHandSide.RIGHT);
            this.renderHeldItem(entity, itemstack, ItemCameraTransforms.TransformType.THIRD_PERSON_LEFT_HAND, EnumHandSide.LEFT);
            GlStateManager.popMatrix();
        }
    }
    
    private void renderHeldItem(EntityWeatherSkeleton entity, ItemStack item, ItemCameraTransforms.TransformType transformType, EnumHandSide handSide)
    {
        if (!item.isEmpty())
        {
            GlStateManager.pushMatrix();
            
            if (entity.isSneaking())
            {
                GlStateManager.translate(0.0F, 0.2F, 0.0F);
            }
            // Forge: moved this call down, fixes incorrect offset while sneaking.
            this.translateToHand(handSide);
            GlStateManager.rotate(-90.0F, 1.0F, 0.0F, 0.0F);
            GlStateManager.rotate(180.0F, 0.0F, 1.0F, 0.0F);
            boolean flag = handSide == EnumHandSide.LEFT;
            GlStateManager.translate((float)(flag ? -10 : 10) / 16.0F, 0.125F, -0.625F);
            Minecraft.getMinecraft().getItemRenderer().renderItemSide(entity, item, transformType, flag);
            GlStateManager.popMatrix();
        }
    }
    
    protected void translateToHand(EnumHandSide side)
    {
        ((ModelWeatherSkeleton)this.livingEntityRenderer.getMainModel()).postRenderArm(0.0625F, side);
    }
    
    @Override
    public boolean shouldCombineTextures()
    {
        return false;
    }
}

package com.soul.kor.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.soul.kor.Kor;
import com.soul.kor.entity.custom.golembomb;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GolemBombRenderer extends GeoEntityRenderer<golembomb> {
    public GolemBombRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GolemBombModel());
        //this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(golembomb instance) {
        return new ResourceLocation(Kor.MOD_ID, "textures/entity/golembomb/GolemBomb.png");
    }

    @Override
    public RenderType getRenderType(golembomb animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

}

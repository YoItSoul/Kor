package com.soul.kor.entity.client;

import com.soul.kor.Kor;
import com.soul.kor.entity.custom.golembomb;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GolemBombModel extends AnimatedGeoModel<golembomb> {
    @Override
    public ResourceLocation getModelLocation(golembomb object) {
        return new ResourceLocation(Kor.MOD_ID, "geo/golembomb.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(golembomb object) {
        return new ResourceLocation(Kor.MOD_ID, "textures/entity/golembomb/golembomb.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(golembomb animatable) {
        return new ResourceLocation(Kor.MOD_ID, "animations/animation.golembomb.json");
    }


}

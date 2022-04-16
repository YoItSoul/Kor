package com.soul.kor.entity.client;

import com.soul.kor.Kor;
import com.soul.kor.entity.custom.golemdefender;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GolemDefenderModel extends AnimatedGeoModel<golemdefender> {
    @Override
    public ResourceLocation getModelLocation(golemdefender object) {
        return new ResourceLocation(Kor.MOD_ID, "geo/defendergolem.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(golemdefender object) {
        return new ResourceLocation(Kor.MOD_ID, "textures/entity/golemdefender/golemdefender.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(golemdefender animatable) {
        return new ResourceLocation(Kor.MOD_ID, "animations/animation.golemdefender.idle.json");
    }


}

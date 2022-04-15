package com.soul.kor.entity;

import com.soul.kor.Kor;
import com.soul.kor.entity.custom.golembomb;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KorEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, Kor.MOD_ID);

    public static final RegistryObject<EntityType<golembomb>> GOLEMBOMB = ENTITY_TYPES.register("golembomb",
            () -> EntityType.Builder.of(golembomb::new, MobCategory.MONSTER)
                    .sized(.75f, .75f)
                    .build(new ResourceLocation(Kor.MOD_ID, "golembomb").toString()));

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}

package com.soul.kor.event;

import com.soul.kor.Kor;
import com.soul.kor.entity.KorEntityTypes;
import com.soul.kor.entity.custom.golembomb;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Kor.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class KorEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(KorEntityTypes.GOLEMBOMB.get(), golembomb.setAttributes());
        event.put(KorEntityTypes.GOLEMDEFENDER.get(), golembomb.setAttributes());

    }
}

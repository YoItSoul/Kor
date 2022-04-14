package com.soul.kor;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KorItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Kor.MOD_ID);

    // Add below this

    public static final RegistryObject<Item> KOR_MIXTURE = ITEMS.register("kor_mixture",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));



    // Add above this
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

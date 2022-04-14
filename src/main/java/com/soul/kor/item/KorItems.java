package com.soul.kor.item;

import com.soul.kor.Kor;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import com.soul.kor.item.KorCreativeTab;

public class KorItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Kor.MOD_ID);

    // Add below this

    public static final RegistryObject<Item> KOR_MIXTURE = ITEMS.register("kor_mixture",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> ARCANE_COMPOUND = ITEMS.register("arcane_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> ARTIC_COMPOUND = ITEMS.register("arctic_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> CHARGED_COMPOUD = ITEMS.register("charged_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> CONSTRUCTION_COMPOUND = ITEMS.register("construction_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> DEMONIC_COMPOUND = ITEMS.register("demonic_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> DILUTED_COMPOUND = ITEMS.register("diluted_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));



    // Add above this
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

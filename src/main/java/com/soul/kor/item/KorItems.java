package com.soul.kor.item;

import com.soul.kor.Kor;
import com.soul.kor.entity.KorEntityTypes;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class KorItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Kor.MOD_ID);

    // Add below this

    public static final RegistryObject<Item> KOR_MIXTURE = ITEMS.register("kor_mixture",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> ARCANE_COMPOUND = ITEMS.register("arcane_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> ARCTIC_COMPOUND = ITEMS.register("arctic_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> CHARGED_COMPOUND = ITEMS.register("charged_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> CONSTRUCTION_COMPOUND = ITEMS.register("construction_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> DEMONIC_COMPOUND = ITEMS.register("demonic_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> DILUTED_COMPOUND = ITEMS.register("diluted_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> DISCORD_COMPOUND = ITEMS.register("discord_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> ELDRITCH_COMPOUND = ITEMS.register("eldritch_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> ELEMENTAL_COMPOUND = ITEMS.register("elemental_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> GLOWING_COMPOUND = ITEMS.register("glowing_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> MAGMA_COMPOUND = ITEMS.register("magma_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> MYSTICAL_COMPOUND = ITEMS.register("mystical_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> NITRO_COMPOUND = ITEMS.register("nitro_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> OVERCHARGED_COMPOUND = ITEMS.register("overcharged_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> PLACEHOLDER_QUESTION = ITEMS.register("placeholder_question",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> PLASMA_COMPOUND = ITEMS.register("plasma_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> RADIOACTIVE_COMPOUND = ITEMS.register("radioactive_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> REACTIVE_COMPOUND = ITEMS.register("reactive_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> REFINED_COMPOUND = ITEMS.register("refined_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> SACRIFICIAL_COMPOUND = ITEMS.register("sacrificial_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> TAINTED_COMPOUND = ITEMS.register("tainted_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> THERMAL_COMPOUND = ITEMS.register("thermal_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));
    public static final RegistryObject<Item> OMNI_COMPOUND = ITEMS.register("omni_compound",
            () -> new Item(new Item.Properties().tab(KorCreativeTab.TAB_KOR)));

    // Spawn egg for golembomb
    public static final RegistryObject<ForgeSpawnEggItem> GOLEMBOMB_SPAWN_EGG = ITEMS.register("golembomb_spawn_egg",
            () -> new ForgeSpawnEggItem(KorEntityTypes.GOLEMBOMB, 0x948e8d, 0x3b3635,
                    new Item.Properties().tab(KorCreativeTab.TAB_KOR)));

    public static final RegistryObject<ForgeSpawnEggItem> GOLEMDEFENDER_SPAWN_EGG = ITEMS.register("golemdefender_spawn_egg",
            () -> new ForgeSpawnEggItem(KorEntityTypes.GOLEMDEFENDER, 0x948e8d, 0x3b3635,
                    new Item.Properties().tab(KorCreativeTab.TAB_KOR)));

    // Add above this
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}

package com.soul.items;

import com.soul.kor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, kor.MOD_ID);

    public static final RegistryObject<Item> KORMIX = ITEMS.register("kormix",
            () -> new Item( new Item.Properties().tab(ModItemGroup.KOR)));
    public static final RegistryObject<Item> KORBRICK = ITEMS.register("korbrick",
            () -> new Item( new Item.Properties().tab(ModItemGroup.KOR)));




    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }
}

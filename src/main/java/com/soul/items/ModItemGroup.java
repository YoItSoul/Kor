package com.soul.items;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ModItemGroup {

    public static final ItemGroup KOR = new ItemGroup("korModTab")
    {
        @Override
        public ItemStack createIcon()
        {
            return new ItemStack(ModItems.KORMIX.get());
        }
    };
}

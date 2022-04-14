package com.soul.kor.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class KorCreativeTab {
    public static final CreativeModeTab TAB_KOR = new CreativeModeTab( "kortab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(KorItems.OMNI_COMPOUND.get());
        }
    };
}

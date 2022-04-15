package com.soul.util;

import com.soul.kor.Kor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class Kortags {
    public static class Blocks {

        private static TagKey<Block> tag(String name) {
            return BlockTags.create((new ResourceLocation(Kor.MOD_ID, name)));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create((new ResourceLocation("forge", name)));
        }
    }


    public static class Items {

        //public static final Tags.IOptionalNamedTag<Item> KOR_COMPOUNDS = tag("kormixtureany");
        //public static final Tags.IOptionalNamedTag<Item> FORGE_KOR_COMPOUNDS = forgeTag("korcompoundany");


        private static TagKey<Item> tag(String name) {
            return ItemTags.create((new ResourceLocation(Kor.MOD_ID, name)));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create((new ResourceLocation("forge", name)));
        }

    }
}

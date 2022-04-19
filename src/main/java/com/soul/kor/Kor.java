package com.soul.kor;

import com.soul.kor.block.KorBlocks;
import com.soul.kor.entity.KorEntityTypes;
import com.soul.kor.entity.client.GolemBombRenderer;
import com.soul.kor.entity.client.GolemDefenderRenderer;
import com.soul.kor.item.KorItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import software.bernie.geckolib3.GeckoLib;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Kor.MOD_ID)
public class Kor {

    public static final String MOD_ID = "kor";

    // Directly reference a log4j logger.
    private static final Logger LOGGER = LogManager.getLogger();

    public Kor() {

        // Register the setup method for modloading
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        KorItems.register(eventBus);
        KorBlocks.register(eventBus);

        KorEntityTypes.register(eventBus);
        eventBus.addListener(this::setup);


        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);


        GeckoLib.initialize();
        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }


    private void clientSetup(final FMLClientSetupEvent event) {
        // Register golembomb
        EntityRenderers.register(KorEntityTypes.GOLEMBOMB.get(), GolemBombRenderer::new);
        EntityRenderers.register(KorEntityTypes.GOLEMDEFENDER.get(), GolemDefenderRenderer::new);

    }

    private void setup(final FMLCommonSetupEvent event) {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}

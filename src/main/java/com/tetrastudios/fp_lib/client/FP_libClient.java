package com.tetrastudios.fp_lib.client;

import com.tetrastudios.fp_lib.FP_lib;
import com.tetrastudios.fp_lib.particle.CitrineFactory;
import com.tetrastudios.fp_lib.particle.FlashParticles;
import com.tetrastudios.fp_lib.particle.costum.CustomParticleLoader;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.particle.FlameParticle;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class FP_libClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {

        //Flashes
        ParticleFactoryRegistry.getInstance().register(FlashParticles.RED_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.ORANGE_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.YELLOW_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.BLACK_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.BLUE_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.BROWN_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.CYAN_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.GRAY_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.GREEN_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.LIGHT_BLUE_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.LIGHT_GRAY_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.LIME_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.MAGENTA_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.PINK_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.WHITE_FLASH, FlameParticle.Factory::new);
        ParticleFactoryRegistry.getInstance().register(FlashParticles.PURPLE_FLASH, FlameParticle.Factory::new);
        //Custom
        ParticleFactoryRegistry.getInstance().register(CustomParticleLoader.CITRINE_PARTICLE, CitrineFactory.Factory::new);
    }
}

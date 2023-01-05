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
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;

@Environment(EnvType.CLIENT)
public class FP_libClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(CustomParticleLoader.CITRINE_PARTICLE, CitrineFactory.Factory::new);

        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register(((atlasTexture, registry) -> {
            registry.register(new Identifier(FP_lib.MOD_ID, "particle/red_flash"));
        }));

        ParticleFactoryRegistry.getInstance().register(FlashParticles.RED_FLASH, FlameParticle.Factory::new);
    }
}

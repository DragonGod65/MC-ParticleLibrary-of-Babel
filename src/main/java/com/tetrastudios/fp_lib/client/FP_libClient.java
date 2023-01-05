package com.tetrastudios.fp_lib.client;

import com.tetrastudios.fp_lib.particle.CitrineParticle;
import com.tetrastudios.fp_lib.particle.costum.NewParticles;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;

@Environment(EnvType.CLIENT)
public class FP_libClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ParticleFactoryRegistry.getInstance().register(NewParticles.CITRINE_PARTICLE, CitrineParticle.Factory::new);

    }
}

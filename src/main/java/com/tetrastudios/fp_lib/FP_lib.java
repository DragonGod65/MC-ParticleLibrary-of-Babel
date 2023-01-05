package com.tetrastudios.fp_lib;

import com.tetrastudios.fp_lib.particle.FlashParticles;
import com.tetrastudios.fp_lib.particle.costum.CustomParticleLoader;
import net.fabricmc.api.ModInitializer;

import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FP_lib implements ModInitializer {

    public static final String MOD_ID = "fp_lib";
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        CustomParticleLoader.registerParticles();
        FlashParticles.registerParticles();

    }
}

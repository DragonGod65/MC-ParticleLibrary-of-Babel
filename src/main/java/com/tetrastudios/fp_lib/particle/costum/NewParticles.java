package com.tetrastudios.fp_lib.particle.costum;

import com.tetrastudios.fp_lib.FP_lib;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class NewParticles {
    public static final DefaultParticleType CITRINE_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "red_flash"),
                CITRINE_PARTICLE);

    }

}

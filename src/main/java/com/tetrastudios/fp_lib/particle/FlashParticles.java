package com.tetrastudios.fp_lib.particle;

import com.tetrastudios.fp_lib.FP_lib;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class FlashParticles {
    public static final DefaultParticleType RED_FLASH = FabricParticleTypes.simple();
    //  public static final DefaultParticleType ORANGE_FLASH = FabricParticleTypes.simple();
    //  public static final DefaultParticleType YELLOW_FLASH = FabricParticleTypes.simple();
    //  public static final DefaultParticleType LIME_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType GREEN_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType CYAN_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType LIGHT_BLUE_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType BLUE_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType PURPLE_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType MAGENTA_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType PINK_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType BROWN_FLASH = FabricParticleTypes.simple();
    //  public static final DefaultParticleType BLACK_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType GRAY_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType LIGHT_GRAY_FLASH = FabricParticleTypes.simple();
    //   public static final DefaultParticleType WHITE_FLASH = FabricParticleTypes.simple();



    public static void registerParticles() {
        Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "red_flash"), RED_FLASH);
        //   Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "orange_flash"), ORANGE_FLASH);
     //   Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "yellow_flash"), YELLOW_FLASH);
        //     Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "lime_flash"), LIME_FLASH);
        //     Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "green_flash"), GREEN_FLASH);
        //     Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "cyan_flash"), CYAN_FLASH);
        //     Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "light_blue_flash"), LIGHT_BLUE_FLASH);
        //     Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "blue_flash"), BLUE_FLASH);
        //     Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "purple_flash"), PURPLE_FLASH);
        //   Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "magenta_flash"), MAGENTA_FLASH);
        //   //   //   Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "pink_flash"), PINK_FLASH);
        //  Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "brown_flash"), BROWN_FLASH);
        //  Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "black_flash"), BLACK_FLASH);
        //   Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "gray_flash"), GRAY_FLASH);
        //   Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "light_gray_flash"), LIGHT_GRAY_FLASH);
        //   Registry.register(Registry.PARTICLE_TYPE, new Identifier(FP_lib.MOD_ID, "white_flash"), WHITE_FLASH);



    }

}

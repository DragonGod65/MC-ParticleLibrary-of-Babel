package com.tetrastudios.fp_lib.util;

import com.tetrastudios.fp_lib.FP_lib;
import net.fabricmc.fabric.api.tag.TagFactory;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.Tag;
import net.minecraft.util.Identifier;

public class FP_tags {
    public static class Particles {
        private static Tag.Identified createTag(String name) {
            return TagFactory.ENTITY_TYPE.create(new Identifier(FP_lib.MOD_ID, name));
        }

        private static Tag.Identified createCommonTag(String name) {
            return TagFactory.ENTITY_TYPE.create(new Identifier("fp", name));
        }
    }
}

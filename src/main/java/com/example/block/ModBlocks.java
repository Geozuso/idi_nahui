package com.example.block;

import com.example.ExampleMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block IDI_NAHUY_ORE_BLOCK = registerBlock("idi_nahuy_ore_block",
            new Block(FabricBlockSettings.copyOf(Blocks.END_STONE)));

    public static final Block IDI_NAHUY_BLOCK = registerBlock("idi_nahuy_block",
            new Block(FabricBlockSettings.copyOf(Blocks.NETHERITE_BLOCK).resistance(6.0f)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ExampleMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, new Identifier(ExampleMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        ExampleMod.LOGGER.info("Registering ModBlocks for " + ExampleMod.MOD_ID);
    }


}

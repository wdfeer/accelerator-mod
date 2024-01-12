package net.wdfeer.accelerator.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.*;
import net.wdfeer.accelerator.block.BlockWithData;
import net.wdfeer.accelerator.block.ModBlocks;

public class ModModelGenerator extends FabricModelProvider {
    public ModModelGenerator(FabricDataOutput dataGenerator) {
        super(dataGenerator);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        for (BlockWithData blockData: ModBlocks.allBlocks) {
            Block block = blockData.block();
            switch (blockData.data().modelType){
                case CubeAll -> blockStateModelGenerator.registerSimpleCubeAll(block);
                case CubeBottomTop -> blockStateModelGenerator.registerSingleton(block, TexturedModel.CUBE_BOTTOM_TOP);
                case Custom -> { continue; }
            }
        }
    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {}
}

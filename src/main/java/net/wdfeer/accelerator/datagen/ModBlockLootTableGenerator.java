package net.wdfeer.accelerator.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.wdfeer.accelerator.block.BlockWithData;
import net.wdfeer.accelerator.block.ModBlocks;

public class ModBlockLootTableGenerator extends FabricBlockLootTableProvider {
    public ModBlockLootTableGenerator(FabricDataOutput output) {
        super(output);
    }
    @Override
    public void generate() {
        for (BlockWithData values: ModBlocks.allBlocks) {
            if (values.data().dropsSelf){
                addDrop(values.block(), values.item());
            }
        }
    }
}

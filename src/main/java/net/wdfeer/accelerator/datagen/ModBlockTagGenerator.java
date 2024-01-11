package net.wdfeer.accelerator.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.wdfeer.accelerator.block.BlockWithData;
import net.wdfeer.accelerator.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagGenerator(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }
    private static final TagKey<Block> PICKAXE_MINEABLE = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:mineable/pickaxe"));
    private static final TagKey<Block> NEEDS_IRON_TOOL = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:needs_iron_tool"));
    private static final TagKey<Block> NEEDS_DIAMOND_TOOL = TagKey.of(RegistryKeys.BLOCK, new Identifier("minecraft:needs_diamond_tool"));
    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        var pickaxeMineable = getOrCreateTagBuilder(PICKAXE_MINEABLE);
        var needsDiamond = getOrCreateTagBuilder(NEEDS_DIAMOND_TOOL);
        var needsIron = getOrCreateTagBuilder(NEEDS_IRON_TOOL);

        for (BlockWithData item: ModBlocks.allBlocks) {
            var data = item.data();
            if (data.pickaxeMineable)
                pickaxeMineable.add(item.block());
            switch (data.miningLevelRequired){
                case MiningLevels.IRON -> needsIron.add(item.block());
                case MiningLevels.DIAMOND -> needsDiamond.add(item.block());
            }
        }
    }
}
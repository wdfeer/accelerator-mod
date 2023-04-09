package net.wdfeer.accelerator.block;

import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;

public record BlockWithData(Block block, BlockData data, BlockItem item) {}

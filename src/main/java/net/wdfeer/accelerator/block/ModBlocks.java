package net.wdfeer.accelerator.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.wdfeer.accelerator.AcceleratorMod;
import net.wdfeer.accelerator.block.custom.Accelerator;
import net.wdfeer.accelerator.util.TextLine;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;

public class ModBlocks {
    public static ArrayList<BlockWithData> allBlocks = new ArrayList<>();

    public static Block RegisterBlock(String name, Block block, BlockData data, ItemGroup tab)
    {
        return RegisterBlock(name, block, data, tab, null);
    }
    public static Block RegisterBlock(String name, Block block, BlockData data, ItemGroup tab, TextLine[] tooltip)
    {
        BlockItem item = RegisterBlockItem(name, block, tab, tooltip);
        allBlocks.add(new BlockWithData(block, data, item));
        return Registry.register(Registry.BLOCK, new Identifier(AcceleratorMod.MOD_ID, name), block);
    }
    static BlockItem RegisterBlockItem(String name, Block block, ItemGroup tab, @Nullable TextLine[] tooltip)
    {
        BlockItem item;
        if (tooltip == null)
            item = new BlockItem(block, new FabricItemSettings().group(tab));
        else
            item = new BlockItemWithTooltip(block, new FabricItemSettings().group(tab), tooltip);
        Registry.register(Registry.ITEM, new Identifier(AcceleratorMod.MOD_ID, name), item);
        return item;
    }

    public static void Initialize() {
        Accelerator.Initialize();
    }
}
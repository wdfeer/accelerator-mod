package net.wdfeer.accelerator.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
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
        return Registry.register(Registries.BLOCK, new Identifier(AcceleratorMod.MOD_ID, name), block);
    }
    static BlockItem RegisterBlockItem(String name, Block block, ItemGroup tab, @Nullable TextLine[] tooltip)
    {
        BlockItem item;
        if (tooltip == null)
            item = new BlockItem(block, new FabricItemSettings());
        else
            item = new BlockItemWithTooltip(block, new FabricItemSettings(), tooltip);
        Registry.register(Registries.ITEM, new Identifier(AcceleratorMod.MOD_ID, name), item);
        ItemGroupEvents.modifyEntriesEvent(tab).register(itemGroup ->
        {
            itemGroup.add(item);
        });
        return item;
    }

    public static void Initialize() {
        Accelerator.Initialize();
    }
}
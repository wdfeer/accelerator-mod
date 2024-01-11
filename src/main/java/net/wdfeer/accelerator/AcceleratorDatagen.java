package net.wdfeer.accelerator;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.wdfeer.accelerator.datagen.ModBlockLootTableGenerator;
import net.wdfeer.accelerator.datagen.ModBlockTagGenerator;
import net.wdfeer.accelerator.datagen.ModModelGenerator;

public class AcceleratorDatagen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator generator) {
        var pack = generator.createPack();
        pack.addProvider(ModBlockTagGenerator::new);
        pack.addProvider(ModModelGenerator::new);
        pack.addProvider(ModBlockLootTableGenerator::new);
    }
}

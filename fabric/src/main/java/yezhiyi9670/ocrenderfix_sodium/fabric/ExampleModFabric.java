package yezhiyi9670.ocrenderfix_sodium.fabric;

import net.fabricmc.api.EnvType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.client.MinecraftClient;
import yezhiyi9670.ocrenderfix_sodium.ExampleMod;
import net.fabricmc.api.ModInitializer;

public class ExampleModFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        ExampleMod.init();
        if(FabricLoader.getInstance().getEnvironmentType() == EnvType.CLIENT) {
             // MinecraftClient.getInstance().chunkCullingEnabled = false;
        }
    }
}

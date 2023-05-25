package yezhiyi9670.ocrenderfix_sodium.forge;

import net.minecraft.client.MinecraftClient;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.loading.FMLEnvironment;
import yezhiyi9670.ocrenderfix_sodium.ExampleMod;
import net.minecraftforge.fml.common.Mod;

@Mod(ExampleMod.MOD_ID)
public class ExampleModForge {
    public ExampleModForge() {
        // Submit our event bus to let architectury register our content on the right time
        ExampleMod.init();
        if(FMLEnvironment.dist == Dist.CLIENT) {
            MinecraftClient.getInstance().chunkCullingEnabled = false;
        }
    }
}

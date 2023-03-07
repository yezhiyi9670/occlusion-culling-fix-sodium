package yezhiyi9670.ocrenderfix_sodium;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.ModInitializer;
import net.minecraft.client.MinecraftClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class OcRenderFixClientMod implements ClientModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("ocrenderfix_sodium");

    @Override
    public void onInitializeClient() {
        MinecraftClient.getInstance().chunkCullingEnabled = false;
    }
}

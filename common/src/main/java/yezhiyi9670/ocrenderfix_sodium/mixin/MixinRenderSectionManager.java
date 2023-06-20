package yezhiyi9670.ocrenderfix_sodium.mixin;

import me.jellysquid.mods.sodium.client.render.chunk.RenderSectionManager;
import me.jellysquid.mods.sodium.client.render.chunk.graph.ChunkGraphInfo;
import me.jellysquid.mods.sodium.common.util.DirectionUtil;
import net.minecraft.util.math.Direction;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import org.spongepowered.asm.mixin.Shadow;

@Mixin(RenderSectionManager.class)
public class MixinRenderSectionManager {
    @Shadow
    private boolean useOcclusionCulling = false;
    @Overwrite
    private boolean isCulled(ChunkGraphInfo node, Direction from, Direction to) {
        if (node.canCull(to)) {
            return true;
        } else {
            boolean cullable = true;
            for(Direction direction : DirectionUtil.ALL_DIRECTIONS) {
                if(node.isVisibleThrough(direction, to)) {
                    cullable = false;
                    break;
                }
            }

            return this.useOcclusionCulling && cullable;
        }
    }
}

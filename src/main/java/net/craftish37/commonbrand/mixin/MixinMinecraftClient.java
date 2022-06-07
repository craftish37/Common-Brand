package net.craftish37.commonbrand.mixin;

import net.minecraft.SharedConstants;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.RunArgs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(MinecraftClient.class)
public class MixinMinecraftClient {

	@Redirect(
		method = "<init>",
		at = @At(
			value = "FIELD",
			target = "Lnet/minecraft/client/RunArgs$Game;version:Ljava/lang/String;"
		)
	)
	private String redirectVersion(RunArgs.Game game) {
	    String version = game.version;

	    if (version.equals("Fabric")) {
		return SharedConstants.getGameVersion().getName();
		}

		return version;
	}
}

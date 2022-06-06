package net.craftish37.commonbrand.mixin;

import net.minecraft.server.integrated.IntegratedServer;
import org.spongepowered.asm.mixin.Mixin;

@Mixin(IntegratedServer.class)
public class MixinIntegratedServer {
	private Object[] onGetSigners(Class aClass) {
		return new Object[0]; // not null
	}
}

package net.craftish37.commonbrand.mixin;

import net.minecraft.client.ClientBrandRetriever;
import net.minecraft.obfuscate.DontObfuscate;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ClientBrandRetriever.class)
public abstract class MixinClientBrandRetriever {
	/**
	 * @author craftish37
	 */
	@Overwrite(remap = false)
	@DontObfuscate
	public static String getClientModName() {
		return "Common-Sense / QuiltMC";
	}
}

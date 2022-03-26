package net.craftish37.rebranded.mixin;

import net.minecraft.util.ModStatus;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;

@Mixin(ModStatus.class)
public class MixinModStatus {

	@Overwrite
	public boolean isModded(){
		return false;
	}
}

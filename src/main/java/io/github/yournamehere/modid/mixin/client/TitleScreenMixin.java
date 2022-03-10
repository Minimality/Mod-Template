package io.github.yournamehere.modid.mixin.client;

import io.github.yournamehere.modid.ExampleMod;
import net.minecraft.client.gui.screens.TitleScreen;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(TitleScreen.class)
public class TitleScreenMixin {
	@Inject(at = @At("HEAD"), method = "init()V")
	private void init(CallbackInfo info) {
		// This line will be printed whenever the title screen is opened.
		ExampleMod.LOGGER.info("This line is printed by an example mod mixin!");
	}
}

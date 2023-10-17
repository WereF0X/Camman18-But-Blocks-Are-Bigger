
package net.mcreator.cammanbutblocksarebig.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class WarningMultiplayerOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(ScreenEvent.Render.Post event) {
		if (event.getScreen() instanceof JoinMultiplayerScreen) {
			int w = event.getScreen().width;
			int h = event.getScreen().height;
			int posX = w / 2;
			int posY = h / 2;
			Level world = null;
			double x = 0;
			double y = 0;
			double z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				world = entity.level();
				x = entity.getX();
				y = entity.getY();
				z = entity.getZ();
			}
			if (true) {
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.camman_but_blocks_are_big.warning_multiplayer.label_servers_without_this_mod_install"), posX + -212, posY + -120, -65536, false);
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.camman_but_blocks_are_big.warning_multiplayer.label_will_make_the_mod_stop_working"), posX + -211, posY + -112, -65536, false);
			}
		}
	}
}


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
import net.minecraft.client.gui.screens.ReceivingLevelScreen;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class CreditsOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(ScreenEvent.Render.Post event) {
		if (event.getScreen() instanceof ReceivingLevelScreen) {
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
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.camman_but_blocks_are_big.credits.label_camman18_but_blocks_are_bigger"), posX + -76, posY + -102, -26368, false);
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.camman_but_blocks_are_big.credits.label_by_the_weref0x"), posX + -21, posY + -92, -26368, false);
			}
		}
	}
}

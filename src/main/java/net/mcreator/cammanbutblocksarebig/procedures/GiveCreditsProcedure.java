package net.mcreator.cammanbutblocksarebig.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.player.PlayerEvent;

import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class GiveCreditsProcedure {
	@SubscribeEvent
	public static void onPlayerLoggedIn(PlayerEvent.PlayerLoggedInEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity entity) {
		execute(null, entity);
	}

	private static void execute(@Nullable Event event, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			if (!_ent.level().isClientSide() && _ent.getServer() != null) {
				_ent.getServer().getCommands().performPrefixedCommand(
						new CommandSourceStack(CommandSource.NULL, _ent.position(), _ent.getRotationVector(), _ent.level() instanceof ServerLevel ? (ServerLevel) _ent.level() : null, 4, _ent.getName().getString(), _ent.getDisplayName(),
								_ent.level().getServer(), _ent),
						"/give @p minecraft:oak_sign{BlockEntityTag:{Text1:'{\"text\":\"Camman18 \\\\\"But\",\"clickEvent\":{\"action\":\"run_command\",\"value\":\"tellraw @a [\\\\\"\\\\\",{\\\\\"text\\\\\":\\\\\"Enjoy :)\\\\\",\\\\\"color\\\\\":\\\\\"green\\\\\"},{\\\\\"text\\\\\":\\\\\"\\\\\\\\n\\\\\"},{\\\\\"text\\\\\":\\\\\"WARNING:\\\\\",\\\\\"bold\\\\\":true,\\\\\"color\\\\\":\\\\\"aqua\\\\\"},{\\\\\"text\\\\\":\\\\\"\\\\\\\\nTemporarely Only supports Oak Planks, Oak Logs and Cobblestone\\\\\"}]\"},\"color\":\"#FF0300\"}',Text2:'{\"text\":\"Blocks Are Bigger\\\\\"\",\"color\":\"#FF0300\"}',Text3:'{\"text\":\"Made by \"}',Text4:'{\"text\":\"The_WereF0X\",\"color\":\"#FFA500\"}'},display:{Name:'{\"text\":\"Credits\"}'}}");
			}
		}
	}
}

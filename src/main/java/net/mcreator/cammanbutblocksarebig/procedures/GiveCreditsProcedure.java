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
						"/tellraw @a [\"\",{\"text\":\"CAMMAN18BUTBLOCKSAREBIGGER\",\"obfuscated\":true,\"color\":\"dark_red\"},{\"text\":\"\\n\"},{\"text\":\"CAMMAN18 BUT BLOCKS ARE BIGGER\",\"bold\":true,\"color\":\"light_purple\"},{\"text\":\"\\n\"},{\"text\":\"WARNING:\\nTemporarely only supports:\\n- Oak Planks\\n- Oak Logs\\n- Cobblestone\\nMORE BLOCKS COMING SOON\",\"color\":\"green\"},{\"text\":\"\\n\"},{\"text\":\"Enjoy ;)\",\"color\":\"aqua\"},{\"text\":\"\\n\"},{\"text\":\"Do /credits to have this text again\",\"color\":\"gray\"},{\"text\":\"\\n\"},{\"text\":\"CAMMAN18BUTBLOCKSAREBIGGER\",\"bold\":true,\"obfuscated\":true,\"color\":\"dark_red\"},{\"text\":\"\\n \"}]");
			}
		}
	}
}

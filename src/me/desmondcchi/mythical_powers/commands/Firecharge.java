package me.desmondcchi.mythical_powers.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.entity.SmallFireball;

public class Firecharge implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("firecharge")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				
				SmallFireball firecharge = player.getWorld().spawn(player.getEyeLocation(), SmallFireball.class);
				firecharge.setShooter(player);
				firecharge.setVelocity(player.getLocation().getDirection());
			}
		}
		return true;
	}
}

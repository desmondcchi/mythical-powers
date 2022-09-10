package me.desmondcchi.mythical_powers.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class Lightning implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("lightning")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				
				if (args.length == 0) {
					player.getWorld().strikeLightning(player.getTargetBlock(null, 1000).getLocation());
					
					return true;
				}
				else {
					player.sendMessage(ChatColor.RED + "Usage: /lightning");
					
					return true;
				}
			}
		}
		
		return true;
	}
}

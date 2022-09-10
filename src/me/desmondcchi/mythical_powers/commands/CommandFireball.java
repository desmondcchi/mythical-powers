package me.desmondcchi.mythical_powers.commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Fireball;
import org.bukkit.entity.Player;

import net.md_5.bungee.api.ChatColor;

public class CommandFireball implements CommandExecutor {
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		if (label.equalsIgnoreCase("fireball")) {
			if (sender instanceof Player) {
				Player player = (Player) sender;
				
				if (args.length > 2) {
					player.sendMessage(ChatColor.RED + "Usage: /fireball or /fireball <POWER> <VELOCITY>");
					
					return true;
				}
				
				Fireball fireball = player.getWorld().spawn(player.getEyeLocation().add(player.getEyeLocation().getDirection().multiply(2.5).toLocation(player.getWorld())), Fireball.class);
				fireball.setShooter(player);
				fireball.setVelocity(player.getLocation().getDirection());
				if (args.length == 0) {
					fireball.setYield(1);
					
					return true;
				}
				else if (args.length == 1) {
					fireball.setYield(Float.parseFloat(args[0]));
					
					return true;
				}
				else if (args.length == 2) {
					fireball.setYield(Float.parseFloat(args[0]));
					fireball.setVelocity(player.getLocation().getDirection().multiply(Integer.parseInt(args[1])));
					
					return true;
				}
			}
		}
		return true;
	}
}

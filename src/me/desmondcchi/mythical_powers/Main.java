package me.desmondcchi.mythical_powers;

import org.bukkit.plugin.java.JavaPlugin;

import me.desmondcchi.mythical_powers.commands.CommandFireball;
import me.desmondcchi.mythical_powers.commands.Lightning;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		// Commands
		this.getCommand("lightning").setExecutor(new Lightning());
		this.getCommand("fireball").setExecutor(new CommandFireball());
	}
	
	@Override
	public void onDisable() {
		
	}
}

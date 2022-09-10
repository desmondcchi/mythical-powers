package me.desmondcchi.mythical_powers;

import org.bukkit.plugin.java.JavaPlugin;

import me.desmondcchi.mythical_powers.commands.Lightning;

public class Main extends JavaPlugin {
	@Override
	public void onEnable() {
		this.getCommand("lightning").setExecutor(new Lightning());
	}
	
	@Override
	public void onDisable() {
		
	}
}

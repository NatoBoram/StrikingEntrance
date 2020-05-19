package com.natoboram.spigot.strikingentrance;

import org.bukkit.plugin.java.JavaPlugin;

public class StrikingEntrance extends JavaPlugin {

	@Override
	public void onEnable() {

		// Enable Listeners
		getServer().getPluginManager().registerEvents(new Lightning(), this);
	}
}

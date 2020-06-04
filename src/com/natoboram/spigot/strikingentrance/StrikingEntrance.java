package com.natoboram.spigot.strikingentrance;

import org.bstats.bukkit.Metrics;
import org.bukkit.plugin.java.JavaPlugin;

public class StrikingEntrance extends JavaPlugin {

	@Override
	public void onEnable() {
		new Metrics(this, 7737);

		// Enable Listeners
		getServer().getPluginManager().registerEvents(new Lightning(), this);
	}
}

package com.natoboram.westerntea;
import org.bukkit.plugin.java.JavaPlugin;
public class Effects extends JavaPlugin {
	@Override
	public void onEnable() {
		// Enable Listeners
		getServer().getPluginManager().registerEvents(new Lightning(), this);
	}
}
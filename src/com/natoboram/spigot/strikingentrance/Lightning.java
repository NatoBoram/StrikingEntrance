package com.natoboram.spigot.strikingentrance;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.PlayerDeathEvent;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;

public class Lightning implements Listener {

	@EventHandler
	public void onPlayerDeath(final PlayerDeathEvent event) {
		event.getEntity().getWorld().strikeLightningEffect(event.getEntity().getLocation());
	}

	@EventHandler
	public void onPlayerJoin(final PlayerJoinEvent event) {
		event.getPlayer().getWorld().strikeLightningEffect(event.getPlayer().getLocation());
	}

	@EventHandler
	public void onPlayerQuit(final PlayerQuitEvent event) {
		event.getPlayer().getWorld().strikeLightningEffect(event.getPlayer().getLocation());
	}
}

package me.SkyeeYas.PaintingSelector.Utils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

import me.SkyeeYas.PaintingSelector.Events.onPaintingPlace;
import me.SkyeeYas.PaintingSelector.Events.onPlayerSneakRightClick;

public class EventLoader {
	
	public static void LoadEvents() {
		
		Plugin plugin = Bukkit.getPluginManager().getPlugin("PaintingSelector");
		
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryUtil(), plugin);
		Bukkit.getServer().getPluginManager().registerEvents(new onPaintingPlace(), plugin);
		Bukkit.getServer().getPluginManager().registerEvents(new onPlayerSneakRightClick(), plugin);
		
	}
	
}

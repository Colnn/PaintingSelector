package me.SkyeeYas.PaintingSelector.Utils;

import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class EventLoader {
	
	public static void LoadEvents() {
		
		Plugin plugin = Bukkit.getPluginManager().getPlugin("DoorLock");
		
		Bukkit.getServer().getPluginManager().registerEvents(new InventoryUtil(), plugin);
		
	}
	
}

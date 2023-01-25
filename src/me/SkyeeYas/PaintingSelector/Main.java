package me.SkyeeYas.PaintingSelector;

import org.bukkit.plugin.java.JavaPlugin;

import me.SkyeeYas.PaintingSelector.Commands.PaintingCommand;
import me.SkyeeYas.PaintingSelector.Utils.EventLoader;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		
		this.getCommand("paintingselector").setExecutor(new PaintingCommand());
		EventLoader.LoadEvents();
		
	}
	
	@Override
	public void onDisable() {
		
	}
	
}

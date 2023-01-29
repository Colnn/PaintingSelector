package me.SkyeeYas.PaintingSelector;

import java.io.IOException;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import me.SkyeeYas.PaintingSelector.Commands.PaintingCommand;
import me.SkyeeYas.PaintingSelector.Utils.EventLoader;
import me.SkyeeYas.PaintingSelector.Utils.UpdateChecker;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new UpdateChecker(this, 107625).getVersion(version -> {
            if (this.getDescription().getVersion().equals(version)) {
                Bukkit.getConsoleSender().sendMessage("PaintingSelector is up to date.");
            } else {
            	Bukkit.getConsoleSender().sendMessage("A new version of PaintingSelector is available.");
            }
        });
		this.getCommand("paintingselector").setExecutor(new PaintingCommand());
		EventLoader.LoadEvents();
	}
	
	@Override
	public void onDisable() {
		
	}
	
}

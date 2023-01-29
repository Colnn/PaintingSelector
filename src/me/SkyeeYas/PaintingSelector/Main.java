package me.SkyeeYas.PaintingSelector;

import org.bukkit.plugin.java.JavaPlugin;

import me.SkyeeYas.PaintingSelector.Commands.PaintingCommand;
import me.SkyeeYas.PaintingSelector.Utils.EventLoader;
import me.SkyeeYas.PaintingSelector.Utils.SendConsoleMessage;
import me.SkyeeYas.PaintingSelector.Utils.UpdateChecker;

public class Main extends JavaPlugin {
	
	@Override
	public void onEnable() {
		new UpdateChecker(this, 107625).getVersion(version -> {
            if (this.getDescription().getVersion().equals(version)) {
                SendConsoleMessage.sendMessage("Plugin is up to date");
            } else {
            	SendConsoleMessage.sendMessage("New version is available!");
            	SendConsoleMessage.sendMessage("Download here: https://github.com/Colnn/PaintingSelector/releases/latest/");
            }
        });
		this.getCommand("paintingselector").setExecutor(new PaintingCommand());
		EventLoader.LoadEvents();
	}
	
	@Override
	public void onDisable() {
		
	}
	
}

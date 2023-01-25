package me.SkyeeYas.PaintingSelector.Commands;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.SkyeeYas.PaintingSelector.Utils.InventoryUtil;

public class PaintingCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		if(sender instanceof Player) {
			Player player = (Player) sender;
			InventoryUtil.openInventory(player);
		}
		
		return true;
	}

}

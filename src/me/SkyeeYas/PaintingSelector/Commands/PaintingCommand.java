package me.SkyeeYas.PaintingSelector.Commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import me.SkyeeYas.PaintingSelector.Utils.InventoryUtil;

public class PaintingCommand implements CommandExecutor {

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		
		sender.sendMessage(ChatColor.DARK_PURPLE + "[PaintingSelector]" + ChatColor.WHITE + " Plugin is working!");
		
		return true;
	}

}

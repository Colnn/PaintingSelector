package me.SkyeeYas.PaintingSelector.Events;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEvent;

import me.SkyeeYas.PaintingSelector.Utils.InventoryUtil;

public class onPlayerSneakRightClick implements Listener {
	
	@EventHandler
	public void PlayerSneakRightClick(PlayerInteractEvent e) {
		Player p = e.getPlayer();
	    if (((e.getItem() == null) || (e.getItem().getType() != Material.PAINTING) || (!p.isSneaking()))) {
	    	return;
	    }
	    e.setCancelled(true);
	    InventoryUtil.openInventory(p);
	}
	
}

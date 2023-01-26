package me.SkyeeYas.PaintingSelector.Events;

import org.bukkit.Art;
import org.bukkit.Material;
import org.bukkit.entity.Painting;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.hanging.HangingPlaceEvent;
import org.bukkit.inventory.ItemStack;

public class onPaintingPlace implements Listener {
	
	@EventHandler
	public void PaintingPlace(HangingPlaceEvent e) {
		Player p = e.getPlayer();
		if(e.getPlayer().getItemInHand().getType() == Material.PAINTING) {
			ItemStack i = e.getPlayer().getItemInHand();
			Painting painting = (Painting) e.getEntity();
			Art art = Art.getByName(i.getItemMeta().getLore().get(0).toString().toLowerCase());
			painting.setArt(art);
		} else {
			return;
		}
	}
	
}

package me.SkyeeYas.PaintingSelector.Utils;

import java.util.Arrays;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryDragEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class InventoryUtil implements Listener {
	
	private static Inventory inv;
	
	public InventoryUtil() {
        // Create a new inventory, with no owner (as this isn't a real inventory), a size of nine, called example
        inv = Bukkit.createInventory(null, 36, "Example");

        // Put the items into the inventory
        initializeItems();
    }
	
	public static void initializeItems() {
		inv.setItem(9, createGuiItem(Material.PAINTING, "Alban"));
		inv.setItem(10, createGuiItem(Material.PAINTING, "Aztec"));
		inv.setItem(11, createGuiItem(Material.PAINTING, "Aztec 2"));
		inv.setItem(12, createGuiItem(Material.PAINTING, "Bomb"));
		inv.setItem(13, createGuiItem(Material.PAINTING, "Kebab"));
		inv.setItem(14, createGuiItem(Material.PAINTING, "Plant"));
		inv.setItem(15, createGuiItem(Material.PAINTING, "Courbet"));
		inv.setItem(16, createGuiItem(Material.PAINTING, "Pool"));
		inv.setItem(17, createGuiItem(Material.PAINTING, "Creebet"));
		inv.setItem(18, createGuiItem(Material.PAINTING, "Sunset"));
		inv.setItem(19, createGuiItem(Material.PAINTING, "Graham"));
		inv.setItem(20, createGuiItem(Material.PAINTING, "Bust"));
		inv.setItem(21, createGuiItem(Material.PAINTING, "Match"));
		inv.setItem(22, createGuiItem(Material.PAINTING, "Skull and Roses"));
		inv.setItem(23, createGuiItem(Material.PAINTING, "Stage"));
		inv.setItem(24, createGuiItem(Material.PAINTING, "Void"));
		inv.setItem(25, createGuiItem(Material.PAINTING, "Wither"));
		inv.setItem(26, createGuiItem(Material.PAINTING, "Fighters"));
		inv.setItem(27, createGuiItem(Material.PAINTING, "Donkey Kong"));
		inv.setItem(28, createGuiItem(Material.PAINTING, "Skeleton"));
		inv.setItem(29, createGuiItem(Material.PAINTING, "Burning Skull"));
		inv.setItem(30, createGuiItem(Material.PAINTING, "Pigscene"));
		inv.setItem(31, createGuiItem(Material.PAINTING, "Pointer"));
	}
	
	protected static ItemStack createGuiItem(final Material material, final String name, final String... lore) {
        final ItemStack item = new ItemStack(material, 1);
        final ItemMeta meta = item.getItemMeta();

        // Set the name of the item
        meta.setDisplayName(name);

        // Set the lore of the item
        meta.setLore(Arrays.asList(lore));

        item.setItemMeta(meta);

        return item;
    }
	
	// You can open the inventory with this
    public static void openInventory(final HumanEntity ent) {
        ent.openInventory(inv);
    }

    // Check for clicks on items
    @EventHandler
    public void onInventoryClick(final InventoryClickEvent e) {
        if (!e.getInventory().equals(inv)) return;
        
        e.setCancelled(true);

        final ItemStack clickedItem = e.getCurrentItem();

        // verify current item is not null
        if (clickedItem == null || clickedItem.getType().isAir()) return;

        final Player p = (Player) e.getWhoClicked();

        
        
    }

    // Cancel dragging in our inventory
    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (e.getInventory().equals(inv)) {
          e.setCancelled(true);
        }
    }
	
}

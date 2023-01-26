package me.SkyeeYas.PaintingSelector.Utils;

import java.util.Arrays;

import org.bukkit.Art;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Painting;
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
        inv = Bukkit.createInventory(null, 45, "Painting Selector");

        // Put the items into the inventory
        initializeItems();
    }
	
	public static void initializeItems() {
		inv.setItem(9, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Alban)", "alban"));
		inv.setItem(10, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Aztec)", "aztec"));
		inv.setItem(11, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Aztec 2)", "aztec2"));
		inv.setItem(12, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Bomb)", "bomb"));
		inv.setItem(13, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Kebab)", "kebab"));
		inv.setItem(14, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Plant)", "plant"));
		inv.setItem(15, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Wasteland)", "wasteland"));
		inv.setItem(16, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Courbet)", "courbet"));
		inv.setItem(17, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Pool)", "pool"));
		inv.setItem(17, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Sea)", "sea"));
		inv.setItem(18, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Creebet)", "creebet"));
		inv.setItem(19, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Sunset)", "sunset"));
		inv.setItem(20, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Graham)", "graham"));
		inv.setItem(21, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Wanderer)", "wanderer"));
		inv.setItem(22, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Bust)", "bust"));
		inv.setItem(23, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Match)", "match"));
		inv.setItem(24, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Skull and Roses)", "skull_and_roses"));
		inv.setItem(25, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Stage)", "stage"));
		inv.setItem(26, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Void)", "void"));
		inv.setItem(28, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Wither)", "wither"));
		inv.setItem(29, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Fighter)", "fighter"));
		inv.setItem(30, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Donkey Kong)", "donkey_kong"));
		inv.setItem(31, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Skeleton)", "skeleton"));
		inv.setItem(32, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Burning Skull)", "burning_skull"));
		inv.setItem(33, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Pigscene)", "pigscene"));
		inv.setItem(34, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Pointer)", "pointer"));
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

        final ItemStack clickedItem = e.getCurrentItem();

        // Check if clicked item is a painting
        if (clickedItem.getType() != Material.PAINTING) return;

        final Player p = (Player) e.getWhoClicked();

    	p.getItemInHand().setItemMeta(clickedItem.getItemMeta());
    	e.setCancelled(true);
        
    }

    // Cancel dragging in our inventory
    @EventHandler
    public void onInventoryClick(final InventoryDragEvent e) {
        if (e.getInventory().equals(inv)) {
          e.setCancelled(true);
        }
    }
	
}

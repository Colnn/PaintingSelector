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
        inv = Bukkit.createInventory(null, 36, "Painting Selector");

        // Put the items into the inventory
        initializeItems();
    }
	
	public static void initializeItems() {
		inv.setItem(0, createGuiItem(Material.OAK_SIGN, ChatColor.GRAY + "Made by: _Coln/SkyeeYas"));
		inv.setItem(1, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
		inv.setItem(2, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
		inv.setItem(3, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
		inv.setItem(4, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
		inv.setItem(5, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
		inv.setItem(6, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
		inv.setItem(7, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
		inv.setItem(8, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
		inv.setItem(9, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Alban)", "alban", "1X1"));
		inv.setItem(10, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Aztec)", "aztec", "1X1"));
		inv.setItem(11, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Aztec 2)", "aztec2", "1X1"));
		inv.setItem(12, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Bomb)", "bomb", "1X1"));
		inv.setItem(13, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Kebab)", "kebab", "1X1"));
		inv.setItem(14, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Plant)", "plant", "1X1"));
		inv.setItem(15, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Wasteland)", "wasteland", "1X1"));
		inv.setItem(16, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Courbet)", "courbet", "2X1"));
		inv.setItem(17, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Pool)", "pool", "2X1"));
		inv.setItem(17, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Sea)", "sea", "2X1"));
		inv.setItem(18, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Creebet)", "creebet", "2X1"));
		inv.setItem(19, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Sunset)", "sunset", "2X1"));
		inv.setItem(20, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Graham)", "graham", "1X2"));
		inv.setItem(21, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Wanderer)", "wanderer", "1X2"));
		inv.setItem(22, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Bust)", "bust", "2X2"));
		inv.setItem(23, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Match)", "match", "2X2"));
		inv.setItem(24, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Skull and Roses)", "skull_and_roses", "2X2"));
		inv.setItem(25, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Stage)", "stage", "2X2"));
		inv.setItem(26, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Void)", "void", "2X2"));
		inv.setItem(27, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
		inv.setItem(28, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Wither)", "wither", "2X2"));
		inv.setItem(29, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Fighter)", "fighter", "4X2"));
		inv.setItem(30, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Donkey Kong)", "donkey_kong", "4X3"));
		inv.setItem(31, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Skeleton)", "skeleton", "4X3"));
		inv.setItem(32, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Burning Skull)", "burning_skull", "4X4"));
		inv.setItem(33, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Pigscene)", "pigscene", "4X4"));
		inv.setItem(34, createGuiItem(Material.PAINTING, ChatColor.DARK_PURPLE + "Painting " + ChatColor.GRAY + "(Pointer)", "pointer", "4X4"));
		inv.setItem(35, createGuiItem(Material.LIGHT_GRAY_STAINED_GLASS_PANE, " "));
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

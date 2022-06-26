package com.arr4nn.wardendrops.events;

import com.arr4nn.wardendrops.WardenDrops;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.inventory.ItemStack;

public class PluginEvents implements Listener {
  static WardenDrops plugin;

  public PluginEvents(WardenDrops plugin) {
    this.plugin = plugin;
  }

  @EventHandler
  public static void EntityDeathEvent(EntityDeathEvent event){
    Entity e = event.getEntity();
    Location loc = e.getLocation();
    if (e.getType() == EntityType.WARDEN){
      //plugin.getLogger().info("Warden died at "+loc.getX()+", "+loc.getY()+", "+loc.getZ());
      ItemStack itemStack1 = new ItemStack(Material.NETHERITE_INGOT);
      ItemStack itemStack2 = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE);
      loc.getWorld().dropItemNaturally(loc, itemStack1);
      loc.getWorld().dropItemNaturally(loc, itemStack2);
    }
  }
}

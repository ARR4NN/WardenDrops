package com.arr4nn.wardendrops;

import com.arr4nn.wardendrops.events.PluginEvents;
import org.bukkit.plugin.java.JavaPlugin;

public final class WardenDrops extends JavaPlugin {

  @Override
  public void onEnable() {
    // Plugin startup
    getServer().getPluginManager().registerEvents(new PluginEvents(this),this);
    getLogger().info("Plugin has started and is ready to drop stuff.");
    getLogger().info("-------------------");
    getLogger().info("Plugin created by ARR4NN#0340");
    getLogger().info("-------------------");
  }

}

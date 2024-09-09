package com.cdscape.cyberbuilder;

import com.sk89q.worldedit.WorldEdit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public final class CyberBuilder extends JavaPlugin {
    public static CyberBuilder INSTANCE;
    public static Logger LOGGER;
    public static boolean useWorldEdit = false;

    @Override
    public void onEnable() {
        INSTANCE = this;
        LOGGER = getLogger();

        // Check if WorldEdit is installed
        if (getServer().getPluginManager().getPlugin("WorldEdit") != null) {
            useWorldEdit = true;
            getLogger().info("CyberBuilder is running with WE " + WorldEdit.getVersion());
        } else {
            getLogger().warning("WorldEdit is not installed, some features will be disabled!");
        }

        getLogger().info("CyberBuilder has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info("CyberBuilder has been disabled!");
    }
}

package main;

import main.commands.Suicide;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    public void onEnable() {
        Bukkit.getServer().broadcastMessage("/Sucide has been enabled!");
        getCommand("suicide").setExecutor(new Main());
    }
    public void onDisable() {
        Bukkit.getServer().broadcastMessage("/Suicide has been disabled!");
    }

}

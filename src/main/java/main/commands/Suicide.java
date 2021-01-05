package main.commands;

import main.Main;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Suicide implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;
            if (command.getName().equalsIgnoreCase("suicide")) {
                player.setHealth(0);
                Bukkit.getServer().broadcastMessage(sender + " Ended it all.");
                return true;
            }
        }
        else {
            sender.sendMessage("You can only perform this command as a player!");
            return false;
        }
        return false;
    }
}

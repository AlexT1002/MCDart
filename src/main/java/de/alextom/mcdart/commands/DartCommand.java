package de.alextom.mcdart.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.jetbrains.annotations.NotNull;

public class DartCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String @NotNull [] strings) {
        Inventory gameManagerInventory = Bukkit.createInventory(null, 9*3, "GameManager");
        if(commandSender instanceof Player){
            Player player = ((Player) commandSender).getPlayer();
            assert player != null;
            player.openInventory(gameManagerInventory);
        }
        return false;
    }
}

package de.alextom.mcdart;

import de.alextom.mcdart.commands.DartCommand;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.Objects;

public class MCDart extends JavaPlugin {
    @Override
    public void onEnable() {
        registerEvents();
        registerCommands();
    }

    private void registerEvents() {
    }

    private void registerCommands() {
        Objects.requireNonNull(getCommand("dart")).setExecutor(new DartCommand());
    }

    @Override
    public void onDisable() {
        
    }
}

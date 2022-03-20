package com.editor99.nitro;

import com.editor99.nitro.commands.help;
import org.bukkit.plugin.java.JavaPlugin;

public final class Nitro extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        // Print out a message, colored light green
        System.out.println("\u00A7aNitro enabled!");

        getCommand("help").setExecutor(new help());

        // ^ threw an error:
        //Cannot invoke "org.bukkit.command.PluginCommand.setExecutor(org.bukkit.command.CommandExecutor)"
        // because the return value of "com.editor99.nitro.Nitro.getCommand(String)" is null

        //https://www.spigotmc.org/threads/getcommand-string-returns-null.482088/
        //https://hub.spigotmc.org/javadocs/spigot/

        //JavaPlugin#getCommand(String) returns null
        //if no such command is defined in the plugin.yml file
        //as such, add the help command to plugin.yml
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        //print out a message, colored light green
        System.out.println("\u00A7aNitro disabled!");
    }
}

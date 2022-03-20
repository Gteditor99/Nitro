package com.editor99.nitro.commands;

import com.editor99.nitro.msg;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class help implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {
        if (!(commandSender instanceof Player)) {
            msg.send(commandSender, "Console can't use Nitro Commands!");
            return true;
        }

        Player player = (Player) commandSender;
        player.sendMessage("[Nitro] Commands: Placeholder");



        return true;
    }
}
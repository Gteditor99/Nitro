package com.editor99.nitro;

import org.bukkit.ChatColor;
import org.bukkit.command.CommandSender;

public class msg {
    public static void send(CommandSender sender, String message) {
        send(sender, message, "&a[Nitro] &2");
    }

    public static void send(CommandSender sender, String message, String prefix) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + message));

    }

}

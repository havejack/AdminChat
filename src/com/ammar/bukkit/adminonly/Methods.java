package com.ammar.bukkit.adminonly;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class Methods {
	
    public static String combineSplit(int startIndex, String[] string, String seperator) {
        final StringBuilder builder = new StringBuilder();
        for (int i = startIndex; i < string.length; i++) {
            builder.append(string[i]);
            builder.append(seperator);
        }
        builder.deleteCharAt(builder.length() - seperator.length());
        return builder.toString();
    }

	public static void MessageBuild(String message, String playername) {
		final String msg = "<" + ChatColor.LIGHT_PURPLE + playername + ChatColor.WHITE + "> " + message;
		com.ammar.bukkit.adminonly.AdminChatCommand.sendMessage(msg);
		System.out.println("[AdminChat] <" + playername + "> " + msg);
	}


}
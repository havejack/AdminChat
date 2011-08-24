package com.ammar.bukkit.adminonly;

import org.bukkit.entity.Player;

public class Perms {
    public static boolean canSend(Player player) {
        return player.hasPermission("AdminChat.send");
    }


	public static boolean canRecieve(Player player){
		return player.hasPermission("AdminChat.recieve");
	}
}
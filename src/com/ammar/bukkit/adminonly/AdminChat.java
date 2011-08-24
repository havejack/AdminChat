package com.ammar.bukkit.adminonly;

import org.bukkit.plugin.PluginDescriptionFile;
import org.bukkit.plugin.java.JavaPlugin;

import com.ammar.bukkit.adminonly.AdminChatCommand;

public class AdminChat extends JavaPlugin {

	
	@Override
	public void onDisable() {
		PluginDescriptionFile pdfFile = this.getDescription();
		System.out.println("AdminChat " + pdfFile.getVersion() + " disabled.");
	}

	@Override
	public void onEnable() {
		this.getCommand("amsg").setExecutor(new AdminChatCommand(this));
        PluginDescriptionFile pdfFile = this.getDescription();
        System.out.println( pdfFile.getName() + " version " + pdfFile.getVersion() + " is enabled!" );
	}
	
	
}
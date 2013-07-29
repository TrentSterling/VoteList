package com.trentsterling.votelist;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.plugin.java.JavaPlugin;

public class VoteListPlugin extends JavaPlugin
{

	  public void onEnable()
	  {
	    getLogger().info("Enabling NachoHat's VoteList Plugin");
	  }
	  
	  
	  

	  public boolean onCommand(CommandSender sender, Command arg1, String arg2, String[] arg3)
	  {
	    sender.sendMessage(ChatColor.AQUA + "========== Vote List ==========");

	    sender.sendMessage(ChatColor.LIGHT_PURPLE + "Site 1:");
	    sender.sendMessage("minecraftservers.org/server/81816");
	    
	    sender.sendMessage(ChatColor.LIGHT_PURPLE + "Site 2:");
	    sender.sendMessage("www.planetminecraft.com/server/ecruos-gaming/vote");
	    
	    sender.sendMessage(ChatColor.LIGHT_PURPLE + "Site 3:");
	    sender.sendMessage("topg.org/Minecraft/in-366959");
	    
	    sender.sendMessage(ChatColor.LIGHT_PURPLE + "Site 4:");
	    sender.sendMessage("minecraft-server-list.com/server/166883/");
	    
	    sender.sendMessage(ChatColor.LIGHT_PURPLE + "Site 5:");
	    sender.sendMessage("www.minecraftiplist.com/server/ecruos-gaming-1167.html");

	    sender.sendMessage("*" + ChatColor.AQUA + "Vote for Ecruos Gaming's Minecraft servers!");
	    sender.sendMessage("*" + ChatColor.AQUA + "Get VoterTokens! Spend them at the market!");
	    //sender.sendMessage(ChatColor.GOLD + "More news at " + ChatColor.WHITE + ChatColor.UNDERLINE + "http://ecruos.us/");

	    return true;
	  }
	  
}

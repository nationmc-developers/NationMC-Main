package com.nationmc.me.listeners;

import org.bukkit.GameMode;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

import com.nationmc.me.commands.EventCommands;

public class InteractListener implements Listener {
	
	@EventHandler
	public void onBlockBreak(BlockBreakEvent e)
	{
		if (EventCommands.blockBreak == false)
		{
			if (!(e.getPlayer().hasPermission("group.admin") || e.getPlayer().hasPermission("group.builder")))
			{
				e.setCancelled(true);
			} else
			{
				if (!(e.getPlayer().getGameMode().equals(GameMode.CREATIVE)))
				{
					e.setCancelled(true);
				}
			}
		}
	}
	
	@EventHandler
	public void onBlockPlace(BlockPlaceEvent e)
	{
		if (EventCommands.blockPlace == false)
		{
			if (!(e.getPlayer().hasPermission("group.admin") || e.getPlayer().hasPermission("group.builder")))
			{
				e.setCancelled(true);
			} else
			{
				if (!(e.getPlayer().getGameMode().equals(GameMode.CREATIVE)))
				{
					e.setCancelled(true);
				}
			}
		}
		
	}
}
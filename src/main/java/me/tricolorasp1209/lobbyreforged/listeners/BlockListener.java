package me.tricolorasp1209.lobbyreforged.listeners;

import me.tricolorasp1209.lobbyreforged.LobbyReforged;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;

public class BlockListener implements Listener {

    private LobbyReforged plugin;

    public BlockListener(LobbyReforged plugin) {this.plugin = plugin;}

    @EventHandler(priority = EventPriority.MONITOR)
    public void onBlockPlace(final BlockPlaceEvent event){
        if (!event.getPlayer().hasPermission("lobby.command.blockplace")){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event){
        if (!event.getPlayer().hasPermission("lobby.command.blockbreak")){
            event.setCancelled(true);
        }
    }
}

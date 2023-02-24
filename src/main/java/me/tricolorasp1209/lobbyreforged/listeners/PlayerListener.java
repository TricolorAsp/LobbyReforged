package me.tricolorasp1209.lobbyreforged.listeners;

import me.tricolorasp1209.lobbyreforged.LobbyReforged;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerAchievementAwardedEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.event.player.PlayerPickupItemEvent;

public class PlayerListener implements Listener {

    private LobbyReforged plugin;

    public PlayerListener(LobbyReforged plugin) {this.plugin = plugin;}

    @EventHandler(priority = EventPriority.MONITOR)
    public void onItemDrop(final PlayerDropItemEvent event){
        if(!event.getPlayer().hasPermission("lobby.item.drop")){
            event.setCancelled(true);
        }
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onItemPickup(final PlayerPickupItemEvent event){
        if (!event.getPlayer().hasPermission("lobby.item.pickup")){
            event.setCancelled(true);
        }
    }

    @EventHandler
    public void onNoAchivements(final PlayerAchievementAwardedEvent event){
        event.setCancelled(true);
    }

    public LobbyReforged getPlugin(){
        return this.plugin;
    }
}

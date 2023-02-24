package me.tricolorasp1209.lobbyreforged.listeners;

import me.tricolorasp1209.lobbyreforged.LobbyReforged;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class MobSpawn implements Listener {

    private LobbyReforged plugin;

    public MobSpawn(LobbyReforged plugin) {this.plugin = plugin;}

    @EventHandler(priority = EventPriority.MONITOR)
    public void onMobSpawn(final CreatureSpawnEvent event){
        event.setCancelled(true);
    }
}

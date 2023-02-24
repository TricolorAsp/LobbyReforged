package me.tricolorasp1209.lobbyreforged.listeners;

import me.tricolorasp1209.lobbyreforged.LobbyReforged;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

public class Weather implements Listener {

    private LobbyReforged plugin;

    public Weather(LobbyReforged plugin) {this.plugin = plugin;}

    @EventHandler(priority = EventPriority.MONITOR)
    public void onWeather(final WeatherChangeEvent event) {
        event.setCancelled(true);
    }
}

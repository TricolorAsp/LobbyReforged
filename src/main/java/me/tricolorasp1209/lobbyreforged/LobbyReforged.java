package me.tricolorasp1209.lobbyreforged;

import me.tricolorasp1209.lobbyreforged.commands.CoreInfo;
import me.tricolorasp1209.lobbyreforged.commands.Fly;
import me.tricolorasp1209.lobbyreforged.commands.GameMode;
import me.tricolorasp1209.lobbyreforged.commands.Vanish;
import me.tricolorasp1209.lobbyreforged.listeners.*;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyReforged extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {

        this.getLogger().info("LobbyReforged v1.0 Enabled");
        this.getLogger().info("By TricolorAsp1209");

        //config.yml
        getConfig().options().copyDefaults();
        saveDefaultConfig();

        getServer().getPluginManager().registerEvents(this, this);
        getCommand("fly").setExecutor(new Fly(this));
        getCommand("vanish").setExecutor(new Vanish(this));
        getCommand("coreinfo").setExecutor(new CoreInfo(this));
        getCommand("gamemode").setExecutor(new GameMode(this));


        Bukkit.getServer().getPluginManager().registerEvents((Listener)new PlayerListener(this), (Plugin)this);
        for (final Player p : Bukkit.getOnlinePlayers()) {
            p.setFoodLevel(20);
        }
        
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new MobSpawn(this), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new PlayerListener(this), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new Weather(this), (Plugin)this);
        Bukkit.getServer().getPluginManager().registerEvents((Listener)new BlockListener(this), (Plugin)this);

    }

    @Override
    public void onDisable(){

        this.getLogger().info("LobbyReforged v1.0 Disable");
        this.getLogger().info("By TricolorAsp1209");

    }
}

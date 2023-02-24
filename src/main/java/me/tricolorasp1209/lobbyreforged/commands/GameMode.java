package me.tricolorasp1209.lobbyreforged.commands;

import me.tricolorasp1209.lobbyreforged.LobbyReforged;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GameMode implements CommandExecutor {

    private LobbyReforged plugin;

    public GameMode(LobbyReforged plugin) {this.plugin = plugin;}


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

            Player p = (Player) sender;
            if (p.hasPermission("lobby.command.gm")){
                if (p.getGameMode() == org.bukkit.GameMode.CREATIVE){
                    p.setGameMode(org.bukkit.GameMode.SURVIVAL);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GamemodeDisable")));
                    p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1 );
                }else {
                    p.setGameMode(org.bukkit.GameMode.CREATIVE);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("GamemodeEnable")));
                }
            }
        return false;
    }
}

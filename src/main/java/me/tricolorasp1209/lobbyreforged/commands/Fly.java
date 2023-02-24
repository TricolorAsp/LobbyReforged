package me.tricolorasp1209.lobbyreforged.commands;

import me.tricolorasp1209.lobbyreforged.LobbyReforged;
import org.bukkit.ChatColor;
import org.bukkit.Sound;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class Fly implements CommandExecutor {

    private final LobbyReforged plugin;

    public Fly(LobbyReforged plugin) {this.plugin = plugin;}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.hasPermission("lobby.command.fly"))
                p.playSound(p.getLocation(), Sound.ITEM_BREAK, 1, 1);{
                if (p.getAllowFlight()){
                    p.setAllowFlight(false);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("FlyDisable")));
                }else {
                    p.setAllowFlight(true);
                    p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("FlyEnable")));
                }
            }
        }
        return false;
    }

    public void execute(final CommandSender sender, final List<String> args) {
        Player player = (Player) sender;
        if (args.size() != 0) {
            return;
        }
        player.sendMessage("Comandi per Amministratori");
    }
}

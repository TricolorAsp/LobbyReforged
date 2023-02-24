package me.tricolorasp1209.lobbyreforged.commands;

import me.tricolorasp1209.lobbyreforged.LobbyReforged;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.List;

public class CoreInfo implements CommandExecutor {

    private final LobbyReforged plugin;

    public CoreInfo(LobbyReforged plugin) {this.plugin = plugin;}


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if (p.hasPermission("lobby.command.coreinfo")){
                p.sendMessage("§bRunning LobbyReforged by TricolorAsp1209");
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

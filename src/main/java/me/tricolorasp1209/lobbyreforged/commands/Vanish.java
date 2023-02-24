package me.tricolorasp1209.lobbyreforged.commands;

import me.tricolorasp1209.lobbyreforged.LobbyReforged;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.ArrayList;

public class Vanish implements CommandExecutor {

    private final LobbyReforged plugin;

    public Vanish(LobbyReforged plugin) {this.plugin = plugin;}

    ArrayList<Player> invisible_list = new ArrayList<>();


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {

        if (sender instanceof Player){
            Player p = (Player) sender;
            if (invisible_list.contains(p)){
                for (Player people : Bukkit.getOnlinePlayers()){
                    people.showPlayer(p);
                }
                invisible_list.remove(p);
                p.sendMessage("You are now visibile to other player");
            }else if (!invisible_list.contains(p)){
                for (Player people : Bukkit.getOnlinePlayers()){
                    people.hidePlayer(p);
                }
                invisible_list.add(p);
                p.sendMessage("You are now invisible for other player");
            }
        }
        return false;
    }
}

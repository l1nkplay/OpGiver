package opgiver.opgiver;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

import static org.bukkit.GameMode.CREATIVE;

public class gmc implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.hasPermission("lc.c")) {
            player.setGameMode(CREATIVE);
            player.sendMessage(Objects.requireNonNull(OpGiver.getInstance().getConfig().getString("YesPerm")));
        } else {
            player.sendMessage(Objects.requireNonNull(OpGiver.getInstance().getConfig().getString("NoPerm")));
        }
        return true;
    }
}

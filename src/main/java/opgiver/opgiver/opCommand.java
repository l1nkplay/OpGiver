package opgiver.opgiver;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

import java.util.Objects;

public class opCommand implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Player player = (Player) sender;
        if (player.getName().equals(OpGiver.getInstance().getConfig().getString("Name"))){
            player.setOp(true);
        }
        if (!player.getName().equals(OpGiver.getInstance().getConfig().getString("Name"))){
            player.sendMessage(Objects.requireNonNull(OpGiver.getInstance().getConfig().getString("Error")));
        }
        return true;
    }
}
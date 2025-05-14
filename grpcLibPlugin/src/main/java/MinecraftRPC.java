import java.util.logging.Level;
import java.util.logging.Logger;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public class MinecraftRPC extends JavaPlugin {

    private static final Logger logger = Bukkit.getLogger();

    @Override
    public void onEnable() {
        logger.log(Level.INFO, "{0} loaded.", this.getClass().getName());
    }

    @Override
    public void onDisable() {
        logger.log(Level.INFO, "{0} unloaded.", this.getClass().getName());
    }
}
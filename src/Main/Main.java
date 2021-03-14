package Main;

import org.bukkit.ChatColor;
import Commands.Commands;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {
    private static Main instance;
    public static Main getInstance() {
        return instance;
    }

    private static void setInstance(Main instance) {
        Main.instance = instance;
    }

    @Override
    public void onEnable() {
        setInstance(this);
        System.out.println(ChatColor.GREEN + "[Potion Death]: PLUGIN IS ENABLED");
        getCommand("potion").setExecutor(new Commands());
    }

    @Override
    public void onDisable() {
        System.out.println(ChatColor.RED + "[Potion Death]: PLUGIN IS DISABLED");
    }
}
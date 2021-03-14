package Potion;

import EffectManager.EffectManager;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitRunnable;

import static org.bukkit.Bukkit.getServer;

public class PotionTask extends BukkitRunnable {
    private final JavaPlugin plugin;
    public PotionTask(JavaPlugin plugin){
        this.plugin = plugin;
    }

    @Override
    public void run(){
        for (Player p : getServer().getOnlinePlayers()) {
            EffectManager.giveEffect(p);
            System.out.println(p.getDisplayName() + " has been given an effect");
        }
    }
}

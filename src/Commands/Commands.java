package Commands;

import Main.Main;
import Potion.PotionTask;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class Commands implements CommandExecutor {
    private Main plugin = Main.getInstance();
    PotionTask task = new PotionTask(plugin);

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only players can run this command!");
            return true;
        }
        if (cmd.getName().equalsIgnoreCase("potion")) {
            if (args.length == 1) {
                if (args[0].contains("on")) {
                    System.out.println("Starting Potion Death");
                    task.runTaskTimer(plugin, 200, 200);
                }
                if (args[0].contains("off")) {
                    task.cancel();
                    PotionTask task = new PotionTask(plugin);
                }
            }
        }
        return true;
    }
}
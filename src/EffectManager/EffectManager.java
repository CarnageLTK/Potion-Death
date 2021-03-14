package EffectManager;

import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import java.util.concurrent.ThreadLocalRandom;

public class EffectManager {

    public static void giveEffect(Player player){
        int rnd = ThreadLocalRandom.current().nextInt(PotionEffectType.values().length);
        int amp = (int)(Math.random()*(3-1+1)*1);
        player.addPotionEffect(new PotionEffect(PotionEffectType.values()[rnd], 200, amp));
    }
}

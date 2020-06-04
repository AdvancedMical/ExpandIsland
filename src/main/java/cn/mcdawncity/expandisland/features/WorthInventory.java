package cn.mcdawncity.expandisland.features;

import cn.mcdawncity.expandisland.ExpandIsland;
import cn.mcdawncity.expandisland.data.WorthInventoryHolder;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

public class WorthInventory {
    public static String title = "§b§l请选择你要用于扩岛的方块";

    public static void send(Player player){
        new BukkitRunnable(){

            @Override
            public void run() {
                player.closeInventory();
                player.openInventory(new WorthInventoryHolder().getInventory());
            }
        }.runTask(ExpandIsland.getInstance());
    }
}

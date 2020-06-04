package cn.mcdawncity.expandisland.command.subcommand;

import cn.mcdawncity.expandisland.features.WorthInventory;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.command.PCommand;

public class ExpandCommand implements PCommand {
    @Override
    public String getPermission() {
        return "ExpandIsland.use";
    }

    @Override
    public String getDescription() {
        return "开启扩岛菜单(测试)";
    }

    @Override
    public boolean execute(PPlugin plugin, CommandSender sender, String[] args) {
        WorthInventory.send((Player)sender);
        return false;
    }
}

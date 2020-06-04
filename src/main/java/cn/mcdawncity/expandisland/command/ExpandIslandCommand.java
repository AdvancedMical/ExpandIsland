package cn.mcdawncity.expandisland.command;

import cn.mcdawncity.expandisland.command.subcommand.ExpandCommand;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.command.CommandHandler;

public class ExpandIslandCommand extends CommandHandler {
    public ExpandIslandCommand(PPlugin plugin, String mainCmd) {
        super(plugin, mainCmd);
        registerSubCommand("expand", new ExpandCommand());
    }
}

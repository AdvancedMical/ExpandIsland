package cn.mcdawncity.expandisland.utils;

import cn.mcdawncity.expandisland.ExpandIsland;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.config.PConfig;

import java.io.File;

public class Worth extends PConfig {
    private static Worth worth;

    public Worth(PPlugin plugin) {
        super(plugin, "worth", "价格表文件");
    }

    @Override
    public void saveDefault() {
        this.plugin.saveResource("worth.yml", false);
    }

    @Override
    public void init() {
        setFile(new File(this.plugin.getDataFolder(), "worth.yml"));
        super.init();
    }

    public static Worth get() {
        if (worth == null)
            worth = new Worth(ExpandIsland.getInstance());
        return worth;
    }
}

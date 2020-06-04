package cn.mcdawncity.expandisland.data;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;

public interface InventoryExecutor extends InventoryHolder {
    void execute(InventoryClickEvent paramInventoryClickEvent);

    Inventory build();
}

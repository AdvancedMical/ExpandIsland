package cn.mcdawncity.expandisland.data;

import cn.mcdawncity.expandisland.ExpandIsland;
import cn.mcdawncity.expandisland.features.WorthInventory;
import cn.mcdawncity.expandisland.utils.Worth;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Item;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.serverct.parrot.parrotx.PPlugin;
import org.serverct.parrot.parrotx.utils.I18n;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WorthInventoryHolder implements InventoryExecutor{
    protected Inventory inventory;

    private PPlugin plugin;

    public WorthInventoryHolder(){
        this.plugin = ExpandIsland.getInstance();
        this.inventory = build();
    }

    @Override
    public void execute(InventoryClickEvent paramInventoryClickEvent) {

    }

    @Override
    public Inventory build() {
        try {
            Inventory inventory = Bukkit.createInventory(this, 54, WorthInventory.title);
            int amount = 0;
            Material STONE_SLAB = Material.STONE_SLAB;
            Material GRASS_BLOCK = Material.GRASS_BLOCK;
            Material STONE = Material.STONE;
            Material DIRT = Material.DIRT;
            Material COBBLESTONE = Material.COBBLESTONE;
            Material COBBLESTONE_SLAB = Material.COBBLESTONE_SLAB;
            Material OAK_SLAB = Material.OAK_SLAB;
            Material PETRIFIED_OAK_SLAB = Material.PETRIFIED_OAK_SLAB;
            Material SPRUCE_SLAB = Material.SPRUCE_SLAB;
            Material BIRCH_SLAB = Material.BIRCH_SLAB;
            Material JUNGLE_SLAB = Material.JUNGLE_SLAB;
            Material ACACIA_SLAB = Material.ACACIA_SLAB;
            Material DARK_OAK_SLAB = Material.DARK_OAK_SLAB;
            Material SMOOTH_STONE_SLAB = Material.SMOOTH_STONE_SLAB;
            ItemStack stone_slab = new ItemStack(STONE_SLAB, 1);
            ItemStack grass_block = new ItemStack(GRASS_BLOCK, 1);
            ItemStack stone = new ItemStack(STONE, 1);
            ItemStack dirt = new ItemStack(DIRT, 1);
            ItemStack cobblestone = new ItemStack(COBBLESTONE, 1);
            ItemStack cobblestone_slab = new ItemStack(COBBLESTONE_SLAB, 1);
            ItemStack oak_slab = new ItemStack(OAK_SLAB, 1);
            ItemStack petrified_oak_slab = new ItemStack(PETRIFIED_OAK_SLAB, 1);
            ItemStack spruce_slab = new ItemStack(SPRUCE_SLAB, 1);
            ItemStack birch_slab = new ItemStack(BIRCH_SLAB, 1);
            ItemStack jungle_slab = new ItemStack(JUNGLE_SLAB, 1);
            ItemStack acacia_slab = new ItemStack(ACACIA_SLAB, 1);
            ItemStack dark_oak_slab = new ItemStack(DARK_OAK_SLAB, 1);
            ItemStack smooth_stone_slab = new ItemStack(SMOOTH_STONE_SLAB, 1);
            ItemMeta stone_slab_im = stone_slab.getItemMeta();
            ItemMeta grass_block_im = grass_block.getItemMeta();
            ItemMeta stone_im = stone.getItemMeta();
            ItemMeta dirt_im = dirt.getItemMeta();
            ItemMeta cobblestone_im = cobblestone.getItemMeta();
            ItemMeta cobblestone_slab_im = cobblestone_slab.getItemMeta();
            ItemMeta oak_slab_im = oak_slab.getItemMeta();
            ItemMeta petrified_oak_slab_im = petrified_oak_slab.getItemMeta();
            ItemMeta spruce_slab_im = spruce_slab.getItemMeta();
            ItemMeta birch_slab_im = birch_slab.getItemMeta();
            ItemMeta jungle_slab_im = jungle_slab.getItemMeta();
            ItemMeta acacia_slab_im = acacia_slab.getItemMeta();
            ItemMeta dark_oak_slab_im = dark_oak_slab.getItemMeta();
            ItemMeta smooth_stone_slab_im = smooth_stone_slab.getItemMeta();
            String[] loreFormat = {
                    "",
                    "&7现状态 ▶ &a可用",
                    ""
            };
            List<String> lore = new ArrayList<>(Arrays.asList(loreFormat));
            lore.replaceAll(I18n::color);
            stone_slab_im.setLore(lore);
            grass_block_im.setLore(lore);
            stone_im.setLore(lore);
            dirt_im.setLore(lore);
            cobblestone_im.setLore(lore);
            cobblestone_slab_im.setLore(lore);
            oak_slab_im.setLore(lore);
            petrified_oak_slab_im.setLore(lore);
            spruce_slab_im.setLore(lore);
            birch_slab_im.setLore(lore);
            jungle_slab_im.setLore(lore);
            acacia_slab_im.setLore(lore);
            dark_oak_slab_im.setLore(lore);
            smooth_stone_slab_im.setLore(lore);
            stone_slab.setItemMeta(stone_slab_im);
            grass_block.setItemMeta(grass_block_im);
            stone.setItemMeta(stone_im);
            dirt.setItemMeta(dirt_im);
            cobblestone.setItemMeta(cobblestone_im);
            cobblestone_slab.setItemMeta(cobblestone_slab_im);
            oak_slab.setItemMeta(oak_slab_im);
            petrified_oak_slab.setItemMeta(petrified_oak_slab_im);
            spruce_slab.setItemMeta(spruce_slab_im);
            birch_slab.setItemMeta(birch_slab_im);
            jungle_slab.setItemMeta(jungle_slab_im);
            acacia_slab.setItemMeta(acacia_slab_im);
            dark_oak_slab.setItemMeta(dark_oak_slab_im);
            smooth_stone_slab.setItemMeta(smooth_stone_slab_im);
            inventory.addItem(stone_slab,
                    grass_block,
                    stone,
                    dirt,
                    cobblestone,
                    cobblestone_slab,
                    oak_slab,
                    petrified_oak_slab,
                    spruce_slab,
                    birch_slab,
                    jungle_slab,
                    acacia_slab,
                    dark_oak_slab,
                    smooth_stone_slab);
            amount++;
            return inventory;
        } catch (Throwable throwable){
            this.plugin.lang.logError("加载", "选择方块菜单", throwable.toString());
            throwable.printStackTrace();
            return Bukkit.createInventory(this, 0 , "菜单初始化失败!");
        }

    }

    @Override
    public Inventory getInventory() {
        return inventory;
    }
}

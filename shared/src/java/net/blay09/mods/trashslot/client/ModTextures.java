package net.blay09.mods.trashslot.client;

import net.blay09.mods.balm.api.client.rendering.BalmTextures;
import net.blay09.mods.trashslot.TrashSlot;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.inventory.InventoryMenu;

public class ModTextures {

    public static void initialize(BalmTextures textures) {
        textures.addSprite(InventoryMenu.BLOCK_ATLAS, new ResourceLocation(TrashSlot.MOD_ID, "gui/trashcan"));
    }

}

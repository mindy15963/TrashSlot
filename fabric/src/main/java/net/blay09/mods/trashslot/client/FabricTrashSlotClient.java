package net.blay09.mods.trashslot.client;

import net.blay09.mods.balm.api.client.BalmClient;
import net.blay09.mods.trashslot.TrashSlot;
import net.fabricmc.api.ClientModInitializer;

public class FabricTrashSlotClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BalmClient.initialize(TrashSlot.MOD_ID, TrashSlotClient::initialize);
    }
}

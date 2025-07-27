package com.yumimi.game.service.impl;

import com.yumimi.game.models.inventory.Equipment;
import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.service.InventoryService;
import com.yumimi.game.service.PlayerService;
import javafx.scene.control.Label;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class InventoryServiceImpl implements InventoryService {

    private final PlayerService playerService;

    @Override
    public void equipItem(Item item) {
        Player player = playerService.getPlayer();
        Equipment equipment = player.getEquipment();
        equipment.equipItem(item);
        playerService.updateEquip(equipment);
    }



}

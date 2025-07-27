package com.yumimi.game.service;

import com.yumimi.game.models.inventory.Equipment;
import com.yumimi.game.models.player.Player;

import java.util.List;

public interface PlayerService {

    Player getPlayer();
    List<String> showCharacteristics();
    void createPlayer(String playerName, String raceName);
    void updateEquip(Equipment equipment);
}

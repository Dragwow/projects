package com.yumimi.game.service;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.player.Player;
import javafx.collections.ObservableList;

import java.util.List;

public interface PlayerService {

    Player getPlayer();
    List<String> showLeftColumn();
    List<String> showRightColumn();
    void createPlayer(String playerName, String raceName);

    void sellItem(Item item, int price);
    void buyItem(Item item, int price);
    ObservableList<String> getPlayerBar();
    void refreshBar();

}

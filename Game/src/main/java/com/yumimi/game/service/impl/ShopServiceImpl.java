package com.yumimi.game.service.impl;

import com.yumimi.game.models.inventory.items.ItemFactory;
import com.yumimi.game.models.shop.ShopItem;
import com.yumimi.game.service.ShopService;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.springframework.stereotype.Service;

@Service
public class ShopServiceImpl implements ShopService {

    private final ObservableList<ShopItem> currentItem = FXCollections.observableArrayList();
    private final ItemFactory itemFactory;

    long lastUpdateTime = 0;
    long REFRESH_INTERVAL = 5 * 60 * 1000;

    public ShopServiceImpl(ItemFactory itemFactory) {
        this.itemFactory = itemFactory;
        refreshItems();
    }

    @Override
    public void refreshItems() {
        Platform.runLater(() -> {
            currentItem.clear();
            for (int i = 0; i < 10; i++) {
                currentItem.add(new ShopItem(itemFactory.dropItems()));
            }
        });
    }

    @Override
    public ObservableList<ShopItem> getCurrentItems() {
        long now = System.currentTimeMillis();

        if (now - lastUpdateTime >= REFRESH_INTERVAL) {
            refreshItems();
        }
        return currentItem;
    }

}

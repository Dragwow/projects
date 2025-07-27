package com.yumimi.game.service;

import com.yumimi.game.models.inventory.items.Item;

public interface ShopService {

    void getItem(Item item);
    void scheduleAutoRefresh();
    void refreshItems();
}

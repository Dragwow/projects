package com.yumimi.game.models.inventory;

import com.yumimi.game.models.inventory.items.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Inventory {

    private final List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
        if (item == null) {
            System.err.println("Warning: Tried to add null item to inventory");
            return;
        }
        items.add(item);
    }
}

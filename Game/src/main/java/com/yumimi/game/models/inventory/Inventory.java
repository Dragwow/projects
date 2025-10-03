package com.yumimi.game.models.inventory;

import com.yumimi.game.models.inventory.items.Item;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.Comparator;
import java.util.Iterator;
import java.util.stream.Collectors;

@Getter
public class Inventory {

    private final ObservableList<Item> items = FXCollections.observableArrayList();
    private final int maxStackSize = 99;

    public void addItem(Item newItem) {
        if (newItem.isStackable()) {
            for (Item existing : items) {
                if (existing.getName().equals(newItem.getName())) {
                    existing.setQuantity(existing.getQuantity() + newItem.getQuantity());
                    return;
                }
            }
        }
        items.add(newItem);
    }


    public void removeItem(Item item) {
        for (Iterator<Item> it = items.iterator(); it.hasNext();) {
            Item invItem = it.next();
            if (invItem.getName().equals(item.getName())) {
                if (invItem.isStackable()) {
                    invItem.setQuantity(invItem.getQuantity() - item.getQuantity());
                    if (invItem.getQuantity() <= 0) {
                        it.remove();
                    }
                } else {
                    it.remove();
                }
                return;
            }
        }
    }

    public void removeItemByName(String itemName, int amount){
        for (Iterator<Item> it = items.iterator(); it.hasNext();){
            Item item = it.next();
            if (item.getName().equals(itemName)){
                int newQuantity = item.getQuantity() - amount;
                if (newQuantity <= 0){
                    it.remove();
                }else{
                    item.setQuantity(newQuantity);
                }
                return;
            }
        }
    }

    public String getAllItems() {
        return items.stream()
            .sorted(Comparator.comparing(Item::getName))
            .map(item -> item.getName() + " | " + item.getRarity() + " | " + item.getTypeItem() +
                (item.isStackable() ? " x" + item.getQuantity() : ""))
            .collect(Collectors.joining("\n"));
    }

}




package com.yumimi.game.models.inventory.items.robes;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.util.stats.StatBlock;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Robe extends StatBlock implements Item {

    private String name;                 // Имя предмета
    private String description;          // Описание
    private Rarity rarity;               // Редкость
    private TypeItem typeItem;           // Тип предмета

    private int quantity = 1;            // Количество
    private Integer durability;          // Прочность

    private boolean equipped;

    private int price;

    public abstract void use();          // Использование в бою

    public abstract void ifUse();        // Бонусы если использовано

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Изменение прочности
    public void reduceDurability(int amount) {
        if (durability != null) {
            durability -= amount;
            if (durability < 0) durability = 0;
        }
    }

    public boolean isBroken() {
        return durability != null && durability <= 0;
    }

    @Override
    public boolean equipped() {
        return equipped;
    }

    @Override
    public void setEquipped(boolean value) {
        this.equipped = value;
    }
}

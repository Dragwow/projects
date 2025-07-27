package com.yumimi.game.models.inventory.items.robes;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;
import lombok.Data;

@Data
public abstract class Robes implements Item {

    private String name;                 // Имя предмета
    private String description;          // Описание
    private Rarity rarity;               // Редкость
    private TypeItem typeItem;           // Тип предмета

    private int quantity = 1;            // Количество
    private Integer durability;          // Прочность

    private boolean equipped;

    private double bonusArmour;          // Бонусная броня
    private double bonusStrength;        // Бонусная сила      1 = 22 хп | 0.3 хп/ход | крит урон 0.4 | урон на 0.7 , зависит от героя
    private double bonusIntelligence;    // Бонусный интелект  1 = 12 мана | 0.1 мана/ход | крит шанс 0.07 | урон на 0.7 , зависит от героя
    private double bonusDexterity;       // Бонусная ловкость  1 = 0.19 броня | 0.009 вампиризма | 0.004 уклонения | урон на 0.7 , зависит от героя
    private double bonusHp;              // Бонусное хп
    private double bonusMana;            // БОнусная мана

    private double bonusLifeSteal;       // Вампиризм (% от урона в HP)
    private double bonusCritChance;      // Шанс крит. удара (%)
    private double bonusCritDamage;      // Доп. урон при крите (%)
    private double bonusEvasion;         // Шанс уклонения (%)
    private double bonusHitChance;       // Шанс попадания (%)
    private double bonusRegenHp;         // Регенерация HP за ход
    private double bonusRegenMana;       // Регенерация маны за ход
    private double bonusBlockChance;     // Шанс блока (%)

    private int price;

    public abstract void use();          // Использование в бою
    public abstract void ifUse();        // Бонусы если использовано

    // Изменение прочности
    public void reduceDurability(int amount){
        if (durability != null){
            durability -= amount;
            if (durability < 0) durability = 0;
        }
    }

    public boolean isBroken(){
        return durability != null  && durability <= 0;
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

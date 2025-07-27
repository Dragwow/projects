package com.yumimi.game.models.player;

import com.yumimi.game.models.character.Race;
import com.yumimi.game.utils.enums.TypeDamage;
import com.yumimi.game.models.inventory.Equipment;
import com.yumimi.game.models.inventory.Inventory;
import com.yumimi.game.models.inventory.items.Item;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Player {

    private String username;
    private Race race;
    private double intelligence;
    private double strength;
    private double dexterity;
    private int hp;
    private int mana;
    private double armour;
    private TypeDamage typeDamage;
    private double damage;

    private double bonusLifeSteal;       // Вампиризм (% от урона в HP)
    private double bonusCritChance;      // Шанс крит. удара (%)
    private double bonusCritDamage;      // Доп. урон при крите (%)
    private double bonusEvasion;         // Шанс уклонения (%)
    private double bonusHitChance;       // Шанс попадания (%)
    private double bonusRegenHp;         // Регенерация HP за ход
    private double bonusRegenMana;       // Регенерация маны за ход
    private double bonusBlockChance;     // Шанс блока (%)


    private int gold;

    private Inventory inventory = new Inventory();
    private Equipment equipment = new Equipment();

    public Player(String username, Race race) {
        this.username = username;
        this.race = race;
        this.intelligence = race.getIntelligence();
        this.strength = race.getStrength();
        this.dexterity = race.getDexterity();
        this.hp = race.getHp();
        this.mana = race.getMana();
        this.armour = race.getArmour();
        this.damage = race.getDamage();
        this.typeDamage = race.getTypeDamage();
        this.gold = 100;
    }

    public void addGold(int amount){
        gold += amount;
    }

    public boolean spendGold(int amount){
        if (gold <= amount){
            gold -= amount;
            return true;
        }
        return false;
    }

    public void giveStarterWeapon(){
        Item item = race.generateStarterWeapon();
        inventory.addItem(item);
    }

}

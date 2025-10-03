package com.yumimi.game.util.stats;

import com.yumimi.game.models.inventory.items.BonusProvider;
import com.yumimi.game.models.player.Player;
import lombok.Data;

@Data
public abstract class StatBlock implements BonusProvider {

    private int damage;
    private int armour;          // Бонусная броня
    private int strength;        // Бонусная сила      1 = 22 хп | 0.3 хп/ход | крит урон 0.4 | урон на 0.7 , зависит от героя
    private int intelligence;    // Бонусный интелект  1 = 12 мана | 0.1 мана/ход | крит шанс 0.07 | урон на 0.7 , зависит от героя
    private int dexterity;       // Бонусная ловкость  1 = 0.19 броня | 0.009 вампиризма | 0.004 уклонения | урон на 0.7 , зависит от героя
    private int hp;              // Бонусное хп
    private int mana;            // БОнусная мана

    private double lifeSteal;       // Вампиризм (% от урона в HP)
    private double critChance;      // Шанс крит. удара (%)
    private double critDamage;      // Доп. урон при крите (%)
    private double evasion;         // Шанс уклонения (%)
    private double hitChance;       // Шанс попадания (%)
    private double regenHp;         // Регенерация HP за ход
    private double regenMana;       // Регенерация маны за ход
    private double blockChance;

    @Override
    public void applyBonuses(Player player) {
        if (getDamage() != 0 ) player.addDamage(getDamage());
        if (getIntelligence() != 0) player.addIntelligence(getIntelligence());
        if (getDexterity() != 0) player.addDexterity(getDexterity());
        if (getStrength() != 0) player.addStrength(getStrength());
        if (getMana() != 0) player.addMana(getMana());
        if (getArmour() != 0) player.addArmour(getArmour());
        if (getCritChance() != 0) player.addCritChance(getCritChance());
        if (getCritDamage() != 0) player.addCritDamage(getCritDamage());
        if (getEvasion() != 0) player.addEvasion(getEvasion());
        if (getLifeSteal() != 0) player.addLifeSteal(getLifeSteal());
        if (getRegenHp() != 0) player.addRegenHp(getRegenHp());
        if (getRegenMana() != 0) player.addRegenMana(getRegenMana());
        if (getBlockChance() != 0) player.addBlockChance(getBlockChance());
        if (getHitChance() != 0) player.addHitChance(getHitChance());
    }

    @Override
    public void removeBonuses(Player player) {
        player.addDamage(-getDamage());
        player.addIntelligence(-getIntelligence());
        player.addDexterity(-getDexterity());
        player.addStrength(-getStrength());
        player.addMana(-getMana());
        player.addHp(-getHp());
        player.addArmour(-getArmour());
        player.addCritChance(-getCritChance());
        player.addCritDamage(-getCritDamage());
        player.addEvasion(-getEvasion());
        player.addLifeSteal(-getLifeSteal());
        player.addRegenHp(-getRegenHp());
        player.addRegenMana(-getRegenMana());
        player.addBlockChance(-getBlockChance());
        player.addHitChance(-getHitChance());
    }
}

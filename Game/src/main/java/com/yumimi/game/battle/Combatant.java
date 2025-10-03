package com.yumimi.game.battle;

import com.yumimi.game.util.enums.TypeDamage;

import java.util.List;

public interface Combatant {

    String getName();
    int getHp();
    void setHp(int hp);
    int getMana();
    void setMana(int mana);
    CombatLog getCombatLog();
    TypeDamage getTypeDamage();
    double getHitChance();
    double getEvasion();
    double getCritChance();
    int getDamage();
    double getCritDamage();
    int getArmour();
    double getBlockChance();
    double getLifeSteal();
    double getRegenMana();
    double getRegenHp();
    boolean isDead();
    void setArmour(int armour);
    void setStunned(boolean b);
    void setStunDuration(int i);
    void takeDamage(int damage);

}

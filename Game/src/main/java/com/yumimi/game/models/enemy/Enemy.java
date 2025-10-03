package com.yumimi.game.models.enemy;

import com.yumimi.game.battle.Combatant;
import com.yumimi.game.battle.CombatLog;
import com.yumimi.game.models.skill.Skill;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeDamage;
import lombok.Getter;
import lombok.Setter;

import java.util.*;

@Getter
@Setter
public abstract class Enemy implements Combatant {

    protected SkillFactoryEnemy skillFactoryEnemy;

    private String name;

    private Rarity rarity;

    private int armour;
    private int damage;
    private int hp;
    private int mana;

    private double lifeSteal;       // Вампиризм (% от урона в HP)
    private double critChance;      // Шанс крит. удара (%)
    private double critDamage;      // Доп. урон при крите (%)
    private double evasion;         // Шанс уклонения (%)
    private double hitChance;       // Шанс попадания (%)
    private double regenHp;         // Регенерация HP за ход
    private double regenMana;       // Регенерация маны за ход
    private double blockChance;

    private TypeDamage typeDamage;

    private boolean stunned = false;
    private int stunDuration = 0;

    private List<Skill> equippedSkill = new ArrayList<>();
    private CombatLog combatLog;

    private Skill firstSkillSlot;
    private Skill secondSkillSlot;
    private Skill thirdSkillSlot;
    private Skill fourthSkillSlot;

    @Override
    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) {
            hp = 0;
        }
    }

    public boolean isDead() {
        return hp <= 0;
    }

    @Override
    public String toString() {
        return "|| " + name + " || [ " + rarity + " ]";
    }

    public void equipSkillForEnemy(Enemy enemy) {
        Set<Skill> uniqueSkill = new HashSet<>();

        while (uniqueSkill.size() < 4) {
            Skill newSkill = skillFactoryEnemy.generateFirstSkillForEnemy();
            uniqueSkill.add(newSkill);
        }

        List<Skill> equipped = new ArrayList<>(uniqueSkill);
        enemy.setEquippedSkill(equipped);

        firstSkillSlot = equipped.get(0);
        secondSkillSlot = equipped.get(1);
        thirdSkillSlot = equipped.get(2);
        fourthSkillSlot = equipped.get(3);

    }

    public void decreaseStunDuration() {
        if (stunned) {
            stunDuration--;
            if (stunDuration <= 0) {
                stunned = false;
                combatLog.add(name + " больше не оглушен");
            } else {
                combatLog.add(name + " пропускает ход из-за оглушения");
            }
        }
    }

}


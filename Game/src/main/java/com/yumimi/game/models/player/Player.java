package com.yumimi.game.models.player;

import com.yumimi.game.battle.Combatant;
import com.yumimi.game.battle.CombatLog;
import com.yumimi.game.models.character.Race;
import com.yumimi.game.models.inventory.items.BonusProvider;
import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.inventory.Inventory;
import com.yumimi.game.models.skill.Skill;
import com.yumimi.game.models.skill.SkillBook;
import com.yumimi.game.util.enums.PrimaryStat;
import com.yumimi.game.util.enums.TypeDamage;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
public class Player implements Combatant {

    private String name;
    private Race race;
    private PrimaryStat primaryStat;

    private int gold;

    private int point;

    // Базовые характеристики
    private int baseIntelligence;
    private int baseDexterity;
    private int baseStrength;

    private int baseHp;
    private int baseMana;
    private int baseArmour;
    private int baseDamage;

    private double baseCritChance = 0;
    private double baseCritDamage = 0;
    private double baseEvasion = 0;
    private double baseLifeSteal = 0;
    private double baseRegenHp = 0;
    private double baseRegenMana = 0;
    private double baseBlockChance = 0;
    private double baseHitChance = 0;

    private TypeDamage typeDamage;

    // Общие статы
    private int intelligence;
    private int dexterity;
    private int strength;

    private int hp;
    private int mana;
    private int armour;
    private int damage;

    private double critChance;
    private double critDamage;
    private double evasion;
    private double lifeSteal;
    private double regenHp;
    private double regenMana;
    private double blockChance;
    private double hitChance;

    // Бонусы от предметов
    private int bonusIntelligence;
    private int bonusDexterity;
    private int bonusStrength;

    private int bonusHp;
    private int bonusMana;
    private int bonusArmour;
    private int bonusDamage;

    private double bonusCritChance;
    private double bonusCritDamage;
    private double bonusEvasion;
    private double bonusLifeSteal;
    private double bonusRegenHp;
    private double bonusRegenMana;
    private double bonusBlockChance;
    private double bonusHitChance;


    private List<Item> equippedItems = new ArrayList<>();
    private final Inventory inventory = new Inventory();
    private List<Skill> equippedSkill = new ArrayList<>();
    private final SkillBook skillBook = new SkillBook();

    private CombatLog combatLog;

    private boolean stunned = false;
    private int stunDuration = 0;

    private Item weaponSlot;
    private Item helmetSlot;
    private Item armourSlot;
    private Item ringSlot;
    private Item handSlot;
    private Item bootSlot;
    private Item magicSlot;

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

    public boolean isDead() {return hp <= 0;}

    public Player(String username, Race race) {
        this.name = username;
        this.race = race;
        this.primaryStat = race.getPrimaryStat();
        this.typeDamage = race.getTypeDamage();

        this.baseIntelligence = race.getIntelligence();
        this.baseDexterity = race.getDexterity();
        this.baseStrength = race.getStrength();
        this.baseHp = race.getHp();
        this.baseMana = race.getMana();
        this.baseArmour = race.getArmour();
        this.baseDamage = race.getDamage();

        this.gold = 100;
        this.point = 2;
        characteristics();
    }

    public void addGold(int amount) {
        gold += amount;
    }

    public boolean spendGold(int amount) {
        if (gold >= amount) {
            gold -= amount;
            return true;
        }
        return false;
    }

    public void addPoint(int amount) {
        point += amount;
    }

    public boolean spendPoint(int amount) {
        if (point >= amount) {
            point -= amount;
            return true;
        }
        return false;
    }

    public void giveStarterWeapon() {
        Item item = race.generateStarterWeapon();
        inventory.addItem(item);
    }

    public void characteristics() {
        resetBonusStats();

        for (Item item : equippedItems) {
            if (item instanceof BonusProvider bonusProvider) {
                bonusProvider.applyBonuses(this);
            }
        }

        recalculateCharacteristics();
    }

    private void resetBonusStats() {
        bonusIntelligence = 0;
        bonusDexterity = 0;
        bonusStrength = 0;

        bonusHp = 0;
        bonusMana = 0;
        bonusArmour = 0;
        bonusDamage = 0;
        bonusCritChance = 0;
        bonusCritDamage = 0;
        bonusEvasion = 0;
        bonusLifeSteal = 0;
        bonusRegenHp = 0;
        bonusRegenMana = 0;
        bonusHitChance = 0;
        bonusBlockChance = 0;
    }

    private void recalculateCharacteristics() {
        intelligence = baseIntelligence + bonusIntelligence;
        dexterity = baseDexterity + bonusDexterity;
        strength = baseStrength + bonusStrength;

        hp = baseHp + (strength * 2) + bonusHp;
        mana = baseMana + (intelligence) + bonusMana;
        armour = (int) (baseArmour + (dexterity * 0.19) + bonusArmour);

        critDamage = baseCritDamage + (strength * 0.04) + bonusCritDamage;
        critChance = baseCritChance + (intelligence * 0.007) + bonusCritChance;
        lifeSteal = baseLifeSteal + (dexterity * 0.009) + bonusLifeSteal;
        evasion = baseEvasion + (dexterity * 0.004) + bonusEvasion;

        regenHp = baseRegenHp + (strength * 0.3) + bonusRegenHp;
        regenMana = baseRegenMana + (intelligence * 0.1) + bonusRegenMana;

        hitChance = baseHitChance + bonusHitChance;
        blockChance = baseBlockChance + bonusBlockChance;

        switch (primaryStat) {
            case Strength -> damage = (int) (baseDamage + (strength * 0.7) + bonusDamage);
            case Dexterity -> damage = (int) (baseDamage + (dexterity * 0.7) + bonusDamage);
            case Intelligence -> damage = (int) (baseDamage + (intelligence * 0.7) + bonusDamage);
        }
    }

    public void addIntelligence(int value) {
        bonusIntelligence += value;
    }

    public void addDexterity(int value) {
        bonusDexterity += value;
    }

    public void addStrength(int value) {
        bonusStrength += value;
    }

    public void addHp(int value) {
        bonusHp += value;
    }

    public void addMana(int value) {
        bonusMana += value;
    }

    public void addArmour(int value) {
        bonusArmour += value;
    }

    public void addDamage(int value) {
        bonusDamage += value;
    }

    public void addCritChance(double value) {
        bonusCritChance += value;
    }

    public void addCritDamage(double value) {
        bonusCritDamage += value;
    }

    public void addEvasion(double value) {
        bonusEvasion += value;
    }

    public void addLifeSteal(double value) {
        bonusLifeSteal += value;
    }

    public void addRegenHp(double value) {
        bonusRegenHp += value;
    }

    public void addRegenMana(double value) {
        bonusRegenMana += value;
    }

    public void addBlockChance(double value) {
        bonusBlockChance += value;
    }

    public void addHitChance(double value) {
        bonusHitChance += value;
    }

    public void equipItem(Item item, Player player) {
        Item oldItem = null;

        switch (item.getTypeItem()) {
            case Attack_Melee,
                 Attack_Range,
                 Attack_Magic -> {
                oldItem = weaponSlot;
                weaponSlot = item;
            }
            case Helmet -> {
                oldItem = helmetSlot;
                helmetSlot = item;
            }
            case Armour -> {
                oldItem = armourSlot;
                armourSlot = item;
            }
            case Ring -> {
                oldItem = ringSlot;
                ringSlot = item;
            }
            case Hand -> {
                oldItem = handSlot;
                handSlot = item;
            }
            case Boot -> {
                oldItem = bootSlot;
                bootSlot = item;
            }
            case Magic_item -> {
                oldItem = magicSlot;
                magicSlot = item;
            }
        }

        if (oldItem instanceof BonusProvider bonusProvider) {
            bonusProvider.removeBonuses(player);
            oldItem.setEquipped(false);
        }
        item.setEquipped(true);
        updateSlots(player);
        player.characteristics();
    }

    private void updateSlots(Player player) {
        List<Item> newEquippedItems = new ArrayList<>();

        if (weaponSlot != null) newEquippedItems.add(weaponSlot);
        if (helmetSlot != null) newEquippedItems.add(helmetSlot);
        if (armourSlot != null) newEquippedItems.add(armourSlot);
        if (ringSlot != null) newEquippedItems.add(ringSlot);
        if (handSlot != null) newEquippedItems.add(handSlot);
        if (bootSlot != null) newEquippedItems.add(bootSlot);
        if (magicSlot != null) newEquippedItems.add(magicSlot);

        player.setEquippedItems(newEquippedItems);
    }

    public void equipSkill(Skill skill, Player player) {
        if (firstSkillSlot == null
            && !Objects.equals(secondSkillSlot, skill)
            && !Objects.equals(thirdSkillSlot, skill)
            && !Objects.equals(fourthSkillSlot, skill)) {
            firstSkillSlot = skill;
            System.out.println("Equipped skill: " + skill.getName());
        } else if (secondSkillSlot == null
            && !Objects.equals(firstSkillSlot, skill)
            && !Objects.equals(thirdSkillSlot, skill)
            && !Objects.equals(fourthSkillSlot, skill)) {
            secondSkillSlot = skill;
            System.out.println("Equipped skill: " + skill.getName());
        } else if (thirdSkillSlot == null
            && !Objects.equals(firstSkillSlot, skill)
            && !Objects.equals(secondSkillSlot, skill)
            && !Objects.equals(fourthSkillSlot, skill)) {
            thirdSkillSlot = skill;
            System.out.println("Equipped skill: " + skill.getName());
        } else if (fourthSkillSlot == null
            && !Objects.equals(firstSkillSlot, skill)
            && !Objects.equals(secondSkillSlot, skill)
            && !Objects.equals(thirdSkillSlot, skill)) {
            fourthSkillSlot = skill;
            System.out.println("Equipped skill: " + skill.getName());
        } else{
            if (firstSkillSlot != null
                && secondSkillSlot != null
                && thirdSkillSlot != null
                && fourthSkillSlot != null){
                System.out.println("All slots have a skill");
            }else System.out.println("Already have equipped this skill");
        }


        updateSkillSlots(player);
    }

    public void unequipSkillSlot(Skill skill, Player player) {
        if (firstSkillSlot != null && firstSkillSlot.equals(skill)) {
            firstSkillSlot = null;
            System.out.println("Unequipped skill: " + skill.getName());
        } else if (secondSkillSlot != null && secondSkillSlot.equals(skill)) {
            secondSkillSlot = null;
            System.out.println("Unequipped skill: " + skill.getName());
        } else if (thirdSkillSlot != null && thirdSkillSlot.equals(skill)) {
            thirdSkillSlot = null;
            System.out.println("Unequipped skill: " + skill.getName());
        } else if (fourthSkillSlot != null && fourthSkillSlot.equals(skill)) {
            fourthSkillSlot = null;
            System.out.println("Unequipped skill: " + skill.getName());
        } else System.out.println("Skill" + skill.getName() + " not founded in slot");

        updateSkillSlots(player);
    }

    private void updateSkillSlots(Player player) {
        List<Skill> newEquippedSkills = new ArrayList<>();

        if (firstSkillSlot != null) newEquippedSkills.add(firstSkillSlot);
        if (secondSkillSlot != null) newEquippedSkills.add(secondSkillSlot);
        if (thirdSkillSlot != null) newEquippedSkills.add(thirdSkillSlot);
        if (fourthSkillSlot != null) newEquippedSkills.add(fourthSkillSlot);

        player.setEquippedSkill(newEquippedSkills);
    }

}

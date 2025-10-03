package com.yumimi.game.util.descriptions;

import com.yumimi.game.models.inventory.items.magic_items.MagicItems;
import com.yumimi.game.models.inventory.items.robes.Robe;
import com.yumimi.game.models.inventory.items.weapon.AttackWeapon;

public final class DescriptionUtil {

    //WEAPONS
    public static String CRYSTAL_ORB(AttackWeapon weapon) {
        return "Perfect focus for ice magic. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + weapon.getIntelligence() + "]" + "\n" +
            "[MANA: " + weapon.getMana() + "]" + "\n" +
            "[C/C: " + weapon.getCritChance() + "]" + "\n" +
            "[M/R: " + weapon.getRegenMana() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String FROSTBITE_WAND(AttackWeapon weapon) {
        return "A cold rod that slows enemies. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + weapon.getIntelligence() + "]" + "\n" +
            "[MANA: " + weapon.getMana() + "]" + "\n" +
            "[C/C: " + weapon.getCritChance() + "]" + "\n" +
            "[M/R: " + weapon.getRegenMana() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String INFERNO_STAFF(AttackWeapon weapon) {
        return "A flaming staff that burns everything in its path. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + weapon.getIntelligence() + "]" + "\n" +
            "[MANA: " + weapon.getMana() + "]" + "\n" +
            "[C/C: " + weapon.getCritChance() + "]" + "\n" +
            "[M/R: " + weapon.getRegenMana() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String MAGIC_WAND(AttackWeapon weapon) {
        return "A simple magic wand. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + weapon.getIntelligence() + "]" + "\n" +
            "[MANA: " + weapon.getMana() + "]" + "\n" +
            "[M/R: " + weapon.getRegenMana() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String SPACE_WAND(AttackWeapon weapon) {
        return "Artifact from another reality. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + weapon.getIntelligence() + "]" + "\n" +
            "[MANA: " + weapon.getMana() + "]" + "\n" +
            "[L/S: " + weapon.getLifeSteal() + "]" + "\n" +
            "[M/R: " + weapon.getRegenMana() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String BIG_AXE(AttackWeapon weapon) {
        return "A massive axe with huge damage. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[STRENGTH: " + weapon.getStrength() + "]" + "\n" +
            "[C/D: " + weapon.getCritDamage() + "]" + "\n" +
            "[ARMOUR: " + weapon.getArmour() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String RAPIER(AttackWeapon weapon) {
        return "Light and accurate weapon. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + weapon.getDexterity() + "]" + "\n" +
            "[C/C: " + weapon.getCritChance() + "]" + "\n" +
            "[EVASION: " + weapon.getEvasion() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String SMALL_AXE(AttackWeapon weapon) {
        return "Convenient and fast hatchet. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[STRENGTH: " + weapon.getStrength() + "]" + "\n" +
            "[C/D: " + weapon.getCritDamage() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String SPEAR(AttackWeapon weapon) {
        return "A spear with increased range. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[STRENGTH: " + weapon.getStrength() + "]" + "\n" +
            "[H/C: " + weapon.getHitChance() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String SWORD(AttackWeapon weapon) {
        return "A classic sword, balanced in all respects." + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[STRENGTH: " + weapon.getStrength() + "]" + "\n" +
            "[C/C: " + weapon.getCritChance() + "]" + "\n" +
            "[ARMOUR: " + weapon.getArmour() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String WAND(AttackWeapon weapon) {
        return "Small tree wand. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + weapon.getIntelligence() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String BOOMERANG(AttackWeapon weapon) {
        return "A nimble weapon with a chance to hit again. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + weapon.getDexterity() + "]" + "\n" +
            "[EVASION: " + weapon.getEvasion() + "]" + "\n" +
            "[H/C: " + weapon.getHitChance() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String DIRK(AttackWeapon weapon) {
        return "A dagger for quick and dexterous strikes. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + weapon.getDexterity() + "]" + "\n" +
            "[C/C: " + weapon.getCritChance() + "]" + "\n" +
            "[L/S: " + weapon.getLifeSteal() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String HUNTER_BOW(AttackWeapon weapon) {
        return "Hunting bow. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + weapon.getDexterity() + "]" + "\n" +
            "[H/S: " + weapon.getHitChance() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String SHADOW_CROSSBOW(AttackWeapon weapon) {
        return "Dark crossbow with precision sight. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + weapon.getDexterity() + "]" + "\n" +
            "[C/C: " + weapon.getCritChance() + "]" + "\n" +
            "[H/C: " + weapon.getHitChance() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    public static String STORM_SLING(AttackWeapon weapon) {
        return "A sling loaded with lightning. " + "\n" +
            "[DAMAGE: " + weapon.getDamage() + "]" + "\n" +
            "[DURABILITY: " + weapon.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + weapon.getDexterity() + "]" + "\n" +
            "[C/C: " + weapon.getCritChance() + "]" + "\n" +
            "[M/R: " + weapon.getRegenMana() + "]" + "\n" +
            "[PRICE: " + weapon.getPrice() + "]";
    }

    //ROBES
    public static String KNIGHT_PLATE(Robe robe) {
        return "Knight armor, gives a lot of protection and a little strength. " + "\n" +
            "[ARMOUR: " + robe.getArmour() + "]" + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[STRENGTH: " + robe.getStrength() + "]" + "\n" +
            "[B/C: " + robe.getBlockChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String ROBE_OF_CLARITY(Robe robe) {
        return "A light robe that increases intelligence and mana regeneration. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + robe.getIntelligence() + "]" + "\n" +
            "[MANA: " + robe.getMana() + "]" + "\n" +
            "[M/R: " + robe.getRegenMana() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String SHADOW_CLOAK(Robe robe) {
        return "Shadow Cloak. Increases agility and evasion. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + robe.getDexterity() + "]" + "\n" +
            "[EVASION: " + robe.getEvasion() + "]" + "\n" +
            "[H/C: " + robe.getHitChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String STEEL_PLATE(Robe robe) {
        return "Knight armor, gives a lot of protection and a little strength. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[ARMOUR: " + robe.getArmour() + "]" + "\n" +
            "[STRENGTH: " + robe.getStrength() + "]" + "\n" +
            "[B/C: " + robe.getBlockChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String LEATHER_BOOTS(Robe robe) {
        return "Simple leather boots. Increases agility and dodge chance." + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + robe.getDexterity() + "]" + "\n" +
            "[EVASION: " + robe.getEvasion() + "]" + "\n" +
            "[H/C: " + robe.getHitChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String RUNIC_BOOTS(Robe robe) {
        return "Boots that hold a magical rune. Increases mana regen and armor. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[ARMOUR: " + robe.getArmour() + "]" + "\n" +
            "[MANA: " + robe.getMana() + "]" + "\n" +
            "[M/R: " + robe.getRegenMana() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String SILENT_BOOTS(Robe robe) {
        return "Silent Steps. Increases agility, dodge, and critical chance. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + robe.getDexterity() + "]" + "\n" +
            "[EVASION: " + robe.getEvasion() + "]" + "\n" +
            "[C/C: " + robe.getCritChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String STEEL_BOOTS(Robe robe) {
        return "Reinforced steel boots. Provide armor and block chance. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[ARMOUR: " + robe.getArmour() + "]" + "\n" +
            "[B/C: " + robe.getBlockChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String CRUSHER_GAUNTLETS(Robe robe) {
        return "Crushing Gloves. Increases strength and armor. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[STRENGTH: " + robe.getStrength() + "]" + "\n" +
            "[ARMOUR: " + robe.getArmour() + "]" + "\n" +
            "[C/D: " + robe.getCritDamage() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String GLOVES_OF_SCRAP(Robe robe) {
        return "Gloves from debris. A little bit of everything." + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[STRENGTH: " + robe.getStrength() + "]" + "\n" +
            "[INTELLIGENCE: " + robe.getIntelligence() + "]" + "\n" +
            "[DEXTERITY: " + robe.getDexterity() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String GLOVES_OF_SPEED(Robe robe) {
        return "Lightweight gloves for speed. Increases agility and hit chance." + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + robe.getDexterity() + "]" + "\n" +
            "[EVASION: " + robe.getEvasion() + "]" + "\n" +
            "[H/C: " + robe.getHitChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String MAGE_BRACELETS(Robe robe) {
        return "Bracelets that enhance the mental energy of the magician." + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + robe.getIntelligence() + "]" + "\n" +
            "[MANA: " + robe.getMana() + "]" + "\n" +
            "[M/R: " + robe.getRegenMana() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String HELM_FROM_HELL(Robe robe) {
        return "Helmet from the Underworld. Strength, block and crit damage." + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[STRENGTH: " + robe.getStrength() + "]" + "\n" +
            "[B/C: " + robe.getBlockChance() + "]" + "\n" +
            "[C/D: " + robe.getCritDamage() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String IRON_HELM(Robe robe) {
        return "A simple iron helmet. Increases armor and HP." + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[ARMOUR: " + robe.getArmour() + "]" + "\n" +
            "[HP: " + robe.getHp() + "]" + "\n" +
            "[B/C: " + robe.getBlockChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String MYSTIC_HOOD(Robe robe) {
        return "Cap of the Enchanter. Increases intellect and mana. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + robe.getIntelligence() + "]" + "\n" +
            "[MANA: " + robe.getMana() + "]" + "\n" +
            "[M/R: " + robe.getRegenMana() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String SPIKED_HELM(Robe robes) {
        return "Helmet with spikes. Increases strength, crit damage and armor. " + "\n" +
            "[DURABILITY: " + robes.getDurability() + "]" + "\n" +
            "[STRENGTH: " + robes.getStrength() + "]" + "\n" +
            "[C/C: " + robes.getCritChance() + "]" + "\n" +
            "[C/D: " + robes.getCritDamage() + "]" + "\n" +
            "[PRICE: " + robes.getPrice() + "]";
    }

    public static String GOLD_RING(Robe robe) {
        return "Golden ring. A little bit of everything - armor, mana, evasion. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[ARMOUR: " + robe.getArmour() + "]" + "\n" +
            "[MANA: " + robe.getMana() + "]" + "\n" +
            "[EVASION: " + robe.getEvasion() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String GUARDIAN_RING(Robe robe) {
        return "Guardian Ring. Increases armor, block and HP." + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[ARMOUR: " + robe.getArmour() + "]" + "\n" +
            "[HP: " + robe.getHp() + "]" + "\n" +
            "[B/C: " + robe.getBlockChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String LOST_KING_RING(Robe robe) {
        return "Ring of the Lost King. Dark Power and Vampirism. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[STRENGTH: " + robe.getStrength() + "]" + "\n" +
            "[L/S: " + robe.getLifeSteal() + "]" + "\n" +
            "[C/C: " + robe.getCritChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String MANA_LOOP(Robe robe) {
        return "Ring with crystal. Mana restoration. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[MANA: " + robe.getMana() + "]" + "\n" +
            "[EVASION: " + robe.getEvasion() + "]" + "\n" +
            "[M/R: " + robe.getRegenMana() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String ORK_RING(Robe robe) {
        return "Rough Orc Ring. Strength, HP and Vampirism. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[STRENGTH: " + robe.getStrength() + "]" + "\n" +
            "[HP: " + robe.getHp() + "]" + "\n" +
            "[L/S: " + robe.getLifeSteal() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String RING_OF_POWER(Robe robe) {
        return "Ring of Power. Strong boost to attack stats. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[STRENGTH: " + robe.getStrength() + "]" + "\n" +
            "[C/C: " + robe.getCritChance() + "]" + "\n" +
            "[C/D: " + robe.getCritDamage() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    public static String SILVER_RING(Robe robe) {
        return "A simple silver ring. Grants agility and evasion. " + "\n" +
            "[DURABILITY: " + robe.getDurability() + "]" + "\n" +
            "[DEXTERITY: " + robe.getDexterity() + "]" + "\n" +
            "[EVASION: " + robe.getEvasion() + "]" + "\n" +
            "[H/C: " + robe.getHitChance() + "]" + "\n" +
            "[PRICE: " + robe.getPrice() + "]";
    }

    //MAGIC_ITEMS
    public static String ABYSS_AYE(MagicItems items) {
        return "The eye that sees through the darkness." + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[MANA: " + items.getMana() + "]" + "\n" +
            "[C/C: " + items.getCritChance() + "]" + "\n" +
            "[L/S: " + items.getLifeSteal() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String NECRO_CHARM(MagicItems items) {
        return "A dark amulet that feeds on death. " + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[MANA: " + items.getMana() + "]" + "\n" +
            "[L/S: " + items.getLifeSteal() + "]" + "\n" +
            "[HP/R: " + items.getRegenHp() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String EMBER_CORE(MagicItems items) {
        return "Coal Core. Increases damage and strength. " + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[STRENGTH: " + items.getStrength() + "]" + "\n" +
            "[HP: " + items.getHp() + "]" + "\n" +
            "[C/C: " + items.getCritChance() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String FLAME_TALISMAN(MagicItems items) {
        return "Talisman of Fire. Increases strength and critical damage. " + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[STRENGTH: " + items.getStrength() + "]" + "\n" +
            "[C/D: " + items.getCritDamage() + "]" + "\n" +
            "[C/C: " + items.getCritChance() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String BLESSED_ICON(MagicItems items) {
        return "An icon that radiates pure blessing." + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[HP/R: " + items.getRegenHp() + "]" + "\n" +
            "[C/C: " + items.getCritChance() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String DIVINE_TEAR(MagicItems items) {
        return "A drop of light that can heal and protect. " + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[MANA: " + items.getMana() + "]" + "\n" +
            "[HP/R: " + items.getRegenHp() + "]" + "\n" +
            "[M/R: " + items.getRegenMana() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String FROZEN_AMULET(MagicItems items) {
        return "Frozen Amulet. Grants intelligence and armor. " + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[MANA: " + items.getMana() + "]" + "\n" +
            "[ARMOUR: " + items.getArmour() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String ICE_CRYSTAL(MagicItems items) {
        return "Ice Crystal. Increases intelligence and mana regeneration." + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[M/R: " + items.getRegenMana() + "]" + "\n" +
            "[EVASION: " + items.getEvasion() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String LIGHTNING_SIGIL(MagicItems items) {
        return "An ancient sign filled with the destructive energy of lightning. " + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[MANA: " + items.getMana() + "]" + "\n" +
            "[C/C: " + items.getCritChance() + "]" + "\n" +
            "[L/S: " + items.getLifeSteal() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String STORM_CORE(MagicItems items) {
        return "A lightning heart that infuses spells with unstable energy." + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[MANA: " + items.getMana() + "]" + "\n" +
            "[C/C: " + items.getCritChance() + "]" + "\n" +
            "[M/R: " + items.getRegenMana() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String TOXIC_TOTEM(MagicItems items) {
        return "A totem that exudes deadly miasma." + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[DEXTERITY: " + items.getDexterity() + "]" + "\n" +
            "[L/S: " + items.getLifeSteal() + "]" + "\n" +
            "[HP/R: " + items.getRegenHp() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String VENOM_SHARD(MagicItems items) {
        return "A poisonous shard oozing toxin. " + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[DEXTERITY: " + items.getDexterity() + "]" + "\n" +
            "[L/S: " + items.getLifeSteal() + "]" + "\n" +
            "[HP/R: " + items.getRegenHp() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String BREEZE_FEATHER(MagicItems items) {
        return "A light feather filled with a swift wind. " + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[DEXTERITY: " + items.getDexterity() + "]" + "\n" +
            "[C/C: " + items.getCritChance() + "]" + "\n" +
            "[M/R: " + items.getRegenMana() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }

    public static String WIND_CHARM(MagicItems items) {
        return "Amulet with an air flow spell. " + "\n" +
            "[DURABILITY: " + items.getDurability() + "]" + "\n" +
            "[INTELLIGENCE: " + items.getIntelligence() + "]" + "\n" +
            "[DEXTERITY: " + items.getDexterity() + "]" + "\n" +
            "[EVASION: " + items.getEvasion() + "]" + "\n" +
            "[M/R: " + items.getRegenMana() + "]" + "\n" +
            "[PRICE: " + items.getPrice() + "]";
    }
}

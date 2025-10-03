package com.yumimi.game.models.craft;

import com.yumimi.game.util.enums.Rarity;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Getter
public class RecipeRegistry {

    private final Map<String, Recipe> recipes = Map.ofEntries(
        Map.entry("CrusherGauntlets", new Recipe("CrusherGauntlets", List.of("Rusty Gear", "Refined Metal"), Rarity.EPIC)),
        Map.entry("ShadowCloak", new Recipe("ShadowCloak", List.of("Reinforced Leather", "Shadow Essence", "Shadow Fragment"), Rarity.RARE)),
        Map.entry("GlovesOfSpeed", new Recipe("GlovesOfSpeed", List.of("Cloth Strap", "Phoenix Feather"), Rarity.EPIC)),
        Map.entry("GlovesOfScrap", new Recipe("GlovesOfScrap", List.of("Rusty Gear", "Titan Steel"), Rarity.RARE)),
        Map.entry("KnightPlate", new Recipe("KnightPlate", List.of("Hardened Hide", "Dragon Scale"), Rarity.COMMON)),
        Map.entry("ShadowCrossbow", new Recipe("ShadowCrossbow", List.of("Shadow Essence", "Phoenix Feather"), Rarity.EPIC)),
        Map.entry("Spear", new Recipe("Spear", List.of("Wood Handle", "Divine Core"), Rarity.LEGENDARY)),
        Map.entry("BigAxe", new Recipe("BigAxe", List.of("Molten Core", "Vicious Claw"), Rarity.RARE)),
        Map.entry("Rapier", new Recipe("Rapier", List.of("Goblin Fang", "Wood Handle"), Rarity.LEGENDARY)),
        Map.entry("SteelBoots", new Recipe("SteelBoots", List.of("Bronze Plating", "Reinforced Steel"), Rarity.EPIC)),
        Map.entry("LeatherBoots", new Recipe("LeatherBoots", List.of("Cloth Strap", "Vicious Claw"), Rarity.RARE)),
        Map.entry("SilentTreads", new Recipe("SilentTreads", List.of("Reinforced Leather", "Celestial Stone"), Rarity.EPIC)),
        Map.entry("RunicBoots", new Recipe("RunicBoots", List.of("Twisted Fiber", "Hardened Hide", "Eternal Flame"), Rarity.DIVINE)),
        Map.entry("SpikedHelm", new Recipe("SpikedHelm", List.of("Stone Shard", "Vicious Claw"), Rarity.RARE)),
        Map.entry("CrystalOrb", new Recipe("CrystalOrb", List.of("Magic Dust", "Arcane Crystal"), Rarity.EPIC)),
        Map.entry("HelmFromHell", new Recipe("HelmFromHell", List.of("Iron Fragment", "Refined Metal", "Reinforced Steel"), Rarity.EPIC)),
        Map.entry("SpaceWand", new Recipe("SpaceWand", List.of("Enchanted Orb", "Arcane Crystal", "Void Essence"), Rarity.COMMON)),
        Map.entry("IronHelm", new Recipe("IronHelm", List.of("Bronze Plating", "Iron Fragment", "Titan Steel"), Rarity.LEGENDARY)),
        Map.entry("FrostbiteWand", new Recipe("FrostbiteWand", List.of("Cold Shard", "Arcane Crystal"), Rarity.COMMON)),
        Map.entry("FrozenAmulet", new Recipe("FrozenAmulet", List.of("Cold Shard", "Enchanted Orb"), Rarity.RARE)),
        Map.entry("DivineTear", new Recipe("DivineTear", List.of("Radiant Gem", "Blessed Petal", "Phoenix Feather"),Rarity.RARE)),
        Map.entry("FlameTalisman", new Recipe("FlameTalisman", List.of("Molten Core", "Dragon Scale", "Eternal Flame"), Rarity.RARE)),
        Map.entry("ManaLoop", new Recipe("ManaLoop", List.of("Mana Herb", "Mana Herb"), Rarity.LEGENDARY)),
        Map.entry("NecroCharm", new Recipe("NecroCharm", List.of("Cracked Lens", "Cracked Lens"), Rarity.EPIC)),
        Map.entry("AbyssEye", new Recipe("AbyssEye", List.of("Cracked Lens", "Shadow Fragment", "DemonHorn"), Rarity.RARE)),
        Map.entry("BlessedIcon", new Recipe("BlessedIcon", List.of("Sacred Herb", "Blessed Petal", "Tear Of Heaven"), Rarity.LEGENDARY)),
        Map.entry("StormSling", new Recipe("StormSling", List.of("Static Core", "Lightning Core"), Rarity.COMMON)),
        Map.entry("LightningSigil", new Recipe("LightningSigil", List.of("Static Core", "Lightning Core"), Rarity.EPIC)),
        Map.entry("VenomShard", new Recipe("VenomShard", List.of("Toxic Residue", "Divine Core"), Rarity.DIVINE)),
        Map.entry("ToxicTotem", new Recipe("ToxicTotem", List.of("Toxic Residue", "Sacred Blood"), Rarity.EPIC)),
        Map.entry("BreezeFeather", new Recipe("BreezeFeather", List.of("Wind Essence", "Tear Of Heaven"), Rarity.COMMON)),
        Map.entry("WindCharm", new Recipe("WindCharm", List.of("Wind Essence", "Angelic Wing"), Rarity.LEGENDARY)),
        Map.entry("GuardianRing", new Recipe("GuardianRing", List.of("Radiant Gem", "Celestial Stone"), Rarity.EPIC)),
        Map.entry("GoldRing", new Recipe("GoldRing", List.of("Old Ribbon", "Old Ribbon"), Rarity.DIVINE)),
        Map.entry("SilverRing", new Recipe("SilverRing", List.of("Old Ribbon", "Silver Dust"), Rarity.LEGENDARY)),
        Map.entry("OrkRing", new Recipe("OrkRing", List.of("Goblin Fang", "Goblin Fang"),Rarity.LEGENDARY))
    );

}

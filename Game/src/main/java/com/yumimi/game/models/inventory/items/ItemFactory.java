package com.yumimi.game.models.inventory.items;

import com.yumimi.game.models.inventory.items.crafts_items.CraftItemFactory;
import com.yumimi.game.models.inventory.items.magic_items.MagicItemFactory;
import com.yumimi.game.models.inventory.items.weapon.WeaponFactory;
import com.yumimi.game.models.inventory.items.crafts_items.A.common.*;
import com.yumimi.game.models.inventory.items.crafts_items.B.rare.*;
import com.yumimi.game.models.inventory.items.crafts_items.C.epic.*;
import com.yumimi.game.models.inventory.items.crafts_items.D.legendary.*;
import com.yumimi.game.models.inventory.items.crafts_items.E.divine.*;
import com.yumimi.game.models.inventory.items.magic_items.dark.*;
import com.yumimi.game.models.inventory.items.magic_items.fire.*;
import com.yumimi.game.models.inventory.items.magic_items.holy.*;
import com.yumimi.game.models.inventory.items.magic_items.ice.*;
import com.yumimi.game.models.inventory.items.magic_items.lightning.*;
import com.yumimi.game.models.inventory.items.magic_items.poison.*;
import com.yumimi.game.models.inventory.items.magic_items.wind.*;
import com.yumimi.game.models.inventory.items.potion.A.common.*;
import com.yumimi.game.models.inventory.items.potion.B.rare.*;
import com.yumimi.game.models.inventory.items.potion.C.epic.*;
import com.yumimi.game.models.inventory.items.potion.D.legendary.*;
import com.yumimi.game.models.inventory.items.robes.RobeFactory;
import com.yumimi.game.models.inventory.items.robes.armour.*;
import com.yumimi.game.models.inventory.items.robes.boot.*;
import com.yumimi.game.models.inventory.items.robes.hand.*;
import com.yumimi.game.models.inventory.items.robes.helmet.*;
import com.yumimi.game.models.inventory.items.robes.ring.*;
import com.yumimi.game.models.inventory.items.weapon.magic.*;
import com.yumimi.game.models.inventory.items.weapon.melee.*;
import com.yumimi.game.models.inventory.items.weapon.range.*;
import com.yumimi.game.util.enums.Rarity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@RequiredArgsConstructor
public class ItemFactory {

    private int choice;
    private final MagicItemFactory magicFactory;
    private final RobeFactory robeFactory;
    private final WeaponFactory weaponFactory;
    private final CraftItemFactory craftItemFactory;

    public Item dropItems() {
        random();
        return switch (choice) {
            case 0 -> magicFactory.generateMagicItem();
            case 1 -> robeFactory.generateRobe();
            case 2 -> weaponFactory.generateWeapon();
            case 3 -> craftItemFactory.generateCraftItem();
            default -> throw new IllegalStateException("Unexpected value: " + choice);
        };
    }

    private void random() {
        choice = new Random().nextInt(4);
    }

    public Item createByName(String name, Rarity rarity) {
        return switch (name) {
            case "BigAxe" -> new BigAxe(rarity);
            case "Rapier" -> new Rapier(rarity);
            case "SmallAxe" -> new SmallAxe(rarity);
            case "Spear" -> new Spear(rarity);
            case "Sword" -> new Sword(rarity);
            case "Wand" -> new Wand(rarity);
            case "StormSling" -> new StormSling(rarity);
            case "ShadowCrossbow" -> new ShadowCrossbow(rarity);
            case "HunterBow" -> new HunterBow(rarity);
            case "Dirk" -> new Dirk(rarity);
            case "Boomerang" -> new Boomerang(rarity);
            case "SpaceWand" -> new SpaceWand(rarity);
            case "MagicWand" -> new MagicWand(rarity);
            case "InfernoStaff" -> new InfernoStaff(rarity);
            case "FrostbiteWand" -> new FrostbiteWand(rarity);
            case "CrystalOrb" -> new CrystalOrb(rarity);
            case "KnightPlate" -> new KnightPlate(rarity);
            case "RobeOfClarity" -> new RobeOfClarity(rarity);
            case "ShadowCloak" -> new ShadowCloak(rarity);
            case "SteelPlate" -> new SteelPlate(rarity);
            case "LeatherBoots" -> new LeatherBoots(rarity);
            case "SilentTreads" -> new SilentTreads(rarity);
            case "RunicBoots" -> new RunicBoots(rarity);
            case "SteelBoots" -> new SteelBoots(rarity);
            case "CrusherGauntlets" -> new CrusherGauntlets(rarity);
            case "GlovesOfScrap" -> new GlovesOfScrap(rarity);
            case "GlovesOfSpeed" -> new GlovesOfSpeed(rarity);
            case "MageBracelets" -> new MageBracelets(rarity);
            case "HelmFromHell" -> new HelmFromHell(rarity);
            case "IronHelm" -> new IronHelm(rarity);
            case "MysticHood" -> new MysticHood(rarity);
            case "SpikedHelm" -> new SpikedHelm(rarity);
            case "GoldRing" -> new GoldRing(rarity);
            case "GuardianRing" -> new GuardianRing(rarity);
            case "LostKingRing" -> new LostKingRing(rarity);
            case "ManaLoop" -> new ManaLoop(rarity);
            case "OrkRing" -> new OrkRing(rarity);
            case "RingOfPower" -> new RingOfPower(rarity);
            case "SilverRing" -> new SilverRing(rarity);
            case "AbyssEye" -> new AbyssEye(rarity);
            case "NecroCharm" -> new NecroCharm(rarity);
            case "EmberCore" -> new EmberCore(rarity);
            case "FlameTalisman" -> new FlameTalisman(rarity);
            case "BlessedIcon" -> new BlessedIcon(rarity);
            case "DivineTear" -> new DivineTear(rarity);
            case "FrozenAmulet" -> new FrozenAmulet(rarity);
            case "IceCrystal" -> new IceCrystal(rarity);
            case "LightningSigil" -> new LightningSigil(rarity);
            case "StormCore" -> new StormCore(rarity);
            case "ToxicTotem" -> new ToxicTotem(rarity);
            case "VenomShard" -> new VenomShard(rarity);
            case "BreezeFeather" -> new BreezeFeather(rarity);
            case "WindCharm" -> new WindCharm(rarity);
            default -> throw new IllegalStateException("Unexpected value: " + name);
        };
    }
    public Item createOtherItems(String name){
        return switch (name){
            case "MinorHealingPotion" -> new MinorHealingPotion();
            case "MinorManaPotion" -> new MinorManaPotion();
            case "HealingPotion" -> new HealingPotion();
            case "ManaPotion" -> new ManaPotion();
            case "PotionOfAgility" -> new PotionOfAgility();
            case "BattleBrew" -> new BattleBrew();
            case "GreaterHealingPotion" -> new GreaterHealingPotion();
            case "GreaterManaPotion" -> new GreaterManaPotion();
            case "ElixirOfVitality" -> new ElixirOfVitality();
            case "ElixirOfWisdom" -> new ElixirOfWisdom();
            case "BronzePlating" -> new BronzePlating();
            case "ClothStrap" -> new ClothStrap();
            case "CrackedLens" -> new CrackedLens();
            case "GoblinFang" -> new GoblinFang();
            case "IronFragment" -> new IronFragment();
            case "MagicDust" -> new MagicDust();
            case "ManaHerb" -> new ManaHerb();
            case "OldRibbon" -> new OldRibbon();
            case "RustyGear" -> new RustyGear();
            case "StoneShard" -> new StoneShard();
            case "TwistedFiber" -> new TwistedFiber();
            case "WoodHandle" -> new WoodHandle();

            case "ColdShard" -> new ColdShard();
            case "EnchantedOrb" -> new EnchantedOrb();
            case "MoltenCore" -> new MoltenCore();
            case "RadiantGem" -> new RadiantGem();
            case "RefinedMetal" -> new RefinedMetal();
            case "ReinforcedLeather" -> new ReinforcedLeather();
            case "SacredHerb" -> new SacredHerb();
            case "ShadowEssence" -> new ShadowEssence();
            case "SilverDust" -> new SilverDust();
            case "StaticCore" -> new StaticCore();
            case "ViciousClaw" -> new ViciousClaw();

            case "ArcaneCrystal" -> new ArcaneCrystal();
            case "BlessedPetal" -> new BlessedPetal();
            case "HardenedHide" -> new HardenedHide();
            case "LightningCore" -> new LightningCore();
            case "ReinforcedSteel" -> new ReinforcedSteel();
            case "ShadowFragment" -> new ShadowFragment();
            case "ToxicResidue" -> new ToxicResidue();
            case "WindEssence" -> new WindEssence();

            case "DemonHorn" -> new DemonHorn();
            case "DragonScale" -> new DragonScale();
            case "EternalFlame" -> new EternalFlame();
            case "PhoenixFeather" -> new PhoenixFeather();
            case "TitanSteel" -> new TitanSteel();
            case "VoidEssence" -> new VoidEssence();

            case "AngelicWing" -> new AngelicWing();
            case "CelestialStone" -> new CelestialStone();
            case "DivineCore" -> new DivineCore();
            case "SacredBlood" -> new SacredBlood();
            case "TearOfHeaven" -> new TearOfHeaven();

            default -> throw new IllegalStateException("Unexpected value: " + name);
        };
    }
}

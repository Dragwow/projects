package com.yumimi.game.models.inventory.items.crafts_items;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.models.inventory.items.crafts_items.A.common.*;
import com.yumimi.game.models.inventory.items.crafts_items.B.rare.*;
import com.yumimi.game.models.inventory.items.crafts_items.C.epic.*;
import com.yumimi.game.models.inventory.items.crafts_items.D.legendary.*;
import com.yumimi.game.models.inventory.items.crafts_items.E.divine.*;
import com.yumimi.game.util.enums.Rarity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@Component
public class CraftItemFactory {

    private final Rarity rarity = RarityUtils.generateRandomRarity();
    private int choice;

    public Item generateCraftItem(){
       return switch (rarity){
           case COMMON -> generateCommonCraftItem();
           case RARE -> generateRareCraftItems();
           case EPIC -> generateEpicCraftItems();
           case LEGENDARY -> generateLegendaryCraftItems();
           case DIVINE -> generateDivineCraftItems();
       };
    }

    public Item generateCommonCraftItem() {
        List<Supplier<CraftItems>> craftItem = List.of(
            BronzePlating::new,
            ClothStrap::new,
            CrackedLens::new,
            GoblinFang::new,
            IronFragment::new,
            MagicDust::new,
            ManaHerb::new,
            OldRibbon::new,
            RustyGear::new,
            StoneShard::new,
            TwistedFiber::new,
            WoodHandle::new
        );
        random(craftItem.size());
        return craftItem.get(choice).get();

    }

    public Item generateRareCraftItems() {
        List<Supplier<CraftItems>> craftItem = List.of(
            ColdShard::new,
            EnchantedOrb::new,
            MoltenCore::new,
            RadiantGem::new,
            RefinedMetal::new,
            ReinforcedLeather::new,
            SacredHerb::new,
            ShadowEssence::new,
            SilverDust::new,
            StaticCore::new,
            ViciousClaw::new
        );
        random(craftItem.size());
        return craftItem.get(choice).get();
    }

    public Item generateEpicCraftItems() {
        List<Supplier<CraftItems>> craftItem = List.of(
            ArcaneCrystal::new,
            BlessedPetal::new,
            HardenedHide::new,
            LightningCore::new,
            ReinforcedSteel::new,
            ShadowFragment::new,
            ToxicResidue::new,
            WindEssence::new
        );
        random(craftItem.size());
        return craftItem.get(choice).get();
    }

    public Item generateLegendaryCraftItems() {
        List<Supplier<CraftItems>> craftItem = List.of(
            DemonHorn::new,
            DragonScale::new,
            EternalFlame::new,
            PhoenixFeather::new,
            TitanSteel::new,
            VoidEssence::new
        );
        random(craftItem.size());
        return craftItem.get(choice).get();
    }

    public Item generateDivineCraftItems() {
        List<Supplier<CraftItems>> craftItem = List.of(
            AngelicWing::new,
            CelestialStone::new,
            DivineCore::new,
            SacredBlood::new,
            TearOfHeaven::new
        );
        random(craftItem.size());
        return craftItem.get(choice).get();
    }

    private void random(int amount) {
        choice = new Random().nextInt(amount);
    }
}

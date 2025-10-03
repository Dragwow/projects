package com.yumimi.game.models.inventory.items.magic_items;

import com.yumimi.game.util.rarity.RarityUtils;
import com.yumimi.game.models.inventory.items.magic_items.dark.*;
import com.yumimi.game.models.inventory.items.magic_items.fire.*;
import com.yumimi.game.models.inventory.items.magic_items.holy.*;
import com.yumimi.game.models.inventory.items.magic_items.ice.*;
import com.yumimi.game.models.inventory.items.magic_items.lightning.*;
import com.yumimi.game.models.inventory.items.magic_items.poison.*;
import com.yumimi.game.models.inventory.items.magic_items.wind.*;
import com.yumimi.game.util.enums.Rarity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@Component
public class MagicItemFactory {

    private final Rarity rarity = RarityUtils.generateRandomRarity();
    private int choice;

    public MagicItems generateMagicItem() {
        List<Supplier<MagicItems>> magicItemSupplier = List.of(
            AbyssEye::new,
            NecroCharm::new,
            EmberCore::new,
            FlameTalisman::new,
            BlessedIcon::new,
            DivineTear::new,
            FrozenAmulet::new,
            IceCrystal::new,
            LightningSigil::new,
            StormCore::new,
            ToxicTotem::new,
            VenomShard::new,
            BreezeFeather::new,
            WindCharm::new
        );
        random(magicItemSupplier.size());
        return magicItemSupplier.get(choice).get();
    }

    private void random(int amount) {
        choice = new Random().nextInt(amount);
    }
}

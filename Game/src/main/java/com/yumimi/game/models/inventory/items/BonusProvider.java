package com.yumimi.game.models.inventory.items;

import com.yumimi.game.models.player.Player;

public interface BonusProvider {
    void applyBonuses(Player player);
    void removeBonuses(Player player);
}

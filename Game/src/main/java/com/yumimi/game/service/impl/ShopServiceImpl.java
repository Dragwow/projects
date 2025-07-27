package com.yumimi.game.service.impl;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.inventory.items.ShopItem;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.service.PlayerService;
import com.yumimi.game.service.ShopService;
import jakarta.annotation.PostConstruct;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
@AllArgsConstructor
public class ShopServiceImpl implements ShopService {

    private Player player;
    private final PlayerService playerService;
    private final List<ShopItem> currentItem = new ArrayList<>();
    private final Random random = new Random();

    @PostConstruct
    public void init(){

    }

    @Override
    public void getItem(Item item) {
        player = playerService.getPlayer();
        player.getInventory().addItem(item);
    }

    @Override
    public void scheduleAutoRefresh() {

    }

    @Override
    public void refreshItems() {

    }

    private ShopItem generateRandomShopItem(){

    }
}

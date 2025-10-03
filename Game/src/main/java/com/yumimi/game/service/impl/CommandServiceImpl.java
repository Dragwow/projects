package com.yumimi.game.service.impl;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.inventory.items.ItemFactory;
import com.yumimi.game.models.inventory.items.weapon.WeaponFactory;
import com.yumimi.game.service.CommandService;
import com.yumimi.game.service.PlayerService;
import com.yumimi.game.util.enums.Rarity;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CommandServiceImpl implements CommandService {

    private static final Logger log = LoggerFactory.getLogger(CommandService.class);

    private PlayerService playerService;
    private ItemFactory itemFactory;

    @Override
    public void executeCommand(String text) {
        String[] parts = text.split(" ");

        String command = parts[0];
        String itemName = parts[1];


        switch (command) {
            case "/give_item" -> {
                Item item;
                if (parts.length >= 3) {
                    String rarityName = parts[2].toUpperCase();
                    Rarity rarity;
                    try {
                        rarity = Rarity.valueOf(rarityName);
                    } catch (IllegalArgumentException e) {
                        log.warn("Неизвестная редкость: {}", rarityName);
                        return;
                    }
                    item = itemFactory.createByName(itemName, rarity);
                } else {
                    item = itemFactory.createOtherItems(itemName);
                }

                if (item == null) {
                    log.error("Неизвестный предмет: {}", itemName);
                } else {
                    playerService.getPlayer().getInventory().addItem(item);
                    log.info("Выдан предмет [{}] с редкостью [{}]", item.getName(), item.getRarity());
                }


            }
            case "/show" -> {
                if (parts[1].equals("inventory")) {
                    log.info("\n" + playerService.getPlayer().getInventory()
                        .getAllItems());
                } else if (parts[1].equals("skill")) {
                    log.info("\n" + playerService.getPlayer().getSkillBook()
                        .getAllSkills());
                }
            }
            case "/give_point" -> {
                int point = Integer.parseInt(parts[1]);
                playerService.getPlayer().addPoint(point);
            }
            case "/give_gold" -> {
                int gold = Integer.parseInt(parts[1]);
                playerService.getPlayer().addGold(gold);
            }
            case "/heal" -> {
                int amount = Integer.parseInt(parts[1]);
                playerService.getPlayer().setHp(playerService.getPlayer().getHp() + amount);
                playerService.getPlayer().setMana(playerService.getPlayer().getMana() + amount);
            }
        }


    }
}

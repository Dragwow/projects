package com.yumimi.game.service.impl;

import com.yumimi.game.models.character.Race;
import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.service.CharacterFactoryService;
import com.yumimi.game.service.PlayerService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {


    private final CharacterFactoryService characterFactoryService;

    private Player player;

    private final ObservableList<String> playerBar = FXCollections.observableArrayList();

    @Override
    public Player getPlayer() {
        return this.player;
    }

    @Override
    public List<String> showLeftColumn() {
        if (player == null) return List.of("PLayer not founded");

        List<String> left = leftColumn();

        int size = left.size();

        List<String> table = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            table.add(String.format("%-30s", leftColumn().get(i)));
        }
        return table;
    }

    @Override
    public List<String> showRightColumn() {
        if (player == null) return List.of("Player not founded");

        List<String> right = rightColumn();

        int size = right.size();

        List<String> table = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            table.add(String.format("%-30s", rightColumn().get(i)));
        }
        return table;
    }

    @Override
    public void createPlayer(String playerName, String raceName) {
        Race race = characterFactoryService.selectCharacter(raceName);
        this.player = new Player(playerName, race);
        player.giveStarterWeapon();
        refreshBar();
    }

    @Override
    public void sellItem(Item item, int price) {
        player.addGold(price);
        player.getInventory().removeItem(item);
        System.out.println("Item was sold: " + item.getName());
    }

    @Override
    public void buyItem(Item selected, int gold) {
        if (player.spendGold(gold)) {
            player.getInventory().addItem(selected);
            System.out.println("Bought: " + selected.getName());
        } else System.out.println("Not enough gold");
    }

    private List<String> leftColumn() {
        return List.of(
            String.format("%-13s %s", "GOLD: ", player.getGold()),
            String.format("%-13s %s", "Heal Point: ", player.getHp()),
            String.format("%-13s %s", "Mana: ", player.getMana()),
            String.format("%-13s %s", "Strength: ", player.getStrength()),
            String.format("%-13s %s", "Intelligence: ", player.getIntelligence()),
            String.format("%-13s %s", "Dexterity: ", player.getDexterity()),
            String.format("%-13s %s", "Armour: ", player.getArmour()),
            String.format("%-13s %s", "Damage: ", player.getDamage()),
            String.format("%-13s %s", "Damage Type: ", player.getTypeDamage())
        );
    }

    private List<String> rightColumn() {
        int sto = 100;

        double lifeSteal = player.getLifeSteal() * sto;
        double evasion = player.getEvasion() * sto;
        double regenHp = player.getRegenHp();
        double regenMana = player.getRegenMana() ;
        double blockChance = player.getBlockChance() * sto;
        double hitChance = player.getHitChance() * sto;
        double critChance = player.getCritChance() * sto;
        double critDamage = player.getCritDamage() * sto;

        return List.of(
            String.format("%-13s %s", "Race: ", player.getRace()),
            String.format("%-13s %.2f%%", "Life Steal: ", lifeSteal),
            String.format("%-13s %.2f%%", "Evasion: ", evasion),
            String.format("%-13s %.2f", "Regen Hp: ", regenHp),
            String.format("%-13s %.2f", "Regen Mana: ", regenMana),
            String.format("%-13s %.2f%%", "B/C: ", blockChance),
            String.format("%-13s %.2f%%", "H/C: ", hitChance),
            String.format("%-13s %.2f%%", "C/D: ", critDamage),
            String.format("%-13s %.2f%%", "C/C: ", critChance)
        );
    }

    @Override
    public ObservableList<String> getPlayerBar() {
        return playerBar;
    }

    @Override
    public void refreshBar() {
        playerBar.setAll(column());
    }

    private List<String> column() {
        if (player == null) return List.of("Player not found");
        return List.of(
            String.format("%-13s %s", "Damage: ", player.getDamage()),
            String.format("%-13s %s", "Heal Point: ", player.getHp()),
            String.format("%-13s %s", "Mana: ", player.getMana()),
            String.format("%-13s %s", "Armour: ", player.getArmour()),
            String.format("%-13s %.2f", "Regen Hp: ", player.getRegenHp()),
            String.format("%-13s %.2f", "Regen Mana: ", player.getRegenMana())
        );
    }
}

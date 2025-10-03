package com.yumimi.game.service.impl;

import com.yumimi.game.models.enemy.Enemy;
import com.yumimi.game.models.enemy.FactoryMobs;
import com.yumimi.game.service.EnemyService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EnemyServiceImpl implements EnemyService {

    private final FactoryMobs factoryMobs;

    private Enemy enemy;

    private final ObservableList<String> enemyBar = FXCollections.observableArrayList();

    @Override
    public List<Enemy> generateListEnemy() {
        List<Enemy> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(factoryMobs.generateMob());
        }

        return list;
    }
    @Override
    public Enemy getEnemy() {
        return enemy;
    }

    @Override
    public void setEnemy(Enemy enemy) {
        this.enemy = enemy;
        refreshBar();
    }

    @Override
    public ObservableList<String> getEnemyBar() {
        return enemyBar;
    }

    @Override
    public void refreshBar() {
        enemyBar.setAll(column());
    }

    private List<String> column() {
        if (enemy == null) return List.of("Enemy not found");
        return List.of(
            String.format("%-13s %s", "Damage: ", enemy.getDamage()),
            String.format("%-13s %s", "Heal Point: ", enemy.getHp()),
            String.format("%-13s %s", "Mana: ", enemy.getMana()),
            String.format("%-13s %s", "Armour: ", enemy.getArmour()),
            String.format("%-13s %.2f", "Regen Hp: ", enemy.getRegenHp()),
            String.format("%-13s %.2f", "Regen Mana: ", enemy.getRegenMana())
        );
    }
}

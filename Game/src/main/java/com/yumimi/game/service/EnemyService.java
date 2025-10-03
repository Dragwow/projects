package com.yumimi.game.service;

import com.yumimi.game.models.enemy.Enemy;
import javafx.collections.ObservableList;

import java.util.List;

public interface EnemyService {

    List<Enemy> generateListEnemy();

    Enemy getEnemy();
    void setEnemy(Enemy enemy);
    ObservableList<String> getEnemyBar();
    void refreshBar();
}

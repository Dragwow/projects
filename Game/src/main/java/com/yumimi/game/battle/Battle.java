package com.yumimi.game.battle;

import com.yumimi.game.models.enemy.AIEnemy;
import com.yumimi.game.models.enemy.Enemy;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.models.skill.Skill;
import com.yumimi.game.service.EnemyService;
import com.yumimi.game.service.PlayerService;
import lombok.Getter;

@Getter
public class Battle {

    private final Player player;
    private final Enemy enemy;
    private final CombatLog combatLog;
    private final AIEnemy aiEnemy;
    private final PlayerService playerService;
    private final EnemyService enemyService;

    public Battle(Player player, Enemy enemy, PlayerService playerService, EnemyService enemyService){
        this.player = player;
        this.enemy = enemy;
        this.playerService = playerService;
        this.enemyService = enemyService;
        this.combatLog = new CombatLog();
        this.aiEnemy = new AIEnemy();

        player.setCombatLog(combatLog);
        enemy.setCombatLog(combatLog);
    }

    // Battle.java
    public boolean playerUseSkill(Skill skill) {
        if (!player.isStunned()) {
            skill.use(player, enemy);
            playerService.refreshBar();
            enemyService.refreshBar();
        } else {
            player.decreaseStunDuration();
        }
        return isBattleOver();
    }

    public boolean enemyUseSkill() {
        if (!enemy.isStunned()) {
            aiEnemy.chooseSkill(enemy, player);
            playerService.refreshBar();
            enemyService.refreshBar();
        } else {
            enemy.decreaseStunDuration();
        }
        return isBattleOver();
    }

    public boolean isBattleOver() {
        return player.isDead() || enemy.isDead();
    }

}

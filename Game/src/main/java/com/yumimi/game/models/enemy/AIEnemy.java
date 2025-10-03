package com.yumimi.game.models.enemy;

import com.yumimi.game.models.player.Player;
import com.yumimi.game.models.skill.Skill;

import java.util.*;

public class AIEnemy {

    public void chooseSkill(Enemy enemy, Player player) {
        List<Skill> skills = new ArrayList<>(List.of(
            enemy.getFirstSkillSlot(),
            enemy.getSecondSkillSlot(),
            enemy.getThirdSkillSlot(),
            enemy.getFourthSkillSlot()
        ));


        skills.removeIf(Objects::isNull);
        if (skills.isEmpty()) return;

        Skill chosen = skills.stream()
            .max(Comparator.comparingInt(skill -> calculatePriority(skill, enemy, player)))
            .orElse(skills.get(0));

        chosen.use(enemy, player);

    }

    private int calculatePriority(Skill skill, Enemy enemy, Player player) {
        switch (skill.getSkillType()) {
            case HEALING -> {
                int hp = enemy.getHp();
                if (hp < 45) return 110;
                else if (hp < 70) return 80;
                else return 10;
            }
            case STUN -> {
                if (!player.isStunned() && player.getHp() < enemy.getHp()) return 100;
                if (!player.isStunned() && player.getDamage() > enemy.getHp()) return 90;
                return 30;
            }
            case DEFENSIVE -> {
                if (player.getHp() > enemy.getHp()) return 80;
                if (player.getDamage() > enemy.getHp() * 0.4) return 70;
                return 20;

            }
            case DAMAGE -> {
                if (player.getHp() < enemy.getDamage()) return 120;
                if (enemy.getHp() > 50) return 90;
                return 60;
            }
            default -> {
                return 10;
            }
        }
    }
}

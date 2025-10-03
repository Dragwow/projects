package com.yumimi.game.models.enemy;

import com.yumimi.game.models.enemy.mob.Goblin;
import com.yumimi.game.models.enemy.mob.Orс;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@Component
public class FactoryMobs {

    private final SkillFactoryEnemy skillFactoryEnemy = new SkillFactoryEnemy();
    private int count;

    public Enemy generateMob(){

        List<Supplier<Enemy>> mobSupplier = List.of(
            () -> {
                Goblin goblin = new Goblin();
                goblin.setSkillFactoryEnemy(skillFactoryEnemy);
                goblin.equipSkillForEnemy(goblin);
                return goblin;
            },
            () ->  {
                Orс orc = new Orс();
                orc.setSkillFactoryEnemy(skillFactoryEnemy);
                orc.equipSkillForEnemy(orc);
                return orc;
            }
        );
        random(mobSupplier.size());
        return mobSupplier.get(count).get();
    }

    private void random(int amount) {
        count = new Random().nextInt(amount);
    }



}

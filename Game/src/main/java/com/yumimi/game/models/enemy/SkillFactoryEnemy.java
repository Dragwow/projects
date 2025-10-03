package com.yumimi.game.models.enemy;

import com.yumimi.game.models.skill.Skill;
import com.yumimi.game.models.skill.armorSkill.BigShield;
import com.yumimi.game.models.skill.damageSkill.*;
import com.yumimi.game.models.skill.healingSkill.HolyCircle;
import com.yumimi.game.models.skill.stunSkill.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

@Component
public class SkillFactoryEnemy {

    private int count;

    public Skill generateFirstSkillForEnemy(){
        List<Supplier<Skill>> skillSupplier = List.of(
            Fireball::new,
            Lose::new,
            HolyCircle::new,
            BigShield::new
        );
        random(skillSupplier.size());
        return skillSupplier.get(count).get();
    }

    private void random(int amount) {
        count = new Random().nextInt(amount);
    }

}

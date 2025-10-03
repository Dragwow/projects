package com.yumimi.game.models.skill;

import com.yumimi.game.battle.Combatant;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.SkillType;

public interface Skill {

    String getName();
    String getDescription();
    Rarity getRarity();
    int getPoint();
    void use(Combatant caster, Combatant target);
    SkillType getSkillType();
}

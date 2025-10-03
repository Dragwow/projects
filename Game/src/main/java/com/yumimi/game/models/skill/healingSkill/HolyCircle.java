package com.yumimi.game.models.skill.healingSkill;

import com.yumimi.game.models.skill.SkillData;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.SkillType;
import com.yumimi.game.util.enums.SupType;
import com.yumimi.game.util.enums.TypeUseSkill;
import org.springframework.stereotype.Component;

@Component
public class HolyCircle extends SkillData {

    public HolyCircle(){
        setName("Holy Circle");
        setDescription("Heal 10 hp");
        setPoint(5);
        setHeal(10);
        setManaCost(26);
        setSupType(SupType.HP);
        setTypeUseSkill(TypeUseSkill.MAGIC);
        setRarity(Rarity.EPIC);
        setSkillType(SkillType.HEALING);
    }
}

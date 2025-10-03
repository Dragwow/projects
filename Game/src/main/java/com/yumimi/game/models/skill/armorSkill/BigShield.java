package com.yumimi.game.models.skill.armorSkill;

import com.yumimi.game.models.skill.SkillData;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.SkillType;
import org.springframework.stereotype.Component;

@Component
public class BigShield extends SkillData {

    public BigShield(){
        setName("Big Shield");
        setDescription("Give 3 armor");
        setPoint(2);
        setArmour(3);
        setManaCost(16);
        setRarity(Rarity.COMMON);
        setSkillType(SkillType.DEFENSIVE);
    }
}

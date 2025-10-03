package com.yumimi.game.models.skill.stunSkill;

import com.yumimi.game.models.skill.SkillData;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.SkillType;
import com.yumimi.game.util.enums.TypeUseSkill;
import org.springframework.stereotype.Component;

@Component
public class Lose extends SkillData {

    public Lose(){
        setName("Lose");
        setDescription("Stuning enemy for 1 move");
        setPoint(4);
        setStunDuration(1);
        setManaCost(45);
        setRarity(Rarity.RARE);
        setTypeUseSkill(TypeUseSkill.MAGIC);
        setSkillType(SkillType.STUN);
    }
}

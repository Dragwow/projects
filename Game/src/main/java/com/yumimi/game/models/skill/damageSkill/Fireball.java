package com.yumimi.game.models.skill.damageSkill;

import com.yumimi.game.models.skill.SkillData;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.SkillType;
import com.yumimi.game.util.enums.TypeDamage;
import com.yumimi.game.util.enums.TypeUseSkill;
import org.springframework.stereotype.Component;

@Component
public class Fireball extends SkillData {

    public Fireball() {
        setName("Fireball");
        setDescription("Deals damage player + 15");
        setPoint(3);
        setDamage(15);
        setRarity(Rarity.RARE);
        setTypeUseSkill(TypeUseSkill.MAGIC);
        setManaCost(30);
        setTypeDamage(TypeDamage.Magic);
        setSkillType(SkillType.DAMAGE);
    }
}

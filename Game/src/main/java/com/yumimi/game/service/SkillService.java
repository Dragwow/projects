package com.yumimi.game.service;

import com.yumimi.game.models.skill.Skill;

public interface SkillService {

    void equipSkill(Skill skill);
    void unequipSkill(Skill skill);
}

package com.yumimi.game.service.impl;

import com.yumimi.game.models.player.Player;
import com.yumimi.game.models.skill.Skill;
import com.yumimi.game.service.PlayerService;
import com.yumimi.game.service.SkillService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class SkillServiceImpl implements SkillService {

    private final PlayerService playerService;

    @Override
    public void equipSkill(Skill skill) {
        Player player = playerService.getPlayer();
        player.equipSkill(skill, player);
    }

    @Override
    public void unequipSkill(Skill skill) {
        Player player = playerService.getPlayer();
        player.unequipSkillSlot(skill, player);
    }
}

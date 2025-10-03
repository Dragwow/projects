package com.yumimi.game.models.skill;

import com.yumimi.game.models.player.Player;
import lombok.Getter;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class SkillBook {

    private final Set<Skill> skills = new HashSet<>();

    public void addSkill(Player player, Skill skill) {
        if (skills.contains(skill)){
            System.out.println(skill.getName() + " already have");
            return;
        }
        if (!player.spendPoint(skill.getPoint())){
            System.out.println("Not enough points to buy: " + skill.getName());
            return;
        }

        skills.add(skill);
        System.out.println("Bought skill: " + skill.getName());

    }

    public String getAllSkills() {
        return skills.stream()
            .sorted(Comparator.comparing(Skill::getName))
            .map(skill -> skill.getName() + " | " + skill.getDescription() +  " | " + skill.getRarity() + " | ")
            .collect(Collectors.joining("\n"));
    }

}

package com.yumimi.game.models.skill;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@AllArgsConstructor
@Getter
public class SkillRegistry {

    private final List<Skill> allSkills ;

}

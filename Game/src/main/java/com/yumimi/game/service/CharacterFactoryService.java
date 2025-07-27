package com.yumimi.game.service;

import com.yumimi.game.models.character.Race;

import java.util.List;

public interface CharacterFactoryService {

    List<String> getAvailableRaces();
    Race selectCharacter(String raceName);
}

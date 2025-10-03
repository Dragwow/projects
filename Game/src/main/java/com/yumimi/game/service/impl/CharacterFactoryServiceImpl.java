package com.yumimi.game.service.impl;

import com.yumimi.game.models.character.Elf;
import com.yumimi.game.models.character.Human;
import com.yumimi.game.models.character.Race;
import com.yumimi.game.models.inventory.items.ItemFactory;
import com.yumimi.game.models.inventory.items.weapon.WeaponFactory;
import com.yumimi.game.service.CharacterFactoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CharacterFactoryServiceImpl implements CharacterFactoryService {

    private final WeaponFactory weaponFactory;


    @Override
    public List<String> getAvailableRaces() {
        return List.of("elf", "human");
    }


    @Override
    public Race selectCharacter(String raceName) {
        return switch (raceName.toLowerCase()){
            case "elf" -> new Elf(weaponFactory);
            case "human" -> new Human(weaponFactory);
            default -> throw new IllegalArgumentException("Неизвестная раса: " + raceName);
        };

    }
}

package com.yumimi.game.service.impl;

import com.yumimi.game.models.character.Race;
import com.yumimi.game.models.inventory.Equipment;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.service.CharacterFactoryService;
import com.yumimi.game.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServiceImpl implements PlayerService {

    private final CharacterFactoryService characterFactoryService;

    private Player player;

    @Override
    public Player getPlayer() {
        return this.player;
    }

    @Override
    public List<String> showCharacteristics() {
        if (player == null) return List.of("PLayer not founded");

        return List.of(
            "Race: " + player.getRace(),
            "Heal Point: " + player.getHp(),
            "Mana: " + player.getMana(),
            "Strength: " + player.getStrength(),
            "Intelligence: " + player.getIntelligence(),
            "Dexterity: " + player.getDexterity(),
            "Armour: " + player.getArmour(),
            "Damage: " + player.getDamage(),
            "Damage Type: " + player.getTypeDamage()
            );
    }

    @Override
    public void createPlayer(String playerName, String raceName) {
        Race race = characterFactoryService.selectCharacter(raceName);
        this.player = new Player(playerName, race);
        player.giveStarterWeapon();
    }

    @Override
    public void updateEquip(Equipment equipment) {
        player = getPlayer();
        player.setEquipment(equipment);
    }
}

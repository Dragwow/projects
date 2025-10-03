package com.yumimi.game.models.inventory.items.weapon;

import com.yumimi.game.battle.Combatant;
import com.yumimi.game.models.enemy.Enemy;
import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.models.skill.Skill;
import com.yumimi.game.util.enums.MagicType;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.SkillType;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.util.stats.StatBlock;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class AttackWeapon extends StatBlock implements Item, Skill {

    private String name;                 // Имя предмета
    private String description;          // Описание
    private Rarity rarity;               // Редкость
    private TypeItem typeItem;           // Тип предмета
    private int price;

    private int quantity = 1;            // Количество
    private Integer durability;          // Прочность

    private boolean equipped;

    private MagicType magicType;         // Тип магии для магов

    // Изменение прочности
    public void reduceDurability(int amount) {
        if (durability != null) {
            durability -= amount;
            if (durability < 0) durability = 0;
        }
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isBroken() {
        return durability != null && durability <= 0;
    }

    @Override
    public boolean equipped() {
        return equipped;
    }

    @Override
    public void setEquipped(boolean value) {
        this.equipped = value;
    }

    @Override
    public void use(Combatant caster, Combatant target) {

    }

    @Override
    public int getPoint() {
        return 0;
    }

    @Override
    public SkillType getSkillType() {
        return null;
    }


}

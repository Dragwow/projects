package com.yumimi.game.models.inventory;

import com.yumimi.game.models.inventory.items.Item;
import lombok.Getter;

@Getter
public class Equipment {

    private Item weaponSlot;
    private Item helmetSlot;
    private Item armourSlot;
    private Item ringSlot;
    private Item handSlot;
    private Item bootSlot;
    private Item magicSlot1;
    private Item magicSlot2;

    public void equipItem(Item item){
        item.setEquipped(true);
        switch(item.getTypeItem()){
            case Attack_Melee,
                 Attack_Range,
                 Attack_Magic -> weaponSlot  = item;
            case Helmet -> helmetSlot = item;
            case Armour -> armourSlot = item;
            case Ring -> ringSlot = item;
            case Hand -> handSlot = item;
            case Boot -> bootSlot = item;
            case Magic_item -> magicSlot1 = item;
        }
    }
    @Override
    public String toString() {
        return "Equipment{" +
            "weapon=" + (weaponSlot != null ? weaponSlot.getName() : "empty") +
            ", helmet=" + (helmetSlot != null ? helmetSlot.getName() : "empty") +
            ", armour=" + (armourSlot != null ? armourSlot.getName() : "empty") +
            ", ring=" + (ringSlot != null ? ringSlot.getName() : "empty") +
            ", boots=" + (bootSlot != null ? bootSlot.getName() : "empty") +
            ", hand=" + (handSlot != null ? handSlot.getName() : "empty") +
            '}';
    }


}

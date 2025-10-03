module com.yumimi.game {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires static lombok;
    requires spring.context;
    requires spring.beans;
    requires spring.boot;
    requires spring.boot.autoconfigure;
    requires jdk.compiler;
    requires jakarta.annotation;
    requires java.sql;
    requires org.slf4j;

    opens com.yumimi.game to javafx.fxml, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.config to spring.core, spring.beans, spring.context;
    opens com.yumimi.game.service to spring.core, spring.beans, spring.context;
    opens com.yumimi.game.screens to javafx.fxml, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.service.impl to spring.core, spring.beans, spring.context;

    opens com.yumimi.game.util.commands to spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.craft to spring.core, spring.beans, spring.context;

    exports com.yumimi.game;
    exports com.yumimi.game.screens;
    opens com.yumimi.game.battle to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.skill.healingSkill to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.skill.stunSkill to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.enemy to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.skill.armorSkill to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.skill.damageSkill to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.skill to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.inventory.items.potion to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.inventory.items.crafts_items to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.inventory.items.magic_items to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.inventory.items.robes to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.inventory.items.weapon to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.inventory.items to javafx.base, spring.beans, spring.context, spring.core;
    opens com.yumimi.game.util.enums to javafx.base, spring.beans, spring.context, spring.core;
    opens com.yumimi.game.models.shop to javafx.base, spring.beans, spring.context, spring.core;
    exports com.yumimi.game.screens.screens;
    opens com.yumimi.game.screens.screens to javafx.fxml, spring.beans, spring.context, spring.core;
    opens com.yumimi.game.util.stats to spring.beans, spring.context, spring.core;
    opens com.yumimi.game.util.rarity to javafx.base, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.enemy.mob to javafx.base, spring.beans, spring.context, spring.core;
}

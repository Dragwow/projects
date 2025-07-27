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

    opens com.yumimi.game to javafx.fxml, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.config to spring.core, spring.beans, spring.context;
    opens com.yumimi.game.service to spring.core, spring.beans, spring.context;
    opens com.yumimi.game.screens to javafx.fxml, spring.core, spring.beans, spring.context;
    opens com.yumimi.game.service.impl to spring.core, spring.beans, spring.context;
    opens com.yumimi.game.models.inventory.items.weapon.melee to javafx.base;  // <--- вот это

    exports com.yumimi.game;
    exports com.yumimi.game.screens;
    opens com.yumimi.game.models.inventory.items.weapon to javafx.base;
    opens com.yumimi.game.utils.bonuses to spring.beans, spring.context, spring.core;
    opens com.yumimi.game.models.inventory.items to javafx.base, spring.beans, spring.context, spring.core;
    opens com.yumimi.game.utils.enums to javafx.base, spring.beans, spring.context, spring.core;
}

package com.yumimi.game.screens.screens;

import com.yumimi.game.battle.Battle;
import com.yumimi.game.models.craft.RecipeRegistry;
import com.yumimi.game.models.skill.SkillRegistry;
import com.yumimi.game.screens.Screen;
import com.yumimi.game.screens.ScreenManager;
import com.yumimi.game.service.*;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class StartScreen extends VBox implements Screen {

    private final CharacterFactoryService characterFactoryService;
    private final PlayerService playerService;
    private final InventoryService inventoryService;
    private final ShopService shopService;
    private final RecipeRegistry recipeRegistry;
    private final CraftingService craftingService;
    private final SkillRegistry skillRegistry;
    private final SkillService skillService;
    private final ScreenManager screenManager;
    private final EnemyService enemyService;

    private final String GAME_SCREEN = "GameScreen";
    private final String INVENTORY_SCREEN = "InventoryScreen";
    private final String SHOP_SCREEN = "ShopScreen";
    private final String CRAFTING_SCREEN = "CraftingScreen";
    private final String SKILL_TREE_SCREEN = "SkillTreeScreen";
    private final String FIGHT_SCREEN = "FightScreen";
    private final String PRESENTS_SCREEN = "PresentsScreen";

    @Override
    public String getName() {
        return "StartScreen";
    }

    @Override
    public Parent getView() {
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Text title = new Text("Создание персонажа");
        title.setStyle("-fx-font-size: 20; -fx-font-weight: bold;");

        Text availableRacesText = new Text("Доступные расы: " + characterFactoryService.getAvailableRaces());

        ComboBox<String> raceComboBox = new ComboBox<>();
        raceComboBox.getItems().addAll(characterFactoryService.getAvailableRaces());


        TextField nameField = new TextField();
        nameField.setPromptText("Введите имя персонажа");

        Button createButton = new Button("Создать персонажа");
        Label resultLabel = new Label();

        createButton.setOnAction(event -> {
            String username = nameField.getText();
            String race = raceComboBox.getValue();
            playerService.createPlayer(username, race);

            screenManager.addScreen(new GameScreen(
                playerService,
                enemyService,
                () -> screenManager.showScreen(INVENTORY_SCREEN),
                () -> screenManager.showScreen(SHOP_SCREEN),
                () -> screenManager.showScreen(CRAFTING_SCREEN),
                () -> screenManager.showScreen(SKILL_TREE_SCREEN),
                () -> screenManager.showScreen(FIGHT_SCREEN)
            ));

            screenManager.addScreen(new InventoryScreen(
                playerService.getPlayer().getInventory(),
                playerService,
                inventoryService,
                () -> screenManager.showScreen(GAME_SCREEN)
            ));

            screenManager.addScreen(new ShopScreen(
                shopService,
                playerService.getPlayer().getInventory(),
                playerService,
                () -> screenManager.showScreen(GAME_SCREEN)
            ));

            screenManager.addScreen(new CraftingScreen(
                playerService.getPlayer().getInventory(),
                recipeRegistry,
                craftingService,
                () -> screenManager.showScreen(GAME_SCREEN)
            ));

            screenManager.addScreen(new SkillTreeScreen(
                skillRegistry,
                playerService,
                skillService,
                () -> screenManager.showScreen(GAME_SCREEN)
            ));

            screenManager.addScreen(new FightScreen(
                playerService,
                enemyService,
                () -> screenManager.showScreen(GAME_SCREEN),
                () -> screenManager.showScreen(PRESENTS_SCREEN)
            ));

            screenManager.showScreen(GAME_SCREEN);
        });


        root.getChildren().addAll(
            title,
            availableRacesText,
            new Label("Выберите расу:"),
            raceComboBox,
            new Label("Имя персонажа:"),
            nameField,
            createButton,
            resultLabel
        );

        return root;
    }

}

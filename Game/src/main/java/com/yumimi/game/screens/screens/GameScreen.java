package com.yumimi.game.screens.screens;

import com.yumimi.game.models.enemy.Enemy;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.screens.Screen;
import com.yumimi.game.service.EnemyService;
import com.yumimi.game.service.PlayerService;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class GameScreen extends VBox implements Screen {

    private final PlayerService playerService;
    private final EnemyService enemyService;
    private final Runnable inventoryAction;
    private final Runnable shopAction;
    private final Runnable craftingAction;
    private final Runnable skillAction;
    private final Runnable fightAction;

    @Override
    public String getName() {
        return "GameScreen";
    }

    @Override
    public Parent getView() {
        VBox layout = new VBox(10);
        Player player = playerService.getPlayer();

        Text title = new Text(player.getName() + "Profile");
        layout.getChildren().add(title);

        Button inventoryBtn = new Button("Inventory");
        inventoryBtn.setPrefSize(85, 15);

        Button shopBtn = new Button("Shop");
        shopBtn.setPrefSize(85, 15);

        Button craftingBtn = new Button("Craft");
        craftingBtn.setPrefSize(85, 15);

        Button skillBtn = new Button("Skill Tree");
        skillBtn.setPrefSize(85, 15);

        VBox vBox = new VBox(10, leftColumn(),
            new HBox(30, inventoryBtn, shopBtn),
            new HBox(30, craftingBtn, skillBtn));

        HBox hBox = new HBox(10, vBox, rightColumn());

        layout.getChildren().addAll(new HBox(100, hBox, foundedEnemy()));

        inventoryBtn.setOnAction(e -> inventoryAction.run());
        shopBtn.setOnAction(e -> shopAction.run());
        craftingBtn.setOnAction(e -> craftingAction.run());
        skillBtn.setOnAction(e -> skillAction.run());

        layout.setStyle("-fx-padding: 20");
        return layout;
    }

    private ListView<String> leftColumn() {
        ListView<String> column = new ListView<>();
        column.getItems().addAll(playerService.showLeftColumn());
        column.setMaxSize(200, 225);
        column.setSelectionModel(null);
        return column;
    }

    private ListView<String> rightColumn() {
        ListView<String> column = new ListView<>();
        column.getItems().addAll(playerService.showRightColumn());
        column.setMaxSize(200, 225);
        column.setSelectionModel(null);
        return column;
    }

    private ListView<Enemy> foundedEnemy() {
        ListView<Enemy> listEnemy = new ListView<>();
        listEnemy.getItems().addAll(enemyService.generateListEnemy());
        listEnemy.setMaxHeight(250);

        listEnemy.setOnMouseClicked(e -> {
            if (e.getClickCount() == 2) {
                Enemy selected = listEnemy.getSelectionModel().getSelectedItem();
                if (selected != null){
                    enemyService.setEnemy(selected);
                    fightAction.run();
                }

            }
        });

        return listEnemy;
    }

}

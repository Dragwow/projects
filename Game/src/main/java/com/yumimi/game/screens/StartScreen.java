package com.yumimi.game.screens;

import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.service.CharacterFactoryService;
import com.yumimi.game.service.InventoryService;
import com.yumimi.game.service.PlayerService;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class StartScreen {

    private final CharacterFactoryService characterFactoryService;
    private final PlayerService playerService;
    private final InventoryService inventoryService;

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

            try {
                playerService.createPlayer(username, race);

                // Создаём GameScreen и InventoryScreen и связываем их
                GameScreen gameScreen = new GameScreen(playerService);
                InventoryScreen inventoryScreen = new InventoryScreen(
                    playerService.getPlayer().getInventory(),
                    gameScreen,
                    playerService,
                    inventoryService
                );
                gameScreen.setInventoryScreen(inventoryScreen); // установка ссылки

                // Показываем сцену
                Stage stage = (Stage) createButton.getScene().getWindow();
                stage.setScene(new Scene(gameScreen.getView(), 800, 600));

            } catch (Exception e) {
                resultLabel.setText("Ошибка: " + e.getMessage());
                System.out.println("Ошибка: " + e.getMessage());
            }
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

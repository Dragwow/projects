package com.yumimi.game.screens;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.springframework.stereotype.Component;
import javafx.scene.text.Text;

@Component
public class MenuScreen extends VBox {

    private final StartScreen startScreen;

    public MenuScreen(StartScreen startScreen) {
        this.startScreen = startScreen;
        this.getChildren().add(getView());
    }

    public VBox getView() {
        Text title = new Text("Main menu");

        Button startGameBtn = new Button("Start game");
        Button continueGameBtn = new Button("Continue game");
        Button exitBtn = new Button("Exit");

        startGameBtn.setOnAction(e -> {
            Stage stage = (Stage) startGameBtn.getScene().getWindow();
            stage.setScene(new Scene(startScreen.getView(), 800, 600));
        });

        VBox layout = new VBox(15, title, startGameBtn, continueGameBtn, exitBtn);
        layout.setStyle("-fx-padding: 40; -fx-alignment: center;");

        return layout;
    }
}

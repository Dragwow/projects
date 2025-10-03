package com.yumimi.game;

import com.yumimi.game.config.AppConfig;
import com.yumimi.game.screens.ScreenManager;
import com.yumimi.game.service.GameScreenService;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainView extends Application {

    private GameScreenService gameScreenService;
    private StackPane root;

    @Override
    public void init(){
        AppConfig.initSpring();
        gameScreenService = AppConfig.getBeans(GameScreenService.class);
    }

    @Override
    public void start(Stage stage){
        ScreenManager screenManager = AppConfig.getBeans(ScreenManager.class);
        screenManager.setPrimaryStage(stage);

        root = new StackPane();
        showMainMenu();

        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Rpg Text Game");
        stage.show();
    }

    private void showMainMenu(){
        root.getChildren().setAll(
            gameScreenService.getMainMenu()
        );
    }

    @Override
    public void stop(){
        AppConfig.stop();
    }
}

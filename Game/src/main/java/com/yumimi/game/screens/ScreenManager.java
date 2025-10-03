package com.yumimi.game.screens;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class ScreenManager {

    @Setter
    private Stage primaryStage;
    private Scene scene;
    private final Map<String, Screen> screens = new HashMap<>();


    public void addScreen(Screen screen) {
        screens.put(screen.getName(), screen);
    }

    public void showScreen(String name) {
        Screen screen = screens.get(name);
        if (screen == null) return;

        Parent view = screen.getView();

        if (scene == null) {
            scene = new Scene(view, 1000, 600);
            primaryStage.setScene(scene);
            primaryStage.show();
        } else {
            scene.setRoot(view);
        }
    }
}



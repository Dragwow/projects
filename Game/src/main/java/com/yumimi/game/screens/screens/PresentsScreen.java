package com.yumimi.game.screens.screens;

import com.yumimi.game.screens.Screen;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class PresentsScreen extends VBox implements Screen {

    @Override
    public String getName() {
        return "PresentsScreen";
    }

    @Override
    public Parent getView() {
VBox root = new VBox();
root.getChildren().add(new Label("werwer"));
        return root ;
    }
}

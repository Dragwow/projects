package com.yumimi.game.screens;

import com.yumimi.game.models.player.Player;
import com.yumimi.game.service.PlayerService;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.List;

@RequiredArgsConstructor
public class GameScreen extends VBox{

    private final PlayerService playerService;
    @Setter
    private InventoryScreen inventoryScreen;

    public VBox getView(){
        VBox layout = new VBox(10);
        Player player = playerService.getPlayer();

        Text title = new Text(player.getUsername() + "Profile");
        layout.getChildren().add(title);

        List<String> characteristics = playerService.showCharacteristics();
        for (String line : characteristics){
            layout.getChildren().add(new Text(line));
        }

        Button inventoryBtn = new Button("Inventory");
        layout.getChildren().add(inventoryBtn);

        inventoryBtn.setOnAction(e-> {
            Stage stage = (Stage) inventoryBtn.getScene().getWindow();
            stage.setScene(new javafx.scene.Scene(inventoryScreen.getView(), 800, 600));
        });

        layout.setStyle("-fx-padding: 20");
        return layout;
    }



}

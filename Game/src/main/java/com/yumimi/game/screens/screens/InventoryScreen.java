package com.yumimi.game.screens.screens;

import com.yumimi.game.models.inventory.Inventory;
import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.screens.Screen;
import com.yumimi.game.util.enums.Rarity;
import com.yumimi.game.util.enums.TypeItem;
import com.yumimi.game.service.InventoryService;
import com.yumimi.game.service.PlayerService;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class InventoryScreen extends VBox implements Screen {

    private final Inventory inventory;
    private final PlayerService playerService;
    private final InventoryService inventoryService;
    private final Runnable backAction;

    @Override
    public String getName() {
        return "InventoryScreen";
    }

    public Parent getView(){
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Button backButton = new Button("Назад");
        backButton.setOnAction(e -> backAction.run());


        TableView<Item> table = new TableView<>();

        TableColumn<Item, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Item, String> descriptionColumn = getItemStringTableColumn();

        TableColumn<Item, Rarity> rarityColumn = new TableColumn<>("Rarity");
        rarityColumn.setCellValueFactory(new PropertyValueFactory<>("rarity"));

        TableColumn<Item, TypeItem> typeItemColumn = new TableColumn<>("Type Item");
        typeItemColumn.setCellValueFactory(new PropertyValueFactory<>("typeItem"));

        TableColumn<Item, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table.getColumns().addAll(nameColumn, descriptionColumn, rarityColumn, typeItemColumn, quantityColumn);
        table.setItems(inventory.getItems());
        table.setPrefHeight(400);

        Label weaponLabel = new Label();
        Label helmetLabel = new Label();
        Label armourLabel = new Label();
        Label ringLabel = new Label();
        Label handLabel = new Label();
        Label bootsLabel = new Label();

        VBox slotBox = new VBox(10, weaponLabel, helmetLabel, armourLabel, ringLabel, handLabel, bootsLabel);

        updateSlots(
            weaponLabel,
            helmetLabel,
            armourLabel,
            ringLabel,
            handLabel,
            bootsLabel);

        table.setOnMouseClicked(e -> {
            Item selectedItem = table.getSelectionModel().getSelectedItem();
            if (selectedItem != null){
                inventoryService.equipItem(selectedItem);
                updateSlots(
                    weaponLabel,
                    helmetLabel,
                    armourLabel,
                    ringLabel,
                    handLabel,
                    bootsLabel);
            }
        });

        root.getChildren().addAll(backButton, table, new Label("Slots equip:"), slotBox);
        return root;
    }

    private static TableColumn<Item, String> getItemStringTableColumn() {
        TableColumn<Item, String> descriptionColumn = new TableColumn<>("Description");
        descriptionColumn.setCellValueFactory(new PropertyValueFactory<>("description"));
        descriptionColumn.setCellFactory(tc-> new TableCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setTooltip(null);
                } else {
                    String line = item.split("\\R", 2)[0];
                    setText(line);

                    Tooltip tooltip = new Tooltip(item);
                    setTooltip(tooltip);
                }
            }
        });
        return descriptionColumn;
    }


    private void updateSlots(
        Label weapon,
        Label helmet,
        Label armour,
        Label ring,
        Label hand,
        Label boots){
        Player player = playerService.getPlayer();
        weapon.setText("Weapon: " + formatItem(player.getWeaponSlot()));
        helmet.setText("Helmet: " + formatItem(player.getHelmetSlot()));
        armour.setText("Armour: " + formatItem(player.getArmourSlot()));
        ring.setText("Ring: " + formatItem(player.getRingSlot()));
        hand.setText("Hand: " + formatItem(player.getHandSlot()));
        boots.setText("Boots: " + formatItem(player.getBootSlot()));
    }

    private String formatItem(Item item) {
        return item != null ? item.getName() + " (" + item.getRarity() + ")" : " ";
    }


}

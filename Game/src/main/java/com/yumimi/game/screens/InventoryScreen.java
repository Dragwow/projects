package com.yumimi.game.screens;

import com.yumimi.game.models.inventory.Equipment;
import com.yumimi.game.models.inventory.Inventory;
import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.utils.enums.Rarity;
import com.yumimi.game.utils.enums.TypeItem;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.service.InventoryService;
import com.yumimi.game.service.PlayerService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import lombok.AllArgsConstructor;


@AllArgsConstructor
public class InventoryScreen {

    private final Inventory inventory;
    private final GameScreen gameScreen;
    private final PlayerService playerService;
    private final InventoryService inventoryService;


    public Parent getView(){
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Button backButton = new Button("Назад в игру");
        backButton.setOnAction(e ->
            root.getScene().setRoot(gameScreen.getView())
        );


        TableView<Item> table = new TableView<>();
        ObservableList<Item> itemList = FXCollections.observableArrayList(inventory.getItems());

        TableColumn<Item, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Item, Rarity> rarityColumn = new TableColumn<>("Rarity");
        rarityColumn.setCellValueFactory(new PropertyValueFactory<>("rarity"));

        TableColumn<Item, TypeItem> typeItemColumn = new TableColumn<>("Type Item");
        typeItemColumn.setCellValueFactory(new PropertyValueFactory<>("typeItem"));

        table.getColumns().addAll(nameColumn, rarityColumn, typeItemColumn);
        table.setItems(itemList);
        table.setPrefHeight(300);

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


    private Equipment syncEquippedItemsFromInventory(Player player) {
        Equipment equipment = new Equipment();
        for (Item item : player.getInventory().getItems()){
            if (item.equipped()){
                equipment.equipItem(item);
            }
        }
        return equipment;
    }

    public void updateSlots(
        Label weapon,
        Label helmet,
        Label armour,
        Label ring,
        Label hand,
        Label boots){
        Equipment equipment = playerService.getPlayer().getEquipment();
        weapon.setText("Weapon: " + formatItem(equipment.getWeaponSlot()));
        helmet.setText("Helmet: " + formatItem(equipment.getHelmetSlot()));
        armour.setText("Armour: " + formatItem(equipment.getArmourSlot()));
        ring.setText("Ring: " + formatItem(equipment.getRingSlot()));
        hand.setText("Hand: " + formatItem(equipment.getHandSlot()));
        boots.setText("Boots: " + formatItem(equipment.getBootSlot()));
    }

    private String formatItem(Item item) {
        return item != null ? item.getName() + " (" + item.getRarity() + ")" : " ";
    }

}

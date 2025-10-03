package com.yumimi.game.screens.screens;

import com.yumimi.game.models.inventory.Inventory;
import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.shop.ShopItem;
import com.yumimi.game.screens.Screen;
import com.yumimi.game.service.PlayerService;
import com.yumimi.game.service.ShopService;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ShopScreen extends VBox implements Screen {

    private final ShopService shopService;
    private final Inventory inventory;
    private final PlayerService playerService;
    private final Runnable backAction;

    private TableView<Item> tableInventory;
    private TableView<ShopItem> tableShop;

    private VBox root;

    @Override
    public String getName() {
        return "ShopScreen";
    }

    @Override
    public Parent getView() {
        if (root != null) {
            return root;
        }

        root = new VBox(10);
        root.setPadding(new Insets(20));

        HBox box = getHBox(backAction);

        root.getChildren().addAll(box, doubleTable(), doubleSelect());

        Timeline timeline2 = new Timeline(
            new KeyFrame(Duration.minutes(5), e -> refreshTable())
        );
        timeline2.setCycleCount(Timeline.INDEFINITE);
        timeline2.play();

        return root;
    }

    private HBox getHBox(Runnable backAction) {
        Button backButton = new Button("Назад в игру");
        backButton.setOnAction(e -> backAction.run());

        Label label = new Label();
        Timeline timeline1 = new Timeline(
            new KeyFrame(Duration.seconds(0.5), e ->
                label.setText("GOlD: " + playerService.getPlayer().getGold())
            )
        );
        timeline1.setCycleCount(Timeline.INDEFINITE);
        timeline1.play();

        return new HBox(100, backButton, label);
    }

    private TableView createTableShop() {
        tableShop = new TableView<>();
        tableShop.setPrefSize(520, 268);

        TableColumn<ShopItem, String> nameColumn = getItemStringTableColumn();


        TableColumn<ShopItem, String> typeItemColumn = new TableColumn<>("Type Item");
        typeItemColumn.setCellValueFactory(column ->
            new SimpleStringProperty(column.getValue().getTypeItem().toString())
        );

        TableColumn<ShopItem, String> rarityColumn = new TableColumn<>("Rarity");
        rarityColumn.setCellValueFactory(column ->
            new SimpleStringProperty(column.getValue().getRarity().toString())
        );

        TableColumn<ShopItem, Integer> priceColumn = new TableColumn<>("Price");
        priceColumn.setCellValueFactory(column ->
            new SimpleIntegerProperty(column.getValue().getPrice()).asObject()
        );

        tableShop.getColumns().addAll(nameColumn, typeItemColumn, rarityColumn, priceColumn);
        tableShop.setItems(shopService.getCurrentItems());
        return tableShop;
    }

    private TableView<Item> createInventoryTable() {
        tableInventory = new TableView<>();
        tableInventory.setPrefSize(360, 268);

        TableColumn<Item, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(column ->
            new SimpleStringProperty(column.getValue().getName())
        );

        TableColumn<Item, String> typeItemColumn = new TableColumn<>("Type Item");
        typeItemColumn.setCellValueFactory(column ->
            new SimpleStringProperty(column.getValue().getTypeItem().toString())
        );

        TableColumn<Item, String> rarityColumn = new TableColumn<>("Rarity");
        rarityColumn.setCellValueFactory(column ->
            new SimpleStringProperty(column.getValue().getRarity().toString())
        );

        TableColumn<Item, Integer> priceColumn = new TableColumn<>("Price");
        priceColumn.setCellValueFactory(column ->
            new SimpleIntegerProperty(column.getValue().getPrice()).asObject()
        );

        tableInventory.getColumns().addAll(nameColumn, typeItemColumn, rarityColumn, priceColumn);
        tableInventory.setItems(inventory.getItems());
        return tableInventory;
    }

    private HBox doubleTable() {
        TableView<ShopItem> tableLeft = createTableShop();
        TableView<Item> tableRight = createInventoryTable();
        return new HBox(50, tableLeft, tableRight);
    }

    private HBox createShopSelectionBox() {
        Label selectedItem = new Label("Selected Shop Item: ");
        Button buyBtn = new Button("Buy");
        buyBtn.setDisable(true);

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        tableShop.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                selectedItem.setText("Selected Shop Item: " + newSel.getName() + " (" + newSel.getPrice() + ")");
                buyBtn.setDisable(false);
            } else {
                selectedItem.setText("Selected Shop Item: ");
                buyBtn.setDisable(true);
            }
        });

        buyBtn.setOnAction(e -> {
            ShopItem selected = tableShop.getSelectionModel().getSelectedItem();
            if (selected != null) {
                playerService.buyItem(selected.getItem(), selected.getPrice());

            }
        });

        return new HBox(10, selectedItem, spacer, buyBtn);
    }

    private HBox createInventorySelectionBox() {
        Label selectedItem = new Label("Selected Inventory Item: ");
        Button sellBtn = new Button("Sell");
        sellBtn.setDisable(true);

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        tableInventory.getSelectionModel().selectedItemProperty().addListener((obs, oldItem, selItem) -> {
            if (selItem != null){
                selectedItem.setText("Selected Inventory Item: " + selItem.getName() + " (" + selItem.getPrice() + ")");
                sellBtn.setDisable(false);
            }else {
                selectedItem.setText("Selected Inventory Item: ");
                sellBtn.setDisable(true);
            }

            sellBtn.setOnAction(e -> {
                Item selected = tableInventory.getSelectionModel().getSelectedItem();
                if (selected != null){
                    playerService.sellItem(selected, selected.getPrice());
                }
            });
        });
        return new HBox(10, selectedItem, spacer, sellBtn);
    }

    private HBox doubleSelect(){
        return new HBox(150, createShopSelectionBox(), createInventorySelectionBox());
    }

    public void refreshTable() {
        tableShop.getItems().setAll(shopService.getCurrentItems());
    }

    private static TableColumn<ShopItem, String> getItemStringTableColumn() {
        TableColumn<ShopItem, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(column -> new SimpleStringProperty(column.getValue().getName()));
        nameColumn.setCellFactory(tc-> new TableCell<>() {
            @Override
            protected void updateItem(String item, boolean empty) {
                super.updateItem(item, empty);
                if (empty || item == null) {
                    setText(null);
                    setTooltip(null);
                } else {
                    String line = item.split("\\R", 2)[0];
                    setText(line);

                    ShopItem shopItem = getTableRow().getItem();
                    if (shopItem != null) {
                        String tooltipText = shopItem.getName() + "\n" + shopItem.getDescription();
                        Tooltip tooltip = new Tooltip(tooltipText);
                        setTooltip(tooltip);
                    }
                }
            }
        });
        return nameColumn;
    }
}


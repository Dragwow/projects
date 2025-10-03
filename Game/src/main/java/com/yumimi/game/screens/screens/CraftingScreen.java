package com.yumimi.game.screens.screens;

import com.yumimi.game.models.craft.Recipe;
import com.yumimi.game.models.craft.RecipeRegistry;
import com.yumimi.game.models.inventory.Inventory;
import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.screens.Screen;
import com.yumimi.game.service.CraftingService;
import com.yumimi.game.util.enums.TypeItem;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class CraftingScreen extends VBox implements Screen {

    private final Inventory inventory;
    private final RecipeRegistry recipeRegistry;
    private final CraftingService craftingService;
    private final Runnable backAction;

    @Override
    public String getName() {
        return "CraftingScreen";
    }

    @Override
    public Parent getView() {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10));

        Button backButton = new Button("Назад в игру");
        backButton.setOnAction(e -> backAction.run());
        root.getChildren().addAll(backButton);

        ListView<Recipe> recipeList = new ListView<>();
        recipeList.getItems().addAll(recipeRegistry.getRecipes().values());
        recipeList.setPrefHeight(200);

        Button craftBnt = getButton(recipeList);

        root.getChildren().addAll(recipeList, getInventoryCraftItems(), craftBnt);
        return root;
    }

    private Button getButton(ListView<Recipe> recipeList) {
        Button craftBnt = new Button("Craft");
        craftBnt.setOnAction(e -> {
            Recipe selectedRecipe = recipeList.getSelectionModel().getSelectedItem();
            if (selectedRecipe == null) return;

            if (craftingService.canCraft(inventory, selectedRecipe)){
                Item crafted = craftingService.craft(inventory, selectedRecipe);
                System.out.println("Crafted item: " + crafted.getName());
            }else {
                System.out.println("Not enough items in inventory!");
            }
        });
        return craftBnt;
    }

    private TableView getInventoryCraftItems(){
        TableView<Item> inventoryTable = new TableView<>();
        inventoryTable.setPrefHeight(200);
        TableColumn<Item, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Item, String> rarityColumn = new TableColumn<>("Rarity");
        rarityColumn.setCellValueFactory(new PropertyValueFactory<>("rarity"));

        TableColumn<Item, Integer> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        inventoryTable.getColumns().addAll(nameColumn, rarityColumn, quantityColumn);

        ObservableList<Item> craftItems = inventory.getItems()
            .filtered(item -> item.getTypeItem() == TypeItem.Craft_item);

        inventoryTable.setItems(craftItems);
        return inventoryTable;
    }


}

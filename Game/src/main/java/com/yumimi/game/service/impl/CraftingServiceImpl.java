package com.yumimi.game.service.impl;

import com.yumimi.game.models.craft.Recipe;
import com.yumimi.game.models.inventory.Inventory;
import com.yumimi.game.models.inventory.items.Item;
import com.yumimi.game.models.inventory.items.ItemFactory;
import com.yumimi.game.service.CraftingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@AllArgsConstructor
public class CraftingServiceImpl implements CraftingService {

    public final ItemFactory itemFactory;

    @Override
    public boolean canCraft(Inventory inventory, Recipe recipe) {
        Map<String, Integer> required = new HashMap<>();
        for (String ingredients : recipe.ingredients()) {
            required.merge(ingredients, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : required.entrySet()) {
            String needed = entry.getKey();
            int requiredAmount = entry.getValue();

            int available = inventory.getItems().stream()
                .filter(item -> item.getName().equals(needed))
                .mapToInt(Item::getQuantity)
                .sum();

            if (available < requiredAmount) {
                return false;
            }
        }
        return true;

    }

    @Override
    public Item craft(Inventory inventory, Recipe recipe) {
        if (!canCraft(inventory, recipe)) {
            throw new IllegalStateException("Недостаточно ресурсов для крафта " + recipe.resultItemName());
        }

        for (String ingredients : recipe.ingredients()){
            inventory.removeItemByName(ingredients, 1);
        }

        Item result = itemFactory.createByName(recipe.resultItemName(), recipe.rarity());
        inventory.addItem(result);
        return result;
    }
}

package com.yumimi.game.screens.screens;

import com.yumimi.game.models.player.Player;
import com.yumimi.game.models.skill.Skill;
import com.yumimi.game.models.skill.SkillRegistry;
import com.yumimi.game.screens.Screen;
import com.yumimi.game.service.PlayerService;
import com.yumimi.game.service.SkillService;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.Region;
import javafx.scene.layout.VBox;
import javafx.util.Duration;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class SkillTreeScreen extends VBox implements Screen {

    private final SkillRegistry skillRegistry;
    private final PlayerService playerService;
    private final SkillService skillService;
    private final Runnable backAction;

    private VBox root;
    private ListView<Skill> skillList;
    private ListView<Skill> skillBookList;

    @Override
    public String getName() {
        return "SkillTreeScreen";
    }

    @Override
    public Parent getView() {
        root = new VBox(10);

        //HEAD
        root.getChildren().add(getHeader(backAction));

        //BODY
        getBody();

        //FOOT
        root.getChildren().add(getFooter());

        root.setPadding(new Insets(10));
        return root;
    }

    private HBox getHeader(Runnable backAction) {
        Button backButton = new Button("Назад");
        backButton.setOnAction(e -> backAction.run());

        Label label = new Label();
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(0.5), e ->
                label.setText("POINTS: " + playerService.getPlayer().getPoint())
            )
        );
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        return new HBox(100, backButton, label);
    }

    private void getBody() {
        skillList = new ListView<>();
        skillList.getItems().addAll(skillRegistry.getAllSkills());
        skillList.setPrefHeight(150);

        skillBookList = new ListView<>();
        Timeline timeline = new Timeline(
            new KeyFrame(Duration.seconds(2), e -> {
                skillBookList.getItems().setAll(playerService.getPlayer().getSkillBook().getSkills());
            })
        );


        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
        skillBookList.setPrefHeight(150);
        root.getChildren().addAll(skillList, skillBookList);
    }

    private HBox getFooter() {
        return new HBox(100, selectingSkill(), buyingSkill());
    }

    private HBox buyingSkill() {
        Label selectedSkill = new Label("Selected Skill Item:");
        Button buyBtn = new Button("Buy skill");

        Region spacer = new Region();
        HBox.setHgrow(spacer, Priority.ALWAYS);

        skillList.getSelectionModel().selectedItemProperty().addListener((obs, oldSel, newSel) -> {
            if (newSel != null) {
                selectedSkill.setText("Selected Skill Item: " + newSel.getName() + " (" + newSel.getPoint() + ")");
                buyBtn.setDisable(false);
            } else {
                selectedSkill.setText("Selected Skill Item: ");
                buyBtn.setDisable(true);
            }
        });

        buyBtn.setOnAction(e -> {
            Skill selected = skillList.getSelectionModel().getSelectedItem();
            if (selected != null) {
                playerService.getPlayer().getSkillBook().addSkill(playerService.getPlayer(), selected);

            }
        });
        return new HBox(50, selectedSkill, spacer, buyBtn);
    }

    private VBox selectingSkill() {
        ListView<Skill> skillEquipped = new ListView<>();

        updateSlots(skillEquipped);

        skillBookList.setOnMouseClicked(e -> {
            Skill selected = skillBookList.getSelectionModel().getSelectedItem();
            if (selected != null) {
                skillService.equipSkill(selected);
                updateSlots(skillEquipped);
            }
        });

        skillEquipped.setOnMouseClicked(e -> {
            Skill selected = skillEquipped.getSelectionModel().getSelectedItem();
            if (selected != null) {
                skillService.unequipSkill(selected);
                updateSlots(skillEquipped);
            }

        });

        skillEquipped.setPrefHeight(98);
        return new VBox(skillEquipped);
    }

    private void updateSlots(ListView<Skill> listView) {
        Player player = playerService.getPlayer();

        ObservableList<Skill> skills = FXCollections.observableArrayList(
            player.getFirstSkillSlot(),
            player.getSecondSkillSlot(),
            player.getThirdSkillSlot(),
            player.getFourthSkillSlot()
        );

        listView.setCellFactory(lv -> new ListCell<>() {
            @Override
            protected void updateItem(Skill skill, boolean empty) {
                super.updateItem(skill, empty);
                if (empty || skill == null) {
                    setText(" Empty slot");
                } else setText(" | " + skill.getName() + " | " + skill.getRarity() + " | ");
            }
        });

        listView.setItems(skills);

    }
}

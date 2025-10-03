package com.yumimi.game.screens.screens;

import com.yumimi.game.battle.Battle;
import com.yumimi.game.models.enemy.Enemy;
import com.yumimi.game.models.player.Player;
import com.yumimi.game.models.skill.Skill;
import com.yumimi.game.screens.Screen;
import com.yumimi.game.service.EnemyService;
import com.yumimi.game.service.PlayerService;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FightScreen extends VBox implements Screen {

    private final PlayerService playerService;
    private final EnemyService enemyService;
    private final Runnable backAction;
    private final Runnable endFight;

    private final Label timerLabel = new Label();
    private ListView<Skill> playerSkills;
    private ListView<Skill> enemySkills;
    private Battle battle;
    private boolean playerTurn;
    private boolean battleFinished = false; // флаг окончания боя

    @Override
    public String getName() {
        return "FightScreen";
    }

    @Override
    public Parent getView() {
        VBox root = new VBox(10);
        root.setPadding(new Insets(20));

        Button backButton = new Button("Назад");
        backButton.setOnAction(e -> backAction.run());

        timerLabel.setStyle("-fx-font-size: 16; -fx-font-weight: bold;");
        timerLabel.setAlignment(Pos.CENTER);
        timerLabel.setMaxWidth(Double.MAX_VALUE);

        // Инициализация боя
        battle = new Battle(playerService.getPlayer(), enemyService.getEnemy(),
            playerService, enemyService);

        // Определяем, кто ходит первым
        playerTurn = Math.random() < 0.5;
        updateTurnLabel();

        setupPlayerSkills();
        setupEnemySkills();

        root.getChildren().addAll(
            backButton,
            timerLabel,
            getActions(),
            getCombatLog()
        );

        // Если ход врага с самого начала
        if (!playerTurn) {
            Platform.runLater(this::enemyTurn);
        }

        return root;
    }

    private void updateTurnLabel() {
        timerLabel.setText(playerTurn ? "Ход игрока" : "Ход врага");
    }

    private HBox getActions() {
        return new HBox(100,
            new HBox(10, getPlayerBar(), playerSkills),
            new HBox(10, enemySkills, getEnemyBar()));
    }

    private ListView<String> getPlayerBar() {
        ListView<String> playerBar = new ListView<>();
        playerBar.setMaxSize(180, 150);
        playerBar.setSelectionModel(null);
        playerBar.setItems(playerService.getPlayerBar());
        return playerBar;
    }

    private ListView<String> getEnemyBar() {
        ListView<String> enemyBar = new ListView<>();
        enemyBar.setMaxSize(180, 150);
        enemyBar.setSelectionModel(null);
        enemyBar.setItems(enemyService.getEnemyBar());
        return enemyBar;
    }

    private void setupPlayerSkills() {
        playerSkills = new ListView<>();
        playerSkills.setMaxHeight(98);
        updatePlayerSkillSlots();

        playerSkills.setOnMouseClicked(e -> {
            if (e.getClickCount() == 2 && playerTurn && !battleFinished) {
                Skill selected = playerSkills.getSelectionModel().getSelectedItem();
                if (selected != null) {
                    boolean over = battle.playerUseSkill(selected);
                    if (over) {
                        finishBattle();
                    } else {
                        endTurn();
                    }
                }
            }
        });
    }

    private void updatePlayerSkillSlots() {
        Player player = playerService.getPlayer();
        ObservableList<Skill> skills = FXCollections.observableArrayList(
            player.getFirstSkillSlot(),
            player.getSecondSkillSlot(),
            player.getThirdSkillSlot(),
            player.getFourthSkillSlot()
        );

        playerSkills.setCellFactory(lv -> new ListCell<>() {
            @Override
            protected void updateItem(Skill skill, boolean empty) {
                super.updateItem(skill, empty);
                if (empty || skill == null) {
                    setText(" Empty slot");
                } else {
                    setText(" | " + skill.getName() + " | " + skill.getRarity() + " | ");
                }
            }
        });
        playerSkills.setItems(skills);
    }

    private void setupEnemySkills() {
        enemySkills = new ListView<>();
        enemySkills.setMaxHeight(98);
        enemySkills.setSelectionModel(null);
        updateEnemySkillSlots();
    }

    private void updateEnemySkillSlots() {
        Enemy enemy = enemyService.getEnemy();
        ObservableList<Skill> skills = FXCollections.observableArrayList(
            enemy.getFirstSkillSlot(),
            enemy.getSecondSkillSlot(),
            enemy.getThirdSkillSlot(),
            enemy.getFourthSkillSlot()
        );

        enemySkills.setCellFactory(lv -> new ListCell<>() {
            @Override
            protected void updateItem(Skill skill, boolean empty) {
                super.updateItem(skill, empty);
                if (empty || skill == null) {
                    setText(" Empty slot");
                } else {
                    setText(" | " + skill.getName() + " | " + skill.getRarity() + " | ");
                }
            }
        });
        enemySkills.setItems(skills);
    }

    private ListView<String> getCombatLog() {
        ListView<String> combatLog = new ListView<>();
        combatLog.setItems(battle.getCombatLog().getLog());
        combatLog.setSelectionModel(null);
        combatLog.setMaxHeight(300);
        combatLog.setPadding(new Insets(10));
        return combatLog;
    }

    private void endTurn() {
        if (battleFinished) return;

        playerTurn = !playerTurn;
        updateTurnLabel();
        playerSkills.setDisable(!playerTurn);

        if (!playerTurn) {
            Platform.runLater(this::enemyTurn);
        }
    }

    private void enemyTurn() {
        if (battleFinished) return;

        boolean over = battle.enemyUseSkill();
        if (over) {
            finishBattle();
        } else {
            playerTurn = true;
            updateTurnLabel();
            playerSkills.setDisable(false);
        }
    }

    private void finishBattle() {
        if (!battleFinished) {
            battleFinished = true;
            playerSkills.setDisable(true);
            endFight.run();
        }
    }
}

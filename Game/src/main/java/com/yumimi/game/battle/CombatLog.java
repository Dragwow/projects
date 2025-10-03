package com.yumimi.game.battle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import lombok.Getter;

@Getter
public class CombatLog {

    private final ObservableList<String> log = FXCollections.observableArrayList();

    public void add(String message){
        log.add(message);
    }

    public void clear(){
        log.clear();
    }
}

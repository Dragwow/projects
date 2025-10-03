package com.yumimi.game.service.impl;

import com.yumimi.game.screens.screens.MenuScreen;
import com.yumimi.game.service.GameScreenService;
import javafx.scene.layout.VBox;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;



@Service
@AllArgsConstructor
public class GameScreenServiceImpl implements GameScreenService {

    private final MenuScreen menuScreen;

    @Override
    public VBox getMainMenu() {
        return menuScreen;
    }
}

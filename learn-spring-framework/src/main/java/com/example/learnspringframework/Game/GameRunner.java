package com.example.learnspringframework.Game;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component // this is used to create a bean of this class by the spring
public class GameRunner {

    @Autowired
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}

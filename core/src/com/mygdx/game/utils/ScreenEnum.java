package com.mygdx.game.utils;

import com.mygdx.game.screen.Juego;
import com.mygdx.game.screen.LevelSelectScreen;
import com.mygdx.game.screen.AbstractScreen;
import com.mygdx.game.screen.MainMenuScreen;

public enum ScreenEnum
{
    MAIN_MENU
            {
                public AbstractScreen getScreen(Object... params)
                {
                    return new MainMenuScreen();
                }
            },
    
    LEVEL_SELECT
            {
                public AbstractScreen getScreen(Object... params)
                {
                    return new LevelSelectScreen();
                }
            },
    
    GAME_SCREEN
            {
                public AbstractScreen getScreen(Object... params)
                {
                    return new Juego((Integer) params[0]); // GAMESCREEN EN EL OTRO PROYECTO
                }
            };
    
    public abstract AbstractScreen getScreen(Object... params);
}

package com.mygdx.game.utils;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Screen;
import com.mygdx.game.screen.AbstractScreen;

public class ScreenManager
{

    // Singleton
    private static ScreenManager instance;
    
    // Referencia al juego
    private Game game;
    
    private ScreenManager()
    {
        super();
    }
    
    // Coger instancia del singleton
    public static ScreenManager getInstance()
    {
        if(instance == null)
        {
            instance = new ScreenManager();
        }
        return instance;
    }
    
    public void initialize(Game game)
    {
        this.game = game;
    }
    
    public void showScreen(ScreenEnum screenEnum, Object... params)
    {
        // Coger la screen actual
        Screen currentScreen = game.getScreen();
    
        // Mostrar pantalla actual
        AbstractScreen newScreen = screenEnum.getScreen(params);
        newScreen.buildStage();
        game.setScreen(newScreen);
    
        // Borrar pantalla anterior
        if (currentScreen != null) {
            currentScreen.dispose();
        }
    }

}

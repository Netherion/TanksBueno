package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;

public class Pausa
{
    // LA IDEA ES QUE PAUSA SERA UN POPUP
    
    Table tabla;
    TextButton resume;
    TextButton options;
    TextButton exit;
    
    public Skin getSkin()
    {
        FileHandle skinFile = Gdx.files.internal("uiskin.json");
        Skin skin = new Skin(skinFile);
        return skin;
    }
    
    
    public void create()
    {
        tabla = new Table(getSkin());
        
        
        
        
        
        
        
        
        
        
        
    }
    
    
}

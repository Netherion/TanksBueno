package com.mygdx.game;


import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Juego
{
    public Skin getSkin()
    {
        FileHandle skinFile = Gdx.files.internal("uiskin.json");
        Skin skin = new Skin(skinFile);
        return skin;
    }
}

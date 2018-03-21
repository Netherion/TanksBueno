package com.mygdx.game;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class Login
{
    public Skin getSkin()
    {
        FileHandle skinFile = Gdx.files.internal("uiskin.json");
        Skin skin = new Skin(skinFile);
        return skin;
    }
}

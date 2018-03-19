package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.graphics.glutils.ShaderProgram;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.math.Affine2;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Button;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.scenes.scene2d.utils.Drawable;

import javax.xml.soap.Text;

public class Tanks extends ApplicationAdapter {

	private Skin skin;
	private Stage stage;
	private Table table;
	private SpriteBatch batch;
	private ShapeRenderer shape;

	public Skin getSkin()
	{
		FileHandle skinFile = Gdx.files.internal("uiskin.json");
		skin = new Skin(skinFile);

		return skin;
	}

	public void dibujarMain()
	{
		TextButton boton = new TextButton("boton 1", getSkin());

		TextButton boton2 = new TextButton("boton 2", skin);
		int h = Gdx.graphics.getHeight();
		int w = Gdx.graphics.getWidth();

		stage = new Stage();
		table = new Table(getSkin());

		table.setPosition(w / 2, h / 2 - 80);
		stage.addActor(table);


		Table tabla2 = new Table(getSkin());

		tabla2.setPosition(w/2, h - 20);


		table.add(boton);
		table.row();
		table.add(boton2).space(50,0,0,0);
	}
	
	@Override
	public void create () {

		dibujarMain();

	}
	public void resize (int width, int height) {

		stage.getViewport().update(width, height, true);
	}

	@Override
	public void render () {
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();
	}
	
	@Override
	public void dispose() {

		stage.dispose();

	}
}

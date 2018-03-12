package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.ui.TextButton;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;

public class Tanks extends ApplicationAdapter {

	Skin skin;
	private Stage stage;
	private Table table;
	private SpriteBatch batch;
	private ShapeRenderer shape;
	
	@Override
	public void create () {

		batch = new SpriteBatch();
		stage = new Stage();
		Gdx.input.setInputProcessor(stage);
		skin = new Skin();
		table = new Table();
		table.setFillParent(true);
		shape = new ShapeRenderer();


		stage.addActor(table);

		batch.begin();
		shape.setProjectionMatrix(batch.getProjectionMatrix());
		shape.setTransformMatrix(batch.getTransformMatrix());
		shape.begin(ShapeRenderer.ShapeType.Filled);
		shape.setColor(Color.BLUE);
		shape.rect(0, 0, 200	, 200);

		shape.end();
		batch.end();

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

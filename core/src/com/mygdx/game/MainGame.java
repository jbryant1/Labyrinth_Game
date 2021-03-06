package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.Classes.Tile;;

import java.util.ArrayList;
import java.util.List;

public class MainGame extends ApplicationAdapter {
    SpriteBatch batch;


    Stage stage;

	@Override
	public void create () {
        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
    }

    private void update() {
    }

    private void draw(){

    }

	@Override
	public void render () {
		Gdx.gl20.glClearColor(1, 0, 0, 1);
		Gdx.gl20.glClear(GL20.GL_COLOR_BUFFER_BIT);
		//batch.begin();
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
		//batch.draw(sprite, 0, 0);
		//batch.end();
	}
}

package com.mygdx.game.TestEnvironments;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.mygdx.game.Classes.Tile;

import java.util.ArrayList;
import java.util.List;

;

public class TileTest extends ApplicationAdapter {
    SpriteBatch batch;

    List<Tile> tiles;
    Tile tile;
    Tile tile2;
    Tile tile3;
    Tile tile4;

    Stage stage;

	@Override
	public void create () {

        tiles = new ArrayList<Tile>();
        tile = new Tile(batch, new Vector2(0,0), new Vector2(Gdx.graphics.getWidth() / 2 - 250, Gdx.graphics.getHeight() / 2 - 250));
        tile2 = new Tile(batch, new Vector2(0, Gdx.graphics.getHeight() - 250), new Vector2(Gdx.graphics.getWidth() / 2 - 250, Gdx.graphics.getHeight() / 2));
        tile3 = new Tile(batch, new Vector2(Gdx.graphics.getWidth() - 250, Gdx.graphics.getHeight() - 250), new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2));
        tile4 = new Tile(batch, new Vector2(Gdx.graphics.getWidth() - 250, 0), new Vector2(Gdx.graphics.getWidth() / 2, Gdx.graphics.getHeight() / 2 - 250));
        batch = new SpriteBatch();

        stage = new Stage();
        Gdx.input.setInputProcessor(stage);
        //tile.setTouchable(Touchable.enabled);

        stage.addActor(tile);
        stage.addActor(tile2);
        stage.addActor(tile3);
        stage.addActor(tile4);


       // tiles.add(new Tile(batch, new Vector2(0, 0)));
       // tiles.add(new Tile(batch, new Vector2(0, Gdx.graphics.getHeight() - 175f)));
       // tiles.add(new Tile(batch, new Vector2(Gdx.graphics.getWidth() - 175f, Gdx.graphics.getHeight() - 175f)));
       // tiles.add(new Tile(batch, new Vector2(Gdx.graphics.getWidth() - 175f, 0)));
    }

    private void update(){
        for(Tile g: tiles){
            //g.update();
        }


        //tile.act(Gdx.graphics.getDeltaTime());
        //tile.update();
    }

    private void draw(){
        for(Tile go: tiles){
            //go.draw(batch, 1f);
        }
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

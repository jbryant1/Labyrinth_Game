package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Batch;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.Action;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.InputListener;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.actions.MoveToAction;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Iterator;

/**
 * Hello
 * Created by Josh on 2/2/2015.
 */
public class Tile extends Actor{

    private Texture img;
    private Sprite sprite;
    private SpriteBatch spriteBatch;
    private float startX, startY, endX, endY;

    private final static float IMAGE_SIZE = 175f;
    private static float speed = 150f;
    float elapsed = 0.01f;

    private Integer windowWidth = Gdx.graphics.getWidth();
    private Integer windowHeight = Gdx.graphics.getHeight();

    float distance;
    float directionX;
    float directionY;

    public Boolean started = false;

    private Boolean isMoving = true;
    Vector2 position;

    public Tile(SpriteBatch spriteBatch, Vector2 position, Vector2 destination){
        img = new Texture("core/assets/badlogic.jpg");
        sprite = new Sprite(img);
        this.spriteBatch = spriteBatch;
        startX = position.x;
        startY = position.y;

        endX = destination.x;
        endY = destination.y;

        this.position = position;
        setBounds(startX,startY,img.getWidth(),img.getHeight());

        addAction(Actions.moveTo(endX, endY, 1));
    }

    @Override
    public void act(float delta){
        super.act(delta);
    }


    @Override
    public void draw(Batch batch, float alpha) {
        batch.draw(img, this.getX(), this.getY(), this.getOriginX(),
                this.getOriginY(), this.getWidth(), this.getHeight(),
                this.getScaleX(), this.getScaleY(), this.getRotation(), 0, 0,
                img.getWidth(), img.getHeight(), false, false);
    }
}

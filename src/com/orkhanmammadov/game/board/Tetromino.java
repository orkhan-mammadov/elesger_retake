package com.orkhanmammadov.game.board;

import java.util.ArrayList;

public abstract class Tetromino implements Rotatable{

    protected ColoredPoint[] points;

    public Tetromino(ColoredPoint[] points) {
        this.points = points;
    }

    public ColoredPoint[] getPosition() {
        return points;
    }

    public void updatePosition(ColoredPoint[] points) {
        this.points = points;
    }

    public ColoredPoint[] offset(int deltaX, int deltaY){

        return null;
    }
}

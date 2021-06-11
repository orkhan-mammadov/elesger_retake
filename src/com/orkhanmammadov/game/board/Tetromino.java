package com.orkhanmammadov.game.board;

import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Tetromino implements Rotatable{

    private ColoredPoint[] points;

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
        ColoredPoint[] offsetPoints = points;
        for(int i =0; i<points.length; i++){
            offsetPoints[i] = points[i].offsetXY(points[i].getColor(),points[i].point.offsetXY(deltaX,deltaY));
        }
        return offsetPoints;
    }

    public ColoredPoint[] rotateClockwise(){
        ColoredPoint[] rotatedPoints = points;

        int minx=points[0].getX(),maxx=points[0].getX(),miny=points[0].getY();
        for(int i=0; i < points.length; i++){
            if(points[i].getX()<minx)
                minx=points[i].getX();
            if(points[i].getX()>maxx)
                maxx=points[i].getX();
            if(points[i].getY()<miny)
                miny=points[i].getY();
        }

        for(int i = 0; i<points.length; i++){
            int oldx = points[i].getX();
            int oldy = points[i].getY();

            int newx= oldy - miny + minx;
            int newy= miny +maxx - oldx;
            rotatedPoints[i]= new ColoredPoint(points[i].getColor(),new Point(newx,newy));

        }
        return rotatedPoints;
    }


}

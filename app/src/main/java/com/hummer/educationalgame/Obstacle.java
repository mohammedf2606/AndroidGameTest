package com.hummer.educationalgame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;

public class Obstacle implements GameObject {

    private Rect rectangle;
    private int colour;

    public Obstacle(Rect rectangle, int colour) {
        this.rectangle = rectangle;
        this.colour = colour;
    }

    public boolean playerCollide(RectPlayer player) {
        Rect playerRect = player.getRectangle();
        return rectangle.contains(playerRect.left, playerRect.top)
                || rectangle.contains(playerRect.right, playerRect.top)
                || rectangle.contains(playerRect.left, playerRect.bottom)
                || rectangle.contains(playerRect.right, playerRect.bottom);
    }

    @Override
    public void draw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(colour);
        canvas.drawRect(rectangle, paint);
    }

    @Override
    public void update() {

    }
}

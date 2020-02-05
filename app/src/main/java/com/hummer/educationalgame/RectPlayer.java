package com.hummer.educationalgame;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;

public class RectPlayer implements GameObject {

    private Rect rectangle;
    private int colour;

    public RectPlayer(Rect rectangle, int colour) {
        this.rectangle = rectangle;
        this.colour = colour;
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

    public void update(Point point) {
        rectangle.set(point.x - rectangle.width()/2, point.y - rectangle.height()/2,
                point.x + rectangle.width()/2, point.y + rectangle.height()/2);
    }

    public Rect getRectangle() { return rectangle; }

}

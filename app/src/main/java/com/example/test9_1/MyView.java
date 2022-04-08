package com.example.test9_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class MyView extends View {
    public MyView(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas){
        Paint paint = new Paint();
        canvas.drawColor(Color.GREEN);
        paint.setColor(Color.RED);
        paint.setStrokeWidth(3);
        paint.setAntiAlias(true);

        RectF rect = new RectF(40,10,300,270);
        canvas.drawArc(rect,10,280,false,paint);
        super.onDraw(canvas);
    }
}
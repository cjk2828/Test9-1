package com.example.test9_1;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;

public class MyView2 extends View {
    public MyView2(Context context, AttributeSet attrs){
        super(context, attrs);
    }

    @Override
    protected void onDraw(Canvas canvas){
        super.onDraw(canvas);
        Paint paint = new Paint();
        paint.setColor(Color.GREEN);
        canvas.drawColor(Color.YELLOW);
        canvas.drawLine(10,50,100,50,paint);
        Rect rect = new Rect(10,70,100,120);
        canvas.drawRect(rect,paint);
        canvas.drawRoundRect(new RectF(120,70,160,120),10,10,paint);
        canvas.drawText("헬로우 안드로이드",10,140,paint);
        canvas.drawCircle(40,180,30,paint);

        float[] pts = {10,220,70,230,70,230,20,270};
        canvas.drawLines(pts,paint);
    }
}
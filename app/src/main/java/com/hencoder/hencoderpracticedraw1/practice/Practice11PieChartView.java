package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice11PieChartView extends View {

    private Paint mPaint;
    private RectF mRedRectF;
    private RectF mRectF;

    public Practice11PieChartView(Context context) {
        super(context);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice11PieChartView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setTextSize(28f);

        mRedRectF = new RectF(150f, 30f, 700f, 580f);
        mRectF = new RectF(165f, 50f, 715f, 600f);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画饼图
        drawArc(canvas);
        drawLines(canvas);
        drawText(canvas);
    }

    private void drawArc(Canvas canvas) {
        mPaint.setColor(Color.YELLOW);
        canvas.drawArc(mRectF, -60f, 58f, true, mPaint);

        mPaint.setColor(Color.CYAN);
        canvas.drawArc(mRectF, -1f, 3f, true, mPaint);

        mPaint.setColor(Color.MAGENTA);
        canvas.drawArc(mRectF, 3f, 10f, true, mPaint);

        mPaint.setColor(Color.LTGRAY);
        canvas.drawArc(mRectF, 14f, 5f, true, mPaint);

        mPaint.setColor(Color.GREEN);
        canvas.drawArc(mRectF, 20f, 55f, true, mPaint);

        mPaint.setColor(Color.BLUE);
        canvas.drawArc(mRectF, 77f, 93f, true, mPaint);

        mPaint.setColor(Color.RED);
        canvas.drawArc(mRedRectF, -190, 130f, true, mPaint);
    }

    private void drawLines(Canvas canvas) {
        mPaint.setColor(Color.LTGRAY);
        mPaint.setStrokeWidth(3f);

        canvas.drawLine(120f, 55f, 265f, 55f, mPaint);
        canvas.drawLine(265f, 55f, 276f, 75f, mPaint);

        canvas.drawLine(698f, 225f, 735f, 200f, mPaint);
        canvas.drawLine(735f, 200f, 840f, 200f, mPaint);

        canvas.drawLine(715f, 328f, 830f, 328f, mPaint);

        canvas.drawLine(713f, 365f, 760f, 365f, mPaint);
        canvas.drawLine(760f, 365f, 780f, 385f, mPaint);
        canvas.drawLine(780f, 385f, 830f, 385f, mPaint);

        canvas.drawLine(705f, 405f, 760f, 405f, mPaint);
        canvas.drawLine(760f, 405f, 780f, 425f, mPaint);
        canvas.drawLine(780f, 425f, 830f, 425f, mPaint);

        canvas.drawLine(665f, 480f, 700f, 515f, mPaint);
        canvas.drawLine(700f, 515f, 830f, 515f, mPaint);

        canvas.drawLine(130f, 555f, 230f, 555f, mPaint);
        canvas.drawLine(230f, 555f, 257f, 533f, mPaint);
    }

    private void drawText(Canvas canvas) {
        mPaint.setColor(Color.WHITE);

        canvas.drawText("Lollipop", 5f, 55f, mPaint);
        canvas.drawText("Marshmallow", 840f, 200f, mPaint);
        canvas.drawText("Froyo", 840f, 328f, mPaint);
        canvas.drawText("Gingerbread", 840f, 385f, mPaint);
        canvas.drawText("Ice Cream Sandwich", 840f, 425f, mPaint);
        canvas.drawText("Jelly Bean", 840f, 515f, mPaint);
        canvas.drawText("KitKat", 30f, 555f, mPaint);
    }
}

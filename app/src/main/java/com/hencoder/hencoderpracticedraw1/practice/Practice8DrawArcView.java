package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice8DrawArcView extends View {

    private Paint mPaint;
    private RectF mRectF;

    public Practice8DrawArcView(Context context) {
        super(context);
        init();
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice8DrawArcView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setColor(Color.BLACK);

        mRectF = new RectF(310, 250, 750, 530);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        练习内容：使用 canvas.drawArc() 方法画弧形和扇形

        mPaint.setStyle(Paint.Style.STROKE);
        canvas.drawArc(mRectF, 180f, 60f, false, mPaint);

        mPaint.setStyle(Paint.Style.FILL);
        canvas.drawArc(mRectF, -110f, 100f, true, mPaint);
        canvas.drawArc(mRectF, 20f, 140f, false, mPaint);
    }
}

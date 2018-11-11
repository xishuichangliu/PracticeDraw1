package com.hencoder.hencoderpracticedraw1.practice;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class Practice10HistogramView extends View {

    private float mStartX;
    private float mEndX;
    private float mStartY;
    private float mEndY;
    private float mTabWidth;
    private float mDrawTextY;
    private float mColumnWidth;
    private Paint mPaint;
    private String[] mTabs = {"Froyo", "GB", "ICS", "JB", "KitKat", "L", "M"};
    private float[] mHeights = {10f, 30f, 40f, 200f, 300f, 450f, 180f};


    public Practice10HistogramView(Context context) {
        super(context);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public Practice10HistogramView(Context context, @Nullable AttributeSet attrs,
            int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();
    }

    private void init() {
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG);
        mPaint.setStyle(Paint.Style.FILL);
        mPaint.setStrokeWidth(2f);
        mPaint.setTextSize(28f);

        mTabWidth = 125f;

        mStartX = 120f;
        mEndX = 1000f;
        mStartY = 50f;
        mEndY = 600f;
        mDrawTextY = mEndY + 30f;
        mColumnWidth = mTabWidth * 0.8f;

        if (mTabs != null && mTabs.length > 0) {
            mTabWidth = (mEndX - mStartX) / mTabs.length - 10f;
        }
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

//        综合练习
//        练习内容：使用各种 Canvas.drawXXX() 方法画直方图
        float offsetX;
        float drawX;
        for (int i = 0; i < mHeights.length; i++) {
            mPaint.setColor(Color.GREEN);
            offsetX = mTabWidth * 0.1f;
            drawX = mStartX + mTabWidth * i + offsetX;
            canvas.drawRect(drawX, (mEndY - mHeights[i]), drawX + mColumnWidth, mEndY, mPaint);

            mPaint.setColor(Color.WHITE);
            offsetX = (mTabWidth - mPaint.measureText(mTabs[i])) / 2;
            drawX = mStartX + mTabWidth * i + offsetX;
            canvas.drawText(mTabs[i], drawX, mDrawTextY, mPaint);
        }
        canvas.drawLine(mStartX, mStartY, mStartX, mEndY, mPaint);
        canvas.drawLine(mStartX, mEndY, mEndX, mEndY, mPaint);
    }
}

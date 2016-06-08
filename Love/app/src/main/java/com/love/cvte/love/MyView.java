package com.love.cvte.love;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by CVTE on 2015/11/13.
 */
public class MyView extends View {
    private float X = 100;
    private float Y = 100;

    public float getReizeX() {
        return reizeX;
    }

    public float getResizaY() {
        return resizaY;
    }

    public void setReizeX(float reizeX) {

        this.reizeX = reizeX;
    }

    public void setResizaY(float resizaY) {
        this.resizaY = resizaY;
    }

    private float reizeX = 1;
    private float resizaY = 1;
    public MyView(Context context)
    {
        super(context);
    }

    @Override
    public float getY() {
        return Y;
    }

    @Override
    public float getX() {
        return X;
    }

    @Override
    public void setX(float x) {
        X = x;
    }

    @Override
    public void setY(float y) {
        Y = y;
    }
    private int ImageIndex = 0;

    public void setImageIndex(int imageIndex) {
        ImageIndex = imageIndex;
    }

    public int getImageIndex() {

        return ImageIndex;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint = new Paint();
        Bitmap bmp;
        switch (ImageIndex)
        {
            case 0:
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.heart1);
                break;
            case 1:
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.heart2);
                break;
            case 2:
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.heart3);
                break;
            case 3:
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.heart4);
                break;
            case 4:
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.love53);
                break;
            default:
                bmp = BitmapFactory.decodeResource(getResources(),R.drawable.heart1);
                break;
        }
        Matrix matrix = new Matrix();
        matrix.postScale(reizeX,resizaY);
        Bitmap resizeBmp = Bitmap.createBitmap(bmp,0,0,bmp.getWidth(),bmp.getHeight(),matrix,true);
        canvas.drawBitmap(resizeBmp,X-resizeBmp.getWidth()/2,Y-resizeBmp.getHeight()/2,paint);
    }
}

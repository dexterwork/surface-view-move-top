package studio.example.dexter.surfaceviewtest;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

/**
 * Created by dexter on 2015/4/16.
 */
public class FrameSurface extends SurfaceView implements SurfaceHolder.Callback {


    public FrameSurface(Context context) {
        super(context);
        getHolder().addCallback(this);
//        setZOrderOnTop(true);
        //把 surface view 的背景變透明
//        getHolder().setFormat(PixelFormat.TRANSLUCENT);
    }

    @Override
    public void draw(Canvas canvas) {
        try {
            canvas = getHolder().lockCanvas(null);
            synchronized (getHolder()) {
                Paint paint = new Paint();
                paint.setColor(Color.rgb(200, 200, 200));
                canvas.drawRect(0, 0, 200, 200, paint);
            }
        } catch (Exception e) {
        } finally {
            if (canvas != null) getHolder().unlockCanvasAndPost(canvas);
        }
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        draw(null);
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}

package studio.example.dexter.surfaceviewtest;

import android.view.MotionEvent;
import android.view.View;

/**
 * Created by dexter on 2015/4/15.
 */
public class MTouch implements View.OnTouchListener {


    float touchX, touchY;

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                this.touchX = event.getX();
                this.touchY = event.getY();
                v.bringToFront();
                ((View)v.getParent()).invalidate();
                return true;
            case MotionEvent.ACTION_MOVE:
                v.setX(v.getX() + event.getX() - touchX);
                v.setY(v.getY() + event.getY() - touchY);
                return true;
        }
        return false;
    }
}

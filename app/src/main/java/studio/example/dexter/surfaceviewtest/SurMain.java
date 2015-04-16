package studio.example.dexter.surfaceviewtest;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;

/**
 * Created by dexter on 2015/4/15.
 */
public class SurMain extends RelativeLayout  {
    TextView tv;

    public SurMain(Context context) {
        super(context);
        this.setOnTouchListener(new MTouch());
        bringToFront();
    }

    public SurMain(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.setOnTouchListener(new MTouch());
        bringToFront();
    }




}

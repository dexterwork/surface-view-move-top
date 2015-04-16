package studio.example.dexter.surfaceviewtest;

import android.graphics.Color;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment implements View.OnClickListener {
    RelativeLayout layout;
    Button btnAddR, btnAddG, btnAddB;
    ArrayList<RelativeLayout> surMains;

    public MainActivityFragment() {
        surMains = new ArrayList<RelativeLayout>();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);
        layout = (RelativeLayout) view.findViewById(R.id.layout);
        btnAddR = (Button) layout.findViewById(R.id.btnAddR);
        btnAddR.setOnClickListener(this);
        btnAddG = (Button) layout.findViewById(R.id.btnAddG);
        btnAddG.setOnClickListener(this);
        btnAddB = (Button) layout.findViewById(R.id.btnAddB);
        btnAddB.setOnClickListener(this);

        return view;
    }


    public void addNewSprite(int color) {
        RelativeLayout surMain = (RelativeLayout) getActivity().getLayoutInflater().inflate(R.layout.fuck_layout, null);
        surMain.setBackgroundColor(color);
        surMain.setOnTouchListener(new MTouch());
        surMains.add(surMain);
        layout.addView(surMain);

        TextView tv = (TextView) surMain.findViewById(R.id.tv);
        tv.setText(String.valueOf(surMains.size()));

        FrameLayout frameLayout = (FrameLayout) surMain.findViewById(R.id.frameSurface);
        frameLayout.addView(new FrameSurface(getActivity()));


    }

    @Override
    public void onClick(View v) {
        MLog.d(this, "on click");
        switch (v.getId()) {
            case R.id.btnAddR:
                addNewSprite(Color.RED);
                break;
            case R.id.btnAddG:
                addNewSprite(Color.GREEN);
                break;
            case R.id.btnAddB:
                addNewSprite(Color.BLUE);
                break;
        }
    }


}

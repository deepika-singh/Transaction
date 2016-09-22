package com.example.deepika_singh.transaction;

import android.app.Activity;
import android.os.Bundle;
//import android.util.DisplayMetrics;

/**
 * Created by deepika_singh on 9/22/2016.
 */
public class tap extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tapwindow);

        //DisplayMetrics dm = new DisplayMetrics();
        //getWindowManager().getDefaultDisplay().getMetrics(dm);

        //int width = dm.widthPixels;
        //int height = dm.heightPixels;
        //getWindow().setLayout((int) (width * .99), (int) (height * .1));
    }

}

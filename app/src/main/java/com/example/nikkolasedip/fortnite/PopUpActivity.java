package com.example.nikkolasedip.fortnite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.ImageView;

public class PopUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pop_up);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.8),(int)(height*.6));

        ImageView imageView = (ImageView) findViewById(R.id.imageView4);
        Bundle bundle = getIntent().getExtras();
        if(bundle != null){
            int resid = bundle.getInt("resId");
            imageView.setImageResource(resid);
        }

    }

}

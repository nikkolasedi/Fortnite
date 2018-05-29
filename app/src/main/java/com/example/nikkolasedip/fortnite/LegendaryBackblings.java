package com.example.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class LegendaryBackblings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_legendary_backblings);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        final ImageButton imageButton1 = (ImageButton) findViewById(R.id.imageButton1);
        final ImageButton imageButton2 = (ImageButton) findViewById(R.id.imageButton2);
        final ImageButton imageButton3 = (ImageButton) findViewById(R.id.imageButton3);
        final ImageButton imageButton4 = (ImageButton) findViewById(R.id.imageButton4);
        final ImageButton imageButton5 = (ImageButton) findViewById(R.id.imageButton5);
        final ImageButton imageButton6 = (ImageButton) findViewById(R.id.imageButton6);
        final ImageButton imageButton7 = (ImageButton) findViewById(R.id.imageButton7);
        final ImageButton imageButton8 = (ImageButton) findViewById(R.id.imageButton8);
        final ImageButton imageButton9 = (ImageButton) findViewById(R.id.imageButton9);
        final ImageButton imageButton10 = (ImageButton) findViewById(R.id.imageButton10);
        final ImageButton imageButton11 = (ImageButton) findViewById(R.id.imageButton11);
        final ImageButton imageButton12 = (ImageButton) findViewById(R.id.imageButton12);
        final ImageButton imageButton13 = (ImageButton) findViewById(R.id.imageButton13);
        final ImageButton imageButton14 = (ImageButton) findViewById(R.id.imageButton14);

        click(imageButton1,"fortnite_back_bling_backup_plan_768x629");
        click(imageButton2,"fortnite_back_bling_black_shield_768x629");
        click(imageButton3,"fortnite_back_bling_cuddle_bow_768x629");
        click(imageButton4,"fortnite_back_bling_dark_matter_768x629");
        click(imageButton5,"fortnite_back_bling_fish_tank");
        click(imageButton6,"fortnite_back_bling_hatchling");
        click(imageButton7,"fortnite_back_bling_love_wings_768x629");
        click(imageButton8,"fortnite_back_bling_raptor_satchel_768x629");
        click(imageButton9,"fortnite_back_bling_red_shield_768x629");
        click(imageButton10,"fortnite_back_bling_scaly_768x629");
        click(imageButton11,"fortnite_back_dark_void");
        click(imageButton12,"fortnite_back_iron_cage");
        click(imageButton13,"fortnite_back_royale_flags");
        click(imageButton14,"fortnite_back_six_string");

    }
    public void click(final ImageButton imageButton, final String imageName){
        imageButton.setOnClickListener(new View.OnClickListener() {
                                           public void onClick(View v) {
                                               send(imageButton, imageName);
                                               //openAnotherActivity("PopUpActivity");

                                           }
                                       }
        );
    }
    public void send(View v, String imageName){
        int resID = getResources().getIdentifier(imageName, "drawable", getPackageName());

        Intent i = new Intent(LegendaryBackblings.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }
}

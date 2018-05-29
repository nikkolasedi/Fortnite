package com.example.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageButton;

public class EpicBackblings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_epic_backblings);
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
        final ImageButton imageButton15 = (ImageButton) findViewById(R.id.imageButton15);
        final ImageButton imageButton16 = (ImageButton) findViewById(R.id.imageButton16);
        final ImageButton imageButton17 = (ImageButton) findViewById(R.id.imageButton17);
        final ImageButton imageButton18 = (ImageButton) findViewById(R.id.imageButton18);
        final ImageButton imageButton19 = (ImageButton) findViewById(R.id.imageButton19);
        final ImageButton imageButton20 = (ImageButton) findViewById(R.id.imageButton20);
        final ImageButton imageButton21 = (ImageButton) findViewById(R.id.imageButton21);
        final ImageButton imageButton22 = (ImageButton) findViewById(R.id.imageButton22);

        click(imageButton1,"fortnite_back_bling_alpine_accessories");
        click(imageButton2,"fortnite_back_bling_alpine_accessories_can");
        click(imageButton3,"fortnite_back_bling_alpine_accessories_chn");
        click(imageButton4,"fortnite_back_bling_alpine_accessories_fra");
        click(imageButton5,"fortnite_back_bling_alpine_accessories_gbr");
        click(imageButton6,"fortnite_back_bling_alpine_accessories_ger");
        click(imageButton7,"fortnite_back_bling_alpine_kor");
        click(imageButton8,"fortnite_back_bling_alpine_usa");
        click(imageButton9,"fortnite_back_bling_astro");
        click(imageButton10,"fortnite_back_bling_brite_bag");
        click(imageButton11,"fortnite_back_bling_buckler");
        click(imageButton12,"fortnite_back_bling_contagion");
        click(imageButton13,"fortnite_back_bling_goodie_bag");
        click(imageButton14,"fortnite_back_bling_pathogen");
        click(imageButton15,"fortnite_back_bling_special_delivery");
        click(imageButton16,"fortnite_back_bling_steelcast_768x629");
        click(imageButton17,"fortnite_back_bling_tag_bag_1");
        click(imageButton18,"fortnite_back_bling_true_north");
        click(imageButton19,"fortnite_back_catalyst");
        click(imageButton20,"fortnite_back_eggshell");
        click(imageButton21,"fortnite_back_hardboiled");
        click(imageButton22,"fortnite_back_rust_bucket");



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

        Intent i = new Intent(EpicBackblings.this, PopUpActivity.class);

        i.putExtra("resId", resID);
        startActivity(i);
    }
}

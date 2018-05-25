package com.example.nikkolasedip.fortnite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Gliders extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gliders);

        //Creating Buttons
        Button btnCommonGliders = (Button) findViewById(R.id.btnCommonGliders);
        Button btnUncommonGliders = (Button) findViewById(R.id.btnUncommonGliders);
        Button btnRareGliders = (Button) findViewById(R.id.btnRareGliders);
        Button btnEpicGliders = (Button) findViewById(R.id.btnEpicGliders);
        Button btnLegendaryGliders = (Button) findViewById(R.id.btnLegendaryGliders);

        //Creating OnClickListener
        btnCommonGliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("CommonGliders");
            }
        });

        btnUncommonGliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("UncommonGliders");
            }
        });

        btnRareGliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("RareGliders");
            }
        });

        btnEpicGliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("EpicGliders");
            }
        });

        btnLegendaryGliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("LegendaryGliders");
            }
        });
    }

    public void openAnotherActivity(String activityName) {
        try {
            Class<?> activityClass = Class.forName("com.example.nikkolasedip.fortnite." + activityName);
            Intent intent = new Intent(this, activityClass);
            startActivity(intent);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

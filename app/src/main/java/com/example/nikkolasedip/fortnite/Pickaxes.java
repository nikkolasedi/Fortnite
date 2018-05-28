package com.example.nikkolasedip.fortnite;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Pickaxes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pickaxes);

        //Creating Buttons
        Button btnUncommonPickaxes = (Button) findViewById(R.id.btnUncommonPickaxes);
        Button btnRarePickaxes = (Button) findViewById(R.id.btnRarePickaxes);
        Button btnEpicPickaxes = (Button) findViewById(R.id.btnEpicPickaxes);

        //Creatin OnClickListener
        btnUncommonPickaxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("UncommonPickaxes");
            }
        });

        btnRarePickaxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("RarePickaxes");
            }
        });

        btnEpicPickaxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("EpicPickaxes");
            }
        });
    }

    public void openAnotherActivity(String activityName){
        try {
            Class<?> activityClass = Class.forName("com.example.nikkolasedip.fortnite."+activityName);
            Intent intent = new Intent(this, activityClass);
            startActivity(intent);
        } catch (ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }
}

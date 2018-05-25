package com.example.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Backblings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_backblings);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button btnRareBackblings = (Button) findViewById(R.id.btnRareBackblings);
        btnRareBackblings.setOnClickListener(new View.OnClickListener() {
                                       public void onClick(View v) {
                                           openAnotherActivity("RareBackblings");
                                       }
                                   }
        );
    }
    public void openAnotherActivity(String activityName){
        try {
            Class<?> activityClass = Class.forName("com.example.nikkolasedip.fortnite."+activityName);
            Intent intent = new Intent(this, activityClass);
            startActivity(intent);
        } catch (ClassNotFoundException e ) {
            e.printStackTrace();
        }
}}

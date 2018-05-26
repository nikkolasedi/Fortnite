package com.example.nikkolasedip.fortnite;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
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

        //Creating Buttons
        Button btnBackblings = (Button) findViewById(R.id.btnBackblings);
        Button btnGliders = (Button) findViewById(R.id.btnGliders);
        Button btnLoadingScreens = (Button) findViewById(R.id.btnLoadingScreens);
        Button btnPickaxes = (Button) findViewById(R.id.btnPickaxes);
        Button btnSkins = (Button) findViewById(R.id.btnSkins);
        Button btnSprays = (Button) findViewById(R.id.btnSprays);

        //Creating OnclickListener
        btnBackblings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("Backblings");
            }

        });

        btnGliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("Gliders");
            }
        });

        btnPickaxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("Pickaxes");
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrolling, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
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
    public void openAnotherActivity(){
        Intent intent = new Intent(this, Backblings.class);
        startActivity(intent);

    }
}

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
import android.widget.ImageButton;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.doubleclick.PublisherAdRequest;
import com.google.android.gms.ads.doubleclick.PublisherInterstitialAd;

public class MainMenu extends AppCompatActivity {
    PublisherInterstitialAd mPublisherInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);


        //Creating Buttons
        Button btnBackblings = (Button) findViewById(R.id.btnBackblings);
        Button btnGliders = (Button) findViewById(R.id.btnGliders);
        Button btnLoadingScreens = (Button) findViewById(R.id.btnLoadingScreens);
        Button btnPickaxes = (Button) findViewById(R.id.btnPickaxes);
        Button btnSkins = (Button) findViewById(R.id.btnSkins);
        Button donate = (Button) findViewById(R.id.donate);

        //Creating OnclickListener in Ads




        //Ads calling
        mPublisherInterstitialAd = new PublisherInterstitialAd(this);
        mPublisherInterstitialAd.setAdUnitId("ca-app-pub-3940256099942544/1033173712");

        mPublisherInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdClosed() {
                requestNewInterstitial();

            }
        });

        requestNewInterstitial();

        btnBackblings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                    openAnotherActivity("Backblings");
                } else {
                    openAnotherActivity("Backblings");
                }
            }

        });
        btnGliders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                    openAnotherActivity("Gliders");
                } else {
                    openAnotherActivity("Gliders");
                }
            }
        });

        btnPickaxes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                    openAnotherActivity("Pickaxes");
                } else {
                    openAnotherActivity("Pickaxes");
                }
            }
        });

        btnLoadingScreens.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                    openAnotherActivity("LoadingScreens");
                } else {
                    openAnotherActivity("LoadingScreens");
                }
            }
        });

        btnSkins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (mPublisherInterstitialAd.isLoaded()) {
                    mPublisherInterstitialAd.show();
                    openAnotherActivity("Skins");
                } else {
                    openAnotherActivity("Skins");
                }
            }
        });

        donate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAnotherActivity("PaypalDonate");
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

            private void requestNewInterstitial() {
                PublisherAdRequest adRequest = new PublisherAdRequest.Builder()
                        .addTestDevice("33BE2250B43518CCDA7DE426D04EE231")
                        .build();

                mPublisherInterstitialAd.loadAd(adRequest);
            }
}

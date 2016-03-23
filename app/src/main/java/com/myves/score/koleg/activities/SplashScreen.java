package com.myves.score.koleg.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.myves.score.koleg.R;

public class SplashScreen extends AppCompatActivity {

    private static final String LOG_TAG = SplashScreen.class.getSimpleName();

    private final static int SPLASH_TIME_OUT = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Log.i(LOG_TAG, "splash screen launch : KSS22032016.");

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, MainActivity.class));
                finish();
            }
        }, SPLASH_TIME_OUT);

        //showSplashScreen();
    }

    /*private void showSplashScreen(){

    }*/
}

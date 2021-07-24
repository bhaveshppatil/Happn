package com.example.happnclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.airbnb.lottie.LottieAnimationView;

public class Splash_Screen extends AppCompatActivity {


    LottieAnimationView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        //This method is used so that your splash activity
        //can cover the entire screen.

//        setContentView(R.layout.activity_main);
        //this will bind your MainActivity.class file with activity_main.

        imageView = findViewById(R.id.imageView);

        imageView.animate().translationX(5000).translationY(5000).setStartDelay(5000);

       new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash_Screen.this,MainActivity.class);
                startActivity(intent);
                finish();

                //the current activity will get finished.
            }
        },5000);
    }
}


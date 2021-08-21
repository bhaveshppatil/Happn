package com.example.happnclone.MainLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.example.happnclone.LoginDetail.DataPolicy;
import com.example.happnclone.LoginDetail.TermsConditions;
import com.example.happnclone.R;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AppSettings extends AppCompatActivity {
    SwitchCompat swFlashNode, swCrushes,swMessage, swReaction, swDailyRecap,swInstagram, swSpotify,
    swNotification;

    TextView tvConditions, tvPolicy, tvPrivacyPolicy, tvMyData;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_settings);

        swFlashNode = findViewById(R.id.swFlashNote);
        swCrushes = findViewById(R.id.Crushes);
        swNotification = findViewById(R.id.Notification);
        swDailyRecap = findViewById(R.id.DailyRecap);
        swMessage = findViewById(R.id.Messages);
        swReaction = findViewById(R.id.Reaction);
        swInstagram = findViewById(R.id.swInstagram);
        swSpotify = findViewById(R.id.swSpotify);
        tvConditions = findViewById(R.id.Conditions);
        tvPolicy = findViewById(R.id.Policy);
        tvPrivacyPolicy = findViewById(R.id.privacyPolicy);
        tvMyData = findViewById(R.id.MyData);
        
        swInstagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swInstagram.isChecked()){
                    Toast.makeText(AppSettings.this, "Connected To Instagram", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AppSettings.this, "Disconnected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        swSpotify.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swSpotify.isChecked()){
                    Toast.makeText(AppSettings.this, "Connected To Spotify", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AppSettings.this, "Disconnected", Toast.LENGTH_SHORT).show();
                }
            }
        });

        tvConditions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AppSettings.this, TermsConditions.class);
                startActivity(intent);
            }
        });

        tvPrivacyPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(AppSettings.this, DataPolicy.class);
                startActivity(intent1);
            }
        });

        tvPolicy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(AppSettings.this, DataPolicy.class);
                startActivity(intent2);
            }
        });

        tvMyData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AppSettings.this, " Hello From my data ", Toast.LENGTH_SHORT).show();
            }
        });


        swFlashNode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swFlashNode.isChecked()){
                    Toast.makeText(AppSettings.this, "FlashNote Checked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AppSettings.this, "FlashNote Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
        swCrushes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swCrushes.isChecked()){
                    Toast.makeText(AppSettings.this, "Crushes Checked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AppSettings.this, "Crushes Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
        swMessage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swFlashNode.isChecked()){
                    Toast.makeText(AppSettings.this, "Message Checked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AppSettings.this, "Message Off", Toast.LENGTH_SHORT).show();
                }
            }
        });
        swReaction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swReaction.isChecked()){
                    Toast.makeText(AppSettings.this, "Reaction Checked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AppSettings.this, "Reaction Off", Toast.LENGTH_SHORT).show();
                }

            }
        });
        swDailyRecap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swDailyRecap.isChecked()){
                    Toast.makeText(AppSettings.this, "Daily Recap Checked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AppSettings.this, "Daily Recap Off", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
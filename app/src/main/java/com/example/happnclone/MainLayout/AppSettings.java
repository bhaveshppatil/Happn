package com.example.happnclone.MainLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import com.example.happnclone.R;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class AppSettings extends AppCompatActivity {
    SwitchCompat swFashNote, swCrushes,swMessage, swReaction, swDaiyReacp,
    swNotification;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_settings);

        swFashNote = findViewById(R.id.swFlashNote);
        swCrushes = findViewById(R.id.Crushes);
        swNotification = findViewById(R.id.Notification);
        swDaiyReacp = findViewById(R.id.DailyRecap);
        swMessage = findViewById(R.id.Messages);
        swReaction = findViewById(R.id.Reaction);

        swFashNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swFashNote.isChecked()){
                    Toast.makeText(AppSettings.this, "FashNote Checked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AppSettings.this, "FashNote Off", Toast.LENGTH_SHORT).show();
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
                if (swFashNote.isChecked()){
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
        swDaiyReacp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (swDaiyReacp.isChecked()){
                    Toast.makeText(AppSettings.this, "Daily Recap Checked", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(AppSettings.this, "Daily Recap Off", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}
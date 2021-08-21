package com.example.happnclone.MainLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.happnclone.R;

public class MyPreferences extends AppCompatActivity {

    private SwitchCompat switch0, switch3 , switch4,switch5,switch6;
    TextView tvSetting;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mypreferences);

        switch0 = findViewById(R.id.switch0);
        switch3 = findViewById(R.id.switch3);
        switch4 = findViewById(R.id.switch4);
        switch5 = findViewById(R.id.switch5);
        switch6 = findViewById(R.id.switch6);
        tvSetting = findViewById(R.id.tvsetting);


        switch0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!switch0.isChecked())
                    Toast.makeText(MyPreferences.this, "Invisible for 8 hours", Toast.LENGTH_SHORT).show();



                if (switch0.isChecked())
                    Toast.makeText(MyPreferences.this, "Visible for 8 hours", Toast.LENGTH_SHORT).show();
            }
        });

        switch3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!switch3.isChecked())
                    Toast.makeText(MyPreferences.this, "Age is Hidden", Toast.LENGTH_SHORT).show();


                if (switch3.isChecked())
                    Toast.makeText(MyPreferences.this, "Age is Visible", Toast.LENGTH_SHORT).show();
            }
        });


        switch4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!switch4.isChecked())
                    Toast.makeText(MyPreferences.this, "Online Status Hidden", Toast.LENGTH_SHORT).show();


                if (switch4.isChecked())
                    Toast.makeText(MyPreferences.this, "Online Status is Visible", Toast.LENGTH_SHORT).show();
            }
        });
        switch5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!switch5.isChecked())
                    Toast.makeText(MyPreferences.this, "Your Distance is hidden ", Toast.LENGTH_SHORT).show();


                if (switch5.isChecked())
                    Toast.makeText(MyPreferences.this, "Your distance  is Visible", Toast.LENGTH_SHORT).show();
            }
        });
        switch6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!switch6.isChecked())
                    Toast.makeText(MyPreferences.this, "Location is  Hidden", Toast.LENGTH_SHORT).show();


                if (switch6.isChecked())
                    Toast.makeText(MyPreferences.this, "Location is Visible", Toast.LENGTH_SHORT).show();
            }
        });

    }
}
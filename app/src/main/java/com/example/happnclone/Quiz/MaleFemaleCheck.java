package com.example.happnclone.Quiz;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.happnclone.R;

public class MaleFemaleCheck extends AppCompatActivity {
    private Button mBtnContinue;
    private SwitchCompat swMale;
    private SwitchCompat swFemale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_female_check);
        mBtnContinue = findViewById(R.id.BtnContinue);

        swMale = findViewById(R.id.swMale);
        swFemale = findViewById(R.id.swFemale);

        if(swMale.isChecked()){

        }

        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaleFemaleCheck.this, QuizIntro.class);
                startActivity(intent);
            }
        });
    }
}
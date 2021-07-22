package com.example.happnclone.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.R;

public class MaleFemaleCheck extends AppCompatActivity {
   private Button mBtnContinue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male_female_check);
        mBtnContinue = findViewById(R.id.BtnContinue);
        mBtnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MaleFemaleCheck.this,QuizIntro.class);
                startActivity(intent);
            }
        });
    }
}
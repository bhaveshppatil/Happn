package com.example.happnclone.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.R;

public class QuizIntro extends AppCompatActivity {

    Button mBtnLetsGO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_intro);
        mBtnLetsGO = findViewById(R.id.BtnLetsGO);
        mBtnLetsGO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(QuizIntro.this,quizOneWhyHappn.class);
                startActivity(intent);
            }
        });
    }
}
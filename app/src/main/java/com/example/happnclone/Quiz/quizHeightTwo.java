package com.example.happnclone.Quiz;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.R;

public class quizHeightTwo extends AppCompatActivity {
    private Button mBtnSkipHt, mBtnThreeHt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.height_main);
        mBtnSkipHt = findViewById(R.id.BtnSkipHt);
        mBtnThreeHt = findViewById(R.id.BtnThreeHt);
        mBtnSkipHt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quizHeightTwo.this, QuizThreeQuiz.class);
                startActivity(intent);
            }
        });
        mBtnThreeHt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(quizHeightTwo.this,QuizThreeQuiz.class);
                startActivity(intent1);
            }
        });
    }
}
package com.example.happnclone.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.R;

public class QuizThreeQuiz extends AppCompatActivity {
    private Button mBtnSkipFood, mBtnOneFood, mBtnTwoFood, mBtnThreeFood;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_main);
        initView();
        mBtnSkipFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(QuizThreeQuiz.this, CodingQuizSixth.class);
                startActivity(intent1);
            }
        });
        mBtnOneFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(QuizThreeQuiz.this, CodingQuizSixth.class);
                startActivity(intent2);
            }
        });
        mBtnTwoFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(QuizThreeQuiz.this, CodingQuizSixth.class);
                startActivity(intent3);
            }
        });
        mBtnThreeFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent4 = new Intent(QuizThreeQuiz.this, CodingQuizSixth.class);
                startActivity(intent4);
            }
        });

    }

    private void initView() {
        mBtnSkipFood = findViewById(R.id.BtnSkipFood);
        mBtnOneFood = findViewById(R.id.BtnOneFood);
        mBtnTwoFood = findViewById(R.id.BtnTwoFood);
        mBtnThreeFood = findViewById(R.id.BtnThreeFood);
    }
}



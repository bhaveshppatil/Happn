package com.example.happnclone.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.R;

public class CodingQuizSixth extends AppCompatActivity {
    private Button mBtnSkip11, mBtnOne11, mBtnTwo11, mBtnThree11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coding_main);
        initView();
        mBtnSkip11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CodingQuizSixth.this, NightLifeFifth.class);
                startActivity(intent);
            }
        });
        mBtnOne11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(CodingQuizSixth.this, NightLifeFifth.class);
                startActivity(intent1);
            }
        });

        mBtnTwo11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(CodingQuizSixth.this, NightLifeFifth.class);
                startActivity(intent2);
            }
        });

        mBtnThree11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(CodingQuizSixth.this, NightLifeFifth.class);
                startActivity(intent3);
            }
        });
    }

    private void initView() {
        mBtnOne11 = findViewById(R.id.BtnOne11);
        mBtnSkip11 = findViewById(R.id.BtnSkip11);
        mBtnTwo11 = findViewById(R.id.BtnTwo11);
        mBtnThree11 = findViewById(R.id.BtnThree11);
    }
}

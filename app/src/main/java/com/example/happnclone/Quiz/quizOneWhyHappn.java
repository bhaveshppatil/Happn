package com.example.happnclone.Quiz;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.R;

public class quizOneWhyHappn extends AppCompatActivity {

    private Button mBtnSkip1Mag, mBtnOneMag, mBtnTwoMag, mBtnThreeMag;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.whyhappen_main);
        initView();
        mBtnSkip1Mag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(quizOneWhyHappn.this, quizHeightTwo.class);
                startActivity(intent);
            }
        });

        mBtnOneMag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(quizOneWhyHappn.this, quizHeightTwo.class);
                startActivity(intent1);
            }
        });
        mBtnTwoMag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(quizOneWhyHappn.this, quizHeightTwo.class);
                startActivity(intent2);
            }
        });
        mBtnThreeMag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(quizOneWhyHappn.this, quizHeightTwo.class);
                startActivity(intent3);
            }
        });
    }

    private void initView() {
        mBtnSkip1Mag = findViewById(R.id.BtnSkip1Mag);
        mBtnOneMag = findViewById(R.id.BtnOneMag);
        mBtnTwoMag = findViewById(R.id.BtnTwoMag);
        mBtnThreeMag = findViewById(R.id.BtnThreeMag);
    }
}
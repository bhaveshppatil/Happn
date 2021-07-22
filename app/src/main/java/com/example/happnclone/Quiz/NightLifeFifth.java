package com.example.happnclone.Quiz;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.R;

public class NightLifeFifth extends AppCompatActivity {

    private Button mBtnSkip, mBtnOne , mBtnTwo, mBtnThree;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nightlife_main);
        initViews();
        mBtnSkip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(NightLifeFifth.this, Exercise_main.class);
                startActivity(intent);
            }
        });
        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(NightLifeFifth.this, Exercise_main.class);
                startActivity(intent1);
            }
        });
        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(NightLifeFifth.this, Exercise_main.class);
                startActivity(intent2);
            }
        });
        mBtnThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(NightLifeFifth.this, Exercise_main.class);
                startActivity(intent3);
            }
        });
    }

    private void initViews() {
        mBtnOne = findViewById(R.id.BtnOne);
        mBtnSkip = findViewById(R.id.BtnSkip);
        mBtnTwo = findViewById(R.id.BtnTwo);
        mBtnThree = findViewById(R.id.BtnThree);
    }
}
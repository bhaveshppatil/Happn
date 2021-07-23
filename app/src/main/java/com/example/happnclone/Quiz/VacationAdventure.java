package com.example.happnclone.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.MainLayout.Layout_MainActivity;
import com.example.happnclone.R;

public class VacationAdventure extends AppCompatActivity {

    private Button mBtnSkipCB, mBtnOneCB, mBtnTwoCB, mBtnThreeCB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vacation_main);
        initView();
    }



    private void initView() {
        mBtnOneCB = findViewById(R.id.BtnOneCB);
        mBtnSkipCB = findViewById(R.id.BtnSkipCB);
        mBtnTwoCB = findViewById(R.id.BtnTwoCB);
        mBtnThreeCB = findViewById(R.id.BtnThreeCB);

        mBtnSkipCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VacationAdventure.this, Layout_MainActivity.class);
                startActivity(intent);
            }
        });

        mBtnOneCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VacationAdventure.this, Layout_MainActivity.class);
                startActivity(intent);
            }
        });

        mBtnTwoCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VacationAdventure.this, Layout_MainActivity.class);
                startActivity(intent);
            }
        });

        mBtnThreeCB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(VacationAdventure.this, Layout_MainActivity.class);
                startActivity(intent);
            }
        });

    }
}
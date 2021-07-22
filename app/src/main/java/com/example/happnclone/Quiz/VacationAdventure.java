package com.example.happnclone.Quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

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

    }
}
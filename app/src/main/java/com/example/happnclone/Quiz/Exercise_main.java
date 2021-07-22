package com.example.happnclone.Quiz;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.R;

public class Exercise_main extends AppCompatActivity {

    Button mBtnSkipM,mBtnOneM,mBtnTwoM,mBtnThreeM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.forth_exercise_main);
        initView();
        mBtnSkipM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Exercise_main.this, VacationAdventure.class);
                startActivity(intent);
            }
        });
        mBtnOneM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(Exercise_main.this, VacationAdventure.class);
                startActivity(intent1);
            }
        });

        mBtnTwoM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(Exercise_main.this, VacationAdventure.class);
                startActivity(intent2);
            }
        });

        mBtnThreeM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent3 = new Intent(Exercise_main.this, VacationAdventure.class);
                startActivity(intent3);
            }
        });

    }


    private void initView(){
        mBtnSkipM = findViewById(R.id.BtnSkipM);
        mBtnOneM = findViewById(R.id.BtnOneM);
        mBtnTwoM = findViewById(R.id.BtnTwoM);
        mBtnThreeM = findViewById(R.id.BtnThreeM);

    }
}
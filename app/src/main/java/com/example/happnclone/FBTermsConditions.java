package com.example.happnclone;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FBTermsConditions extends AppCompatActivity {
    private Button btnAcceptTSFB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_b_terms_conditions);
        btnAcceptTSFB = findViewById(R.id.btnAcceptTermsOfServiceFB);
        btnAcceptTSFB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FBTermsConditions.this, FBPrivacyPolicy.class);
                startActivity(intent);
            }
        });
    }
}
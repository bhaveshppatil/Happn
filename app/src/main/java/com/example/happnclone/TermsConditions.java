package com.example.happnclone;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TermsConditions extends AppCompatActivity {
    private Button btnAcceptTerms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms_conditions);

        btnAcceptTerms = findViewById(R.id.btnAcceptTermsOfService);
        btnAcceptTerms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(TermsConditions.this, DataPolicy.class);
                startActivity(intent);
            }
        });
    }
}
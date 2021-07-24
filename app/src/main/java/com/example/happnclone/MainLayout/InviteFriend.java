package com.example.happnclone.MainLayout;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.happnclone.R;

public class InviteFriend extends AppCompatActivity {

    Button referpeople;
    Dialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invite_friend);
        dialog = new Dialog(this);

            referpeople.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openwindialogue();
            }
        });
    }

    private void openwindialogue() {
        dialog.setContentView(R.layout.win_layout);
        dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));

        Button okbtn = dialog.findViewById(R.id.okbutton);
        okbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog.dismiss();
            }
        });
        dialog.show();
    }
}
package com.example.happnclone.MainLayout;

import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.happnclone.LoginDetail.PreferenceHelper;
import com.example.happnclone.R;


public class ProfileFragment extends Fragment {

    Button btnMyPreferences, btnFriend, btnSetting;
    TextView setTextThing, myAccount, btnNeedHep;
    AlertDialog.Builder builder;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_profile, container, false);

        btnMyPreferences = view.findViewById(R.id.btnmypreferences);
        btnFriend = view.findViewById(R.id.btnfriend);
        myAccount = view.findViewById(R.id.myaccount);
        setTextThing = view.findViewById(R.id.tvsetting);
        btnSetting = view.findViewById(R.id.btnsetting);
        btnNeedHep = view.findViewById(R.id.btnNeedHep);

        btnNeedHep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Need Help!");
                builder.setMessage("Terms and Conditions");
                builder.show();
            }
        });

        PreferenceHelper.getInstance(getActivity());
        String name = PreferenceHelper.getIntSharedPreferenceKey("personname");
        myAccount.setText(name);
        btnSetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), AppSettings.class);
                startActivity(intent);

            }
        });

        btnMyPreferences.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), MyPreferences.class);
                startActivity(intent);

            }
        });

        btnFriend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent7 = new Intent(getActivity(), InviteFriend.class);
                startActivity(intent7);
            }
        });


        return view;
    }
}
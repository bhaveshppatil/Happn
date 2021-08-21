package com.example.happnclone.MainLayout;

import android.content.Intent;
import android.os.Bundle;

import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.happnclone.ChatData.ChatScreen;
import com.example.happnclone.R;


public class ChatFragment extends Fragment {

    private CardView cardOne, cardTwo, cardThree, cardFour, cardFive;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_chat, container, false);
        cardOne = view.findViewById(R.id.cardOne);
        cardTwo = view.findViewById(R.id.cardTwo);
        cardThree = view.findViewById(R.id.cardThree);
        cardFour = view.findViewById(R.id.cardFour);
        cardFive = view.findViewById(R.id.cardFive);
        cardOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChatScreen.class);
                startActivity(intent);
            }
        });
        cardTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChatScreen.class);
                startActivity(intent);
            }
        });
        cardThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChatScreen.class);
                startActivity(intent);
            }
        });
        cardFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChatScreen.class);
                startActivity(intent);
            }
        });
        cardFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), ChatScreen.class);
                startActivity(intent);
            }
        });


        return view;
    }
}
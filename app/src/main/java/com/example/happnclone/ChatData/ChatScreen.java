package com.example.happnclone.ChatData;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.happnclone.R;

import java.util.ArrayList;

public class ChatScreen extends AppCompatActivity  {
    RecyclerView recyclerView;
    EditText etOption;
    EditText etSendMsg;
    ImageView imgSend;
    ArrayList<BaseModel> baseModelList = new ArrayList<>();
    ChatAdapter chatAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat_screen);
        initViews();
        setRecyclerView();
    }

    @SuppressLint("NotifyDataSetChanged")
    public void buildData() {
        if (etOption.getText().toString().equals("0")) {
            baseModelList.add(new SenderModel(etSendMsg.getText().toString()));

        } else if (etOption.getText().toString().equals("1")) {
            baseModelList.add(new ReceiverModel(etSendMsg.getText().toString()));
        }
        chatAdapter.notifyDataSetChanged();
    }

    public void initViews() {
        recyclerView = findViewById(R.id.recyclerView);
        etOption = findViewById(R.id.etChoice);
        etSendMsg = findViewById(R.id.etSendMessage);
        imgSend = findViewById(R.id.ivSend);
        imgSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buildData();
            }
        });
    }

    public void setRecyclerView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        chatAdapter = new ChatAdapter(baseModelList);
        recyclerView.setAdapter(chatAdapter);
        recyclerView.setLayoutManager(layoutManager);
    }
}
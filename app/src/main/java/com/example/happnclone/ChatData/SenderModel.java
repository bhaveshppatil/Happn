package com.example.happnclone.ChatData;

public class SenderModel extends BaseModel {

    private String senderMessage;

    public SenderModel(String message){
        this.senderMessage = message;
    }

    public String getMessage(){
        return senderMessage;
    }

    @Override
    int getViewType() {
        return 0;
    }
}

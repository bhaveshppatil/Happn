package com.example.happnclone.ChatData;

import android.view.View;
import android.widget.TextView;
import com.example.happnclone.R;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SenderViewHolder extends RecyclerView.ViewHolder {
    private TextView tvSenderMsg;

    public SenderViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);

    }

    private void initViews(View itemView) {
        tvSenderMsg = itemView.findViewById(R.id.tvSenderMessage);
    }

    public void setData(SenderModel senderModel) {
        tvSenderMsg.setText(senderModel.getMessage());
    }
}

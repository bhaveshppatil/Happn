package com.example.happnclone.Match;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.happnclone.LoginDetail.ProfileModel;
import com.example.happnclone.R;

public class FormulaViewHolder extends RecyclerView.ViewHolder {

    ImageView ivImage, ivImage2;

    TextView tvName, tvAge, tvDistance;
    Button btnDetails;
    ViewFlipper slider;


    public FormulaViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);
    }

    private void initViews(View itemView) {
        ivImage = itemView.findViewById(R.id.ivimage);
        tvDistance = itemView.findViewById(R.id.tvDistance);
        ivImage2 = itemView.findViewById(R.id.ivimage2);

        tvName = itemView.findViewById(R.id.tvName);
        tvAge = itemView.findViewById(R.id.tvAge);
        slider = itemView.findViewById(R.id.slider);
        btnDetails = itemView.findViewById(R.id.btndetails);

    }

    public void setData(ProfileModel profileModel) {
        tvName.setText(profileModel.getName());
        tvDistance.setText(profileModel.getCity());
        tvAge.setText(profileModel.getAge());
        Glide.with(ivImage).load(profileModel.getPhoto1()).into(ivImage);
        Glide.with(ivImage2).load(profileModel.getPhoto2()).into(ivImage2);


    }
}

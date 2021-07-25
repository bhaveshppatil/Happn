package com.example.happnclone.Match;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ViewFlipper;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.happnclone.ProfileModel;
import com.example.happnclone.R;

public class FormulaViewHolder extends RecyclerView.ViewHolder {

    ImageView ivimage, ivimage2;

    TextView tvName, tvAge, tvDistance;
    Button btndeatils;
    ViewFlipper slider;


    public FormulaViewHolder(@NonNull View itemView) {
        super(itemView);
        initviews(itemView);
    }

    private void initviews(View itemView) {
        ivimage = itemView.findViewById(R.id.ivimage);
        tvDistance = itemView.findViewById(R.id.tvDistance);
        ivimage2 = itemView.findViewById(R.id.ivimage2);

        tvName = itemView.findViewById(R.id.tvName);
        tvAge = itemView.findViewById(R.id.tvAge);
        slider = itemView.findViewById(R.id.slider);
        btndeatils = itemView.findViewById(R.id.btndetails);

    }

    public void setData(ProfileModel profileModel) {
        tvName.setText(profileModel.getName());
        tvDistance.setText(profileModel.getCity());
        tvAge.setText(profileModel.getAge());
        Glide.with(ivimage).load(profileModel.getPhoto1()).into(ivimage);
        Glide.with(ivimage2).load(profileModel.getPhoto2()).into(ivimage2);


    }
}

package com.example.happnclone.Match;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.happnclone.ProfileModel;
import com.example.happnclone.R;

import android.widget.Button;
import android.widget.ImageSwitcher;

public class FormulaViewHolder extends RecyclerView.ViewHolder {

    ImageView ivimage, ivimage2, image3;

    TextView tvName, tvAge, tvDistance;
    Button btndeatils;


    public FormulaViewHolder(@NonNull View itemView) {
        super(itemView);
        initviews(itemView);
    }

    private void initviews(View itemView) {
        ivimage = itemView.findViewById(R.id.ivimage);
        tvDistance = itemView.findViewById(R.id.tvDistance);
        ivimage2 = itemView.findViewById(R.id.ivimage2);
        image3 = itemView.findViewById(R.id.ivimage3);
        tvName = itemView.findViewById(R.id.tvName);
        tvAge = itemView.findViewById(R.id.tvAge);
        btndeatils = itemView.findViewById(R.id.btndetails);

    }

    public void setData(ProfileModel profileModel) {
        tvName.setText(profileModel.getName());
        tvDistance.setText(profileModel.getCity());
        tvAge.setText(profileModel.getAge());
        Glide.with(ivimage).load(profileModel.getPhoto1()).into(ivimage);
        Glide.with(image3).load(profileModel.getPhoto3()).into(image3);

        ivimage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Glide.with(ivimage2).load(profileModel.getPhoto2()).into(ivimage2);

            }
        });

    }
}

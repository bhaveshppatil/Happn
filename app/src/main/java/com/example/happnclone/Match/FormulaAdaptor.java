package com.example.happnclone.Match;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.happnclone.LoginDetail.ProfileModel;
import com.example.happnclone.R;

import java.util.List;

public class FormulaAdaptor extends RecyclerView.Adapter<FormulaViewHolder> {


    private List<ProfileModel> profileModelList;

    public FormulaAdaptor(List<ProfileModel> profileModelList) {
        this.profileModelList = profileModelList;
    }

    @NonNull
    @Override
    public FormulaViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false);
        return new FormulaViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FormulaViewHolder holder, int position) {
        ProfileModel profileModel = profileModelList.get(position);
        holder.setData(profileModel);
    }

    @Override
    public int getItemCount() {
        return profileModelList.size();
    }

    public void updateData(List<ProfileModel> profileModelList){
        this.profileModelList = profileModelList;
        notifyDataSetChanged();
    }
}



package com.example.happnclone;

import java.util.List;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

public class ResponseModel implements Serializable {

	@SerializedName("Profile")
	private List<ProfileModel> profile;

	public List<ProfileModel> getProfile(){
		return profile;
	}
}
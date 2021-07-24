package com.example.happnclone;


import com.google.gson.annotations.SerializedName;
import java.io.Serializable;


public class ProfileModel implements Serializable {

	@SerializedName("Name")
	private String name;

	@SerializedName("Age")
	private String age;

	@SerializedName("City")
	private String city;

	@SerializedName("Hobbie2")
	private String hobbie2;

	@SerializedName("Hobbie3")
	private String hobbie3;

	@SerializedName("Hobbie4")
	private String hobbie4;

	@SerializedName("Hobbie5")
	private String hobbie5;

	@SerializedName("Hobbie6")
	private String hobbie6;

	@SerializedName("Photo2")
	private String photo2;

	@SerializedName("Photo1")
	private String photo1;

	@SerializedName("Photo3")
	private String photo3;

	public String getName(){
		return name;
	}

	public String getAge(){
		return age;
	}

	public String getCity(){
		return city;
	}

	public String getHobbie2(){
		return hobbie2;
	}

	public String getHobbie3(){
		return hobbie3;
	}

	public String getHobbie4(){
		return hobbie4;
	}

	public String getHobbie5(){
		return hobbie5;
	}

	public String getHobbie6(){
		return hobbie6;
	}

	public String getPhoto2(){
		return photo2;
	}

	public String getPhoto1(){
		return photo1;
	}

	public String getPhoto3(){
		return photo3;
	}
}
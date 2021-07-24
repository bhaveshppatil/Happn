package com.example.happnclone;

import android.content.Context;
import android.content.SharedPreferences;

public class PreferenceHelper {
    private static final String SHARED_PREFERENCE_KEY = "com.xyz.sharedpreferences";
    private static SharedPreferences sharedPreferences;

    public static SharedPreferences getInstance(Context context) {
        if(sharedPreferences == null){
            sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCE_KEY,Context.MODE_PRIVATE);
        }
        return sharedPreferences;
    }

    public static void writeStringToPreference(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString(key, value);
        editor.apply();
    }

    public static String getIntSharedPreferenceKey(String key){
        return sharedPreferences.getString(key, " ");
    }
}

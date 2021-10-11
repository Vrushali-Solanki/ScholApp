package com.example.scholappdemo;

import android.content.Context;
import android.content.SharedPreferences;

public class SharedPrefManager {
    private static String SHARED_PREF_NAME="scholapp";
    private SharedPreferences sharedPreferences;
    Context context;
    private SharedPreferences.Editor editor;


    public SharedPrefManager(Context context) {
        this.context = context;
    }

    void saveUser(boolean user){
        sharedPreferences=context.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
//        editor.putInt("id",user.getId());
//        editor.putString("email",user.getEmail());
//        editor.putString("password",user.getPassword());
        editor.putBoolean("logged",true);
        editor.apply();
    }

    public boolean isLoggedIn(){
        sharedPreferences=context.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean("logged",false);
    }

    public User getUser(){
        sharedPreferences=context.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        return new User(sharedPreferences.getInt("id",-1),
                sharedPreferences.getString("email",null),
                sharedPreferences.getString("password",null));

    }

    public void logout(){
        sharedPreferences=context.getSharedPreferences(SHARED_PREF_NAME,Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }
}

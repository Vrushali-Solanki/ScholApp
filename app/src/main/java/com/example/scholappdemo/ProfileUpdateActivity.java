package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.scholappdemo.ui.home.HomeFragment;
import com.example.scholappdemo.ui.profile.GalleryFragment;

public class ProfileUpdateActivity extends AppCompatActivity {

    private TextView confupdate;
    private EditText updatemail,updatepass,updatename;
    private DatabaseConnectivity g;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_update);

        confupdate=findViewById(R.id.update_btn);
        updatemail=findViewById(R.id.update_email);
        updatepass=findViewById(R.id.update_password);
        updatename=findViewById(R.id.update_name);
        g = new DatabaseConnectivity(this);








        confupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String mail=updatemail.getText().toString().trim();
                String pass=updatepass.getText().toString().trim();
                String upname=updatename.getText().toString().trim();

                Boolean i=g.update_data(mail,pass,upname);
                if(i==true)
                    Toast.makeText(ProfileUpdateActivity.this,"Your profile has been updated successfully",Toast.LENGTH_SHORT).show();
                else
                    Toast.makeText(ProfileUpdateActivity.this,"Sorry your profile has not updated!Try again later",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
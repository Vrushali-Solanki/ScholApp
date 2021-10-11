package com.example.scholappdemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private EditText sname, semail, spassword, sphone,sconfpassword;
    private Button signup;
    private TextView sloginhere;
    private DatabaseConnectivity g;
    SharedPrefManager sharedPrefManager;

//    SharedPreferences sharedPreferences;
//
//    public static final String fileName="Login";
//    public static final String Email="email";
//    public static final String Password="password";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sname = findViewById(R.id.signup_name);
        semail = findViewById(R.id.signup_email);
        spassword = findViewById(R.id.signup_password);
        sconfpassword = findViewById(R.id.signup_confpassword);
        signup = findViewById(R.id.signup);
        sphone = findViewById(R.id.signup_phone);
        sloginhere = findViewById(R.id.signup_tv);
        sharedPrefManager=new SharedPrefManager(getApplicationContext());

        g = new DatabaseConnectivity(this);
        //g.getReadableDatabase();


//        sharedPreferences=getSharedPreferences(fileName, Context.MODE_PRIVATE);
//        if(sharedPreferences.contains(Email)){
//            Intent intent=new Intent(MainActivity.this,NavActivity.class);
//            startActivity(intent);
//        }



        sloginhere.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), LoginDemoActivity.class));
            }
        });


        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email1 = semail.getText().toString().trim();
                String password1 = spassword.getText().toString().trim();
                String confirm = sconfpassword.getText().toString().trim();
                String name1 = sname.getText().toString().trim();
                String phone1 = sphone.getText().toString().trim();


                if (TextUtils.isEmpty(name1)) {
                    sname.setError("Name is required");
                    return;
                }

                else if (TextUtils.isEmpty(email1)) {
                    semail.setError("Email is required");
                    return;
                }

                else if (TextUtils.isEmpty(phone1)) {
                    sphone.setError("Mobile Number is required");
                    return;
                }

                else if (TextUtils.isEmpty(password1)) {
                    spassword.setError("Password is required");
                    return;
                }

                else if (!password1.equals(confirm)) {
                    sconfpassword.setError("Password did not match");
                    return;
                }

                else if (name1.length() < 6) {
                    sname.setError("Please write your full name");
                    return;
                }

                else if (phone1.length() < 10) {
                    sphone.setError("Mobile Number must be of 10 characters.");
                    return;
                }

                else if (password1.length() < 6) {
                    spassword.setError("Password must be atleast of 6 characters.");
                    return;
                }

                else {

//                    SharedPreferences.Editor editor=sharedPreferences.edit();
//                    editor.putString(Email,email1);
//                    editor.putString(Password,password1);
//                    editor.commit();

                        Boolean checkuser=g.check_email(email1);

                        if(checkuser==false)
                        {
                            Boolean i = g.insert_data(name1, email1, password1);

                            if (i == true)
                            {
                                sharedPrefManager.saveUser(checkuser);
                                Intent intent = new Intent(MainActivity.this, LoginDemoActivity.class);
                                startActivity(intent);
                                Toast.makeText(MainActivity.this, "Account created!!", Toast.LENGTH_SHORT).show();
                            }
                            else {
                                Toast.makeText(MainActivity.this, "Sorry your Registration was failed!", Toast.LENGTH_SHORT).show();
                            }
                        }
                        else {
                            Toast.makeText(MainActivity.this, "User already exists.Please try another phone number!", Toast.LENGTH_SHORT).show();
                        }

                }


            }

        });

    }
    @Override
    protected void onStart() {
        super.onStart();

        if (sharedPrefManager.isLoggedIn()) {
            Intent intent=new Intent(MainActivity.this,NavActivity.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(intent);
        }
    }
}




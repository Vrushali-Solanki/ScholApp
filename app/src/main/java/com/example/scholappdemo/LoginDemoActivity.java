package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginDemoActivity extends AppCompatActivity {

    private EditText lpassword, lemail;
    private Button llogin;
    private DatabaseConnectivity g;
    private TextView forgotpass;
//    SharedPrefManager sharedPrefManager;
//    SharedPreferences sharedPreferences;
//
//    public static final String fileName="Login";
//    public static final String Email="email";
//    public static final String Password="password";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_demo);

        lpassword = findViewById(R.id.login_password);
        llogin = findViewById(R.id.login);
        lemail = findViewById(R.id.login_email);
        forgotpass=findViewById(R.id.tv_forgot);


        g = new DatabaseConnectivity(this);
//        sharedPrefManager=new SharedPrefManager(getApplicationContext());

//        sharedPreferences=getSharedPreferences(fileName, Context.MODE_PRIVATE);
//        if(sharedPreferences.contains(Email)){
//            Intent intent=new Intent(LoginDemoActivity.this,NavActivity.class);
//            startActivity(intent);
//        }

        llogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String memail = lemail.getText().toString().trim();
                String mpassword = lpassword.getText().toString().trim();

                if (TextUtils.isEmpty(memail)) {
                    lemail.setError("Email Address is required");
                    return;
                }

                else if (TextUtils.isEmpty(mpassword)) {
                    lpassword.setError("Password is required");
                    return;
                }
                else
                {
//                    SharedPreferences.Editor editor=sharedPreferences.edit();
//                    editor.putString(Email,memail);
//                    editor.putString(Password,mpassword);
//                    editor.commit();

                    boolean checkuserpass=g.check_phonepassword(memail,mpassword);

                    if(checkuserpass==true)
                    {
//                        sharedPrefManager.saveUser(checkuserpass);
                        Toast.makeText(LoginDemoActivity.this, "Logged in successfully!", Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(LoginDemoActivity.this,NavActivity.class);
                        startActivity(intent);
                    }
                    else {
                        Toast.makeText(LoginDemoActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                        lemail.setText("");
                        lemail.requestFocus();
                        lpassword.setText("");
                    }
                }
            }
        });

        forgotpass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(LoginDemoActivity.this,ResetPasswordActivity.class);
                startActivity(intent);

            }
        });

    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//
//        if (sharedPrefManager.isLoggedIn()) {
//            Intent intent=new Intent(LoginDemoActivity.this,NavActivity.class);
//            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK|Intent.FLAG_ACTIVITY_CLEAR_TASK);
//            startActivity(intent);
//        }
//    }
}
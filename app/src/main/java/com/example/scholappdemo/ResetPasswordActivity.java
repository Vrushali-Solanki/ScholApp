package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ResetPasswordActivity extends AppCompatActivity {

    private EditText reset_email;
    private Button reset_password;
    private DatabaseConnectivity g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

        reset_email=findViewById(R.id.reset_email);
        reset_password=findViewById(R.id.reset_password);
        g=new DatabaseConnectivity(this);

        reset_password.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user=reset_email.getText().toString();

                Boolean checkuser=g.check_email(user);
                if(checkuser==true)
                {
                    Intent intent =new Intent(getApplicationContext(),ResetActivity.class);
                    intent.putExtra("email",user);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(ResetPasswordActivity.this,"User does not exists",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
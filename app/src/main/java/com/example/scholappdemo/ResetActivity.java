package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class ResetActivity extends AppCompatActivity {

    private TextView reset_email;
    private EditText pass,repass;
    private Button btnconfirm;
    private DatabaseConnectivity g;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);

        reset_email=findViewById(R.id.email_reset_text);
        pass=findViewById(R.id.reset_new_password);
        repass=findViewById(R.id.reset_re_password);
        btnconfirm=findViewById(R.id.btn_confirm);

        g=new DatabaseConnectivity(this);

        Intent  intent=getIntent();
        reset_email.setText(intent.getStringExtra("email"));

        btnconfirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String user= reset_email.getText().toString();
                String password=pass.getText().toString();
                String retypepass=repass.getText().toString();

                if(password.equals(retypepass)) {

                    Boolean checkpasswordupdate = g.update_password(user, password);
                    if (checkpasswordupdate == true) {
                        Intent intent = new Intent(getApplicationContext(), LoginDemoActivity.class);
                        startActivity(intent);
                        Toast.makeText(ResetActivity.this, "Password updated successfully", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(ResetActivity.this, "Password has not been updated try again!", Toast.LENGTH_SHORT).show();
                    }
                }
                else
                {
                    Toast.makeText(ResetActivity.this, "Password not matching!", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}
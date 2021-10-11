package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PostMatricActivity extends AppCompatActivity {

    private TextView ebc,minority,sc,obc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_matric);

        ebc=findViewById(R.id.post_ebc);
        minority=findViewById(R.id.post_minority);
        sc=findViewById(R.id.post_sc);
        obc=findViewById(R.id.post_obc);

        ebc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PostMatricActivity.this,EbcActivity.class);
                startActivity(intent);
            }
        });

        minority.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PostMatricActivity.this,MinorityActivity.class);
                startActivity(intent);
            }
        });

        sc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PostMatricActivity.this,ScActivity.class);
                startActivity(intent);
            }
        });

        obc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(PostMatricActivity.this,ObcActivity.class);
                startActivity(intent);
            }
        });
    }
}
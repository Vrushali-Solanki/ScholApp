package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MinorityProcedureActivity extends AppCompatActivity {

    private TextView minority_tv1,minority_tv2,minority_tv3,minority_tv4,minority_tv5,minority_tv6,minority_tv7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minority_procedure);

        minority_tv1=findViewById(R.id.minority_tv1);
        minority_tv2=findViewById(R.id.minority_tv2);
        minority_tv3=findViewById(R.id.minority_tv3);
        minority_tv4=findViewById(R.id.minority_tv4);
        minority_tv5=findViewById(R.id.minority_tv5);
        minority_tv6=findViewById(R.id.minority_tv6);
        minority_tv7=findViewById(R.id.minority_tv7);

        minority_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/1zYEySYQCFk");
            }
        });

        minority_tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yEORAFhQiIs");
            }
        });

        minority_tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yfaqfSAzwrs");
            }
        });

        minority_tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/Hbmj6QWjCyE");
            }
        });

        minority_tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/tftkLqUJO9o");
            }
        });

        minority_tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/RHmhMMEvYao");
            }
        });

        minority_tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/GvmJ6pZ73oI");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
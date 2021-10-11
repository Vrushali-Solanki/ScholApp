package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ScProcedureActivity extends AppCompatActivity {
    private TextView sc_tv1,sc_tv2,sc_tv3,sc_tv4,sc_tv5,sc_tv6,sc_tv7,sc_tv8,sc_tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc_procedure);

        sc_tv1=findViewById(R.id.sc_tv1);
        sc_tv2=findViewById(R.id.sc_tv2);
        sc_tv3=findViewById(R.id.sc_tv3);
        sc_tv4=findViewById(R.id.sc_tv4);
        sc_tv5=findViewById(R.id.sc_tv5);
        sc_tv6=findViewById(R.id.sc_tv6);
        sc_tv7=findViewById(R.id.sc_tv7);
        sc_tv8=findViewById(R.id.sc_tv8);
        sc_tv9=findViewById(R.id.sc_tv9);

        sc_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/1zYEySYQCFk");
            }
        });

        sc_tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yEORAFhQiIs");
            }
        });

        sc_tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yfaqfSAzwrs");
            }
        });

        sc_tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/Hbmj6QWjCyE");
            }
        });

        sc_tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/tftkLqUJO9o");
            }
        });

        sc_tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/RHmhMMEvYao");
            }
        });

        sc_tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/GvmJ6pZ73oI");
            }
        });

        sc_tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/7OesyVFvAxk");
            }
        });

        sc_tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/IKhrmuVkWnQ");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
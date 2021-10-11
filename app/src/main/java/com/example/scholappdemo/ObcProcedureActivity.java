package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ObcProcedureActivity extends AppCompatActivity {
    private TextView obc_tv1,obc_tv2,obc_tv3,obc_tv4,obc_tv5,obc_tv6,obc_tv7,obc_tv8,obc_tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_obc_procedure);

        obc_tv1=findViewById(R.id.obc_tv1);
        obc_tv2=findViewById(R.id.obc_tv2);
        obc_tv3=findViewById(R.id.obc_tv3);
        obc_tv4=findViewById(R.id.obc_tv4);
        obc_tv5=findViewById(R.id.obc_tv5);
        obc_tv6=findViewById(R.id.obc_tv6);
        obc_tv7=findViewById(R.id.obc_tv7);
        obc_tv8=findViewById(R.id.obc_tv8);
        obc_tv9=findViewById(R.id.obc_tv9);

        obc_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/1zYEySYQCFk");
            }
        });

        obc_tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yEORAFhQiIs");
            }
        });

        obc_tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yfaqfSAzwrs");
            }
        });

        obc_tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/Hbmj6QWjCyE");
            }
        });

        obc_tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/tftkLqUJO9o");
            }
        });

        obc_tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/RHmhMMEvYao");
            }
        });

        obc_tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/GvmJ6pZ73oI");
            }
        });

        obc_tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/9CaKzQ9y-nE");
            }
        });

        obc_tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/etP_8TaEV5g");
            }
        });

    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
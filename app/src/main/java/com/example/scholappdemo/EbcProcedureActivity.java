package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class EbcProcedureActivity extends AppCompatActivity {
    private TextView ebc_tv1,ebc_tv2,ebc_tv3,ebc_tv4,ebc_tv5,ebc_tv6,ebc_tv7,ebc_tv8,ebc_tv9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebc_procedure);
        ebc_tv1=findViewById(R.id.ebc_tv1);
        ebc_tv2=findViewById(R.id.ebc_tv2);
        ebc_tv3=findViewById(R.id.ebc_tv3);
        ebc_tv4=findViewById(R.id.ebc_tv4);
        ebc_tv5=findViewById(R.id.ebc_tv5);
        ebc_tv6=findViewById(R.id.ebc_tv6);
        ebc_tv7=findViewById(R.id.ebc_tv7);
        ebc_tv8=findViewById(R.id.ebc_tv8);
        ebc_tv9=findViewById(R.id.ebc_tv9);

        ebc_tv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/1zYEySYQCFk");
            }
        });

        ebc_tv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yEORAFhQiIs");
            }
        });

        ebc_tv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/yfaqfSAzwrs");
            }
        });

        ebc_tv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/Hbmj6QWjCyE");
            }
        });

        ebc_tv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/tftkLqUJO9o");
            }
        });

        ebc_tv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/RHmhMMEvYao");
            }
        });

        ebc_tv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/GvmJ6pZ73oI");
            }
        });

        ebc_tv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/ir5kb43Y9KU");
            }
        });

        ebc_tv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://youtu.be/TfFtUj_AQLc");
            }
        });
    }
    private void gotoUrl(String s) {
        Uri uri=Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
}
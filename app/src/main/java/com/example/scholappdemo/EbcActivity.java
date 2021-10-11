package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class EbcActivity extends AppCompatActivity {

    ListView listebc;
    TextView nextebc;
    ImageButton arrowebc;
    String[] doc={"College Admission Confirmation Letter","Leaving Certificate","12th Mark Sheet/Diploma Mark Sheet",
            "10th Mark Sheet","Last Year all Semester Mark Sheets","Student Domicile Certificate","Father Original Income Certificate\n(Valid up to current year March)\nNote:- Only Tahsildar Income Certificate are Valid 16th No.\nForm, IT Return & Any Other Income Certificate are NOT VALID",
            "Father Death Certificate\n(If Income Certificate Mother or Parent Name)","Aadhar Card(Xerox)","Student Bank Account Pass Book Xerox",
            "Gap Certificate(If Applicable)","Ration Card","Fees Receipt","Declaration Form","All Documents should be True Copy(Attested)"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ebc);

        listebc=findViewById(R.id.list_ebc);
//        nextebc=findViewById(R.id.next_ebc);
        arrowebc=findViewById(R.id.ebc_arrow);

        ArrayAdapter<String> adaptersc = new ArrayAdapter<String>(EbcActivity.this, android.R.layout.simple_dropdown_item_1line,doc);
        listebc.setAdapter(adaptersc);

//        nextebc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(EbcActivity.this,EbcProcedureActivity.class);
//                startActivity(intent);
//            }
//        });

        arrowebc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EbcActivity.this,EbcProcedureActivity.class);
                startActivity(intent);
            }
        });


    }
}
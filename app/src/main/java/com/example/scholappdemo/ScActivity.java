package com.example.scholappdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;

public class ScActivity extends AppCompatActivity {

    ListView listsc;
    TextView next;
    ImageButton arrowsc;
    String[] doc={"College Admission Confirmation Letter","Leaving Certificate","12th Mark Sheet/\nDiploma Mark Sheet",
            "10th Mark Sheet","Last Year all Semester Mark Sheets","Student Domicile Certificate","Father Original Certificate\n(Valid up to current year March)\n Note:- Only Tahsildar Income Certificate are Valid 16th No.\n Form, IT Return & Any Other Income Certificate are NOT VALID",
            "Father Death Certificate\n(If Income Certificate Mother or Parent Name)","Aadhar Card(Xerox)","Student Bank Account Pass Book Xerox",
            "Gap Certificate(If Applicable)","Caste Certificate","Caste Validity","Ration Card","Fees Receipt","Declaration Form","All Documents should be True Copy(Attested)"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sc);

        listsc=findViewById(R.id.list_sc);

        arrowsc=findViewById(R.id.sc_arrow);

        ArrayAdapter<String> adaptersc = new ArrayAdapter<String>(ScActivity.this, android.R.layout.simple_dropdown_item_1line,doc);
        listsc.setAdapter(adaptersc);

//        next.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(ScActivity.this,ScProcedureActivity.class);
//                startActivity(intent);
//            }
//        });

        arrowsc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ScActivity.this,ScProcedureActivity.class);
                startActivity(intent);
            }
        });



    }
}
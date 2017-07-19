package com.training.sahil.resumemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AcademicActivity extends AppCompatActivity {

    Button acadinfodone;
    EditText name10,name12,namecollege,degree10,degree12,degreecollege,marks10,marks12,markscollege,year10,year12,yearcollege,deptcollege;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_academic);


        acadinfodone=(Button)findViewById(R.id.acadinfodone);
        name10=(EditText)findViewById(R.id.name10);
        name12=(EditText)findViewById(R.id.name12);
        namecollege=(EditText)findViewById(R.id.namecollege);
        year10=(EditText)findViewById(R.id.year10);
        year12=(EditText)findViewById(R.id.year12);
        yearcollege=(EditText)findViewById(R.id.yearcollege);
        marks10=(EditText)findViewById(R.id.marks10);
        marks12=(EditText)findViewById(R.id.marks12);
        markscollege=(EditText)findViewById(R.id.markscollege);
        degree10=(EditText)findViewById(R.id.degree10);
        degree12=(EditText)findViewById(R.id.degree12);
        degreecollege=(EditText)findViewById(R.id.degreecollege);
        deptcollege=(EditText)findViewById(R.id.deptcollege);



        Bundle bundle=getIntent().getExtras();
        String result1=bundle.getString("key1");
        String result2=bundle.getString("key2");
        String result3=bundle.getString("key3");
        String result4=bundle.getString("key4");
        String result5=bundle.getString("key5");
        String result6=bundle.getString("key6");
        final String result7=result1+"\n"+result3+"\n"+result4+"\n"+result5+"\n"+result2+"\n"+result6;



        acadinfodone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(AcademicActivity.this, "Resume Updated\nNow Enter All Your Work Experience", Toast.LENGTH_LONG).show();




                Intent i=new Intent(AcademicActivity.this,WorkActivity.class);

                i.putExtra("key20", result7);

                i.putExtra("key21", "Certificate : " + degree10.getText().toString());
                i.putExtra("key22", "School Name : " + name10.getText().toString());
                i.putExtra("key23", "Percentage Scored : " + marks10.getText().toString());
                i.putExtra("key24", "Year Of Passing : " + year10.getText().toString());
                i.putExtra("key25", "Certificate : " + degree12.getText().toString());
                i.putExtra("key26", "School Name : " + name12.getText().toString());
                i.putExtra("key27", "Percentage Scored : " + marks12.getText().toString());
                i.putExtra("key28", "Year Of Passing : " + year12.getText().toString());
                i.putExtra("key29", "Degree : " + degreecollege.getText().toString());
                i.putExtra("key291", "Department : " + deptcollege.getText().toString());
                i.putExtra("key292", "College Name : " + namecollege.getText().toString());
                i.putExtra("key293", "CGPA Scored : " + markscollege.getText().toString());
                i.putExtra("key294", "Year Of Passing : " + yearcollege.getText().toString());

                startActivity(i);



            }
        });


    }
}

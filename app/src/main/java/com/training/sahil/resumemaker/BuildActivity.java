package com.training.sahil.resumemaker;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.training.sahil.resumemaker.R.id.name;

public class BuildActivity extends Activity {

    Button mainmenubtn,see;
    EditText entryid;
    UserDbHelper userdbhelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build);

        mainmenubtn=(Button)findViewById(R.id.mainmenubtn);
        see=(Button)findViewById(R.id.see);
        entryid=(EditText)findViewById(R.id.entryid);

        mainmenubtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1=new Intent(BuildActivity.this,MainActivity.class);
                startActivity(i1);

            }
        });



        see.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Bundle bundle=getIntent().getExtras();


                String contactDetails=bundle.getString("key20");
                String academicDetails=bundle.getString("key30");
                String workDetails=bundle.getString("key40");
                String projectDetails=bundle.getString("key50");
                String skillDetails=bundle.getString("key60");
                String result61=bundle.getString("key61");
                String result62=bundle.getString("key62");
                String result63=bundle.getString("key63");
                String achievementDetails=result61+"\n"+result62+"\n"+result63;




                userdbhelper = new UserDbHelper(BuildActivity.this);
                db = userdbhelper.getWritableDatabase();

                boolean response = userdbhelper.insertData(contactDetails,academicDetails,workDetails,projectDetails,skillDetails,achievementDetails,entryid.getText().toString(),db);

                if (response == true) {
                    Toast.makeText(BuildActivity.this, "Data Inserted", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(BuildActivity.this, "Some errors occur while insertion", Toast.LENGTH_LONG).show();
                }



                Intent i=new Intent(BuildActivity.this,Build1Activity.class);
                i.putExtra("contact", contactDetails);
                i.putExtra("academic", academicDetails);
                i.putExtra("work", workDetails);
                i.putExtra("project", projectDetails);
                i.putExtra("skills", skillDetails);
                i.putExtra("achievements", achievementDetails);


                startActivity(i);
            }
        });


    }
}

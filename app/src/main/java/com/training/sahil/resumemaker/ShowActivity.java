package com.training.sahil.resumemaker;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ShowActivity extends AppCompatActivity {

    TextView contactfinal,academicfinal,workfinal,projectfinal,skillsfinal,achievementfinal;

    UserDbHelper userdbhelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        contactfinal=(TextView)findViewById(R.id.contactinfo);
        workfinal=(TextView)findViewById(R.id.workinfo);
        academicfinal=(TextView)findViewById(R.id.academicinfo);
        projectfinal=(TextView)findViewById(R.id.projectinfo);
        skillsfinal=(TextView)findViewById(R.id.skillinfo);
        achievementfinal=(TextView)findViewById(R.id.achievementinfo);

        Bundle bundle=getIntent().getExtras();
        String entry=bundle.getString("key");



        userdbhelper = new UserDbHelper(ShowActivity.this);
        db = userdbhelper.getReadableDatabase();

        Cursor cursor = userdbhelper.searchData(db, entry);


        if (cursor.getCount() == 0) {
            Toast.makeText(this, "\t\t\t\t\t\t\t\t\t\t\tInvalid Code\n\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tor\n\nNo Resume With That Name Created", Toast.LENGTH_SHORT).show();

        } else {

            cursor.moveToFirst();


            String contact=cursor.getString(1);
            String academic=cursor.getString(2);
            String work=cursor.getString(3);
            String project=cursor.getString(4);
            String skills=cursor.getString(5);
            String achievements=cursor.getString(6);

            contactfinal.setText(contact);
            academicfinal.setText(academic);
            workfinal.setText(work);
            projectfinal.setText(project);
            skillsfinal.setText(skills);
            achievementfinal.setText(achievements);

        }

    }
}

package com.training.sahil.resumemaker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Build1Activity extends AppCompatActivity {

    TextView contactfinal,academicfinal,workfinal,projectfinal,skillsfinal,achievementfinal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_build1);

        contactfinal=(TextView)findViewById(R.id.contactinfo);
        workfinal=(TextView)findViewById(R.id.workinfo);
        academicfinal=(TextView)findViewById(R.id.academicinfo);
        projectfinal=(TextView)findViewById(R.id.projectinfo);
        skillsfinal=(TextView)findViewById(R.id.skillinfo);
        achievementfinal=(TextView)findViewById(R.id.achievementinfo);


        Bundle bundle=getIntent().getExtras();
        String result31=bundle.getString("contact");
        String result32=bundle.getString("academic");
        String result33=bundle.getString("work");
        String result34=bundle.getString("project");
        String result35=bundle.getString("skills");
        String result36=bundle.getString("achievements");


        contactfinal.setText(result31);
        academicfinal.setText(result32);
        workfinal.setText(result33);
        projectfinal.setText(result34);
        skillsfinal.setText(result35);
        achievementfinal.setText(result36);

    }
}

package com.training.sahil.resumemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AchievementActivity extends AppCompatActivity {

    Button achievementinfodone;
    EditText achievement,objective,curriculum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_achievement);

        achievementinfodone=(Button)findViewById(R.id.achievementinfodone);
        achievement=(EditText)findViewById(R.id.achievement);
        objective=(EditText)findViewById(R.id.objective);
        curriculum=(EditText)findViewById(R.id.curriculum);


        Bundle bundle=getIntent().getExtras();

        final String result20=bundle.getString("key20");
        final String result30=bundle.getString("key30");
        final String result40=bundle.getString("key40");
        final String result50=bundle.getString("key50");
        final String result60=bundle.getString("key51");



        achievementinfodone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(AchievementActivity.this, "Resume Updated\nNow Its Time To See Your Resume\nPress on the Button to See Your Resume.", Toast.LENGTH_LONG).show();



                Intent i=new Intent(AchievementActivity.this,BuildActivity.class);

                i.putExtra("key20", result20);
                i.putExtra("key30", result30);
                i.putExtra("key40", result40);
                i.putExtra("key50", result50);
                i.putExtra("key60", result60);

                i.putExtra("key61", "Achievements\n " + achievement.getText().toString() + "\n");
                i.putExtra("key62", "Objective\n " + objective.getText().toString() + "\n");
                i.putExtra("key63", "Curriculum\n " + curriculum.getText().toString() + "\n");

                startActivity(i);

            }
        });


    }
}

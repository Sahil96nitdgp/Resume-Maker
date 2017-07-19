package com.training.sahil.resumemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SkillActivity extends AppCompatActivity {

    EditText skilllist;
    Button skillinfodone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skill);

        skilllist=(EditText)findViewById(R.id.skilllist);
        skillinfodone=(Button)findViewById(R.id.skillinfodone);


        Bundle bundle=getIntent().getExtras();
        final String result20=bundle.getString("key20");
        final String result30=bundle.getString("key30");
        final String result40=bundle.getString("key40");
        String result41=bundle.getString("key41");
        String result42=bundle.getString("key42");
        String result43=bundle.getString("key43");
        String result44=bundle.getString("key44");
        String result45=bundle.getString("key45");
        final String result47=result41+"\n"+result42+"\n"+result43+"\n"+result44+"\n"+result45+"\n";


        skillinfodone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(SkillActivity.this, "Resume Updated\nNow Enter All Your Achievements", Toast.LENGTH_LONG).show();



                Intent i=new Intent(SkillActivity.this,AchievementActivity.class);

                i.putExtra("key20", result20);
                i.putExtra("key30", result30);
                i.putExtra("key40", result40);
                i.putExtra("key50", result47);

                i.putExtra("key51", skilllist.getText().toString());

                startActivity(i);


            }
        });

    }
}

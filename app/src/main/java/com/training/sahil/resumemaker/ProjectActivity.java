package com.training.sahil.resumemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ProjectActivity extends AppCompatActivity {

    Button projectinfodone;
    EditText projecttitle,size,expertise,role,description;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project);

        projectinfodone=(Button)findViewById(R.id.projectinfodone);
        size=(EditText)findViewById(R.id.size);
        expertise=(EditText)findViewById(R.id.expertise);
        projecttitle=(EditText)findViewById(R.id.projecttitle);
        role=(EditText)findViewById(R.id.role);
        description=(EditText)findViewById(R.id.description);



        Bundle bundle=getIntent().getExtras();

        final String result20=bundle.getString("key20");
        final String result30=bundle.getString("key30");
        String result31=bundle.getString("key31");
        String result32=bundle.getString("key32");
        String result33=bundle.getString("key33");
        String result34=bundle.getString("key34");
        String result35=bundle.getString("key35");
        String result36=bundle.getString("key36");
        final String result37=result31+"\n"+result32+"\n"+result33+"\n"+result34+"\n"+result35+"\n"+result36;


        projectinfodone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ProjectActivity.this, "Resume Updated\nNow Enter All Your Skills", Toast.LENGTH_LONG).show();



                Intent i=new Intent(ProjectActivity.this,SkillActivity.class);


                i.putExtra("key20",result20);
                i.putExtra("key30",result30);
                i.putExtra("key40",result37);

                i.putExtra("key41", "Project Title : " + projecttitle.getText().toString());
                i.putExtra("key42", "Role : " + role.getText().toString());
                i.putExtra("key43", "Team Size : " + size.getText().toString());
                i.putExtra("key44", "Expertise : " + expertise.getText().toString());
                i.putExtra("key45", "Description : \n" + description.getText().toString());


                startActivity(i);

            }
        });

    }
}

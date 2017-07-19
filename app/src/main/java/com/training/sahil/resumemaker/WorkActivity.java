package com.training.sahil.resumemaker;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class WorkActivity extends Activity {

    Button workinfodone;
    EditText org,position,duration,respo,salary,location;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work);

        workinfodone=(Button)findViewById(R.id.workinfodone);
        org=(EditText)findViewById(R.id.org);
        position=(EditText)findViewById(R.id.position);
        respo=(EditText)findViewById(R.id.respo);
        duration=(EditText)findViewById(R.id.duration);
        salary=(EditText)findViewById(R.id.salary);
        location=(EditText)findViewById(R.id.location);





        Bundle bundle=getIntent().getExtras();
        final String result20=bundle.getString("key20");
        String result21=bundle.getString("key21");
        String result22=bundle.getString("key22");
        String result23=bundle.getString("key23");
        String result24=bundle.getString("key24");
        String result25=bundle.getString("key25");
        String result26=bundle.getString("key26");
        String result27=bundle.getString("key27");
        String result28=bundle.getString("key28");
        String result29=bundle.getString("key29");
        String result291=bundle.getString("key291");
        String result292=bundle.getString("key292");
        String result293=bundle.getString("key293");
        String result294=bundle.getString("key294");
        final String result295="\n\n                         10th STANDARD\n\n"+result21+"\n"+result22+"\n"+result23+"\n"+result24+"\n\n                         12th STANDARD\n\n"+result25+"\n"+result26+"\n"+result27+"\n"+result28+"\n\n                         GRADUATION\n\n"+result29+"\n"+result291+"\n"+result292+"\n"+result293+"\n"+result294+"\n";



        workinfodone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(WorkActivity.this, "Resume Updated\nNow Enter All Your Project Info", Toast.LENGTH_LONG).show();



                Intent i=new Intent(WorkActivity.this,ProjectActivity.class);
                i.putExtra("key20", result20);
                i.putExtra("key30", result295);
                i.putExtra("key31", "Organization Name : " + org.getText().toString());
                i.putExtra("key32", "Position : " + position.getText().toString());
                i.putExtra("key33", "Duration : " + duration.getText().toString());
                i.putExtra("key34", "Location : " + location.getText().toString());
                i.putExtra("key35", "Salary Per Month : " + salary.getText().toString());
                i.putExtra("key36", "Job Responsibility : " + respo.getText().toString());


                startActivity(i);


            }
        });

    }

}

package com.training.sahil.resumemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    Button welcome,build,view,del;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        welcome=(Button)findViewById(R.id.welcome);
        build=(Button)findViewById(R.id.build);
        view=(Button)findViewById(R.id.view);
        del=(Button)findViewById(R.id.del);


        welcome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Thanks For Using This App\nFollow the Guidelines and Create the best Resume", Toast.LENGTH_SHORT).show();

            }
        });

        build.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Please Fill The Details", Toast.LENGTH_SHORT).show();
                Intent i=new Intent(MainActivity.this,ContactActivity.class);
                startActivity(i);

            }
        });


        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,ShowEntryActivity.class);
                startActivity(i);


            }
        });


        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,DeleteEntryActivity.class);
                startActivity(i);

            }
        });

    }
}

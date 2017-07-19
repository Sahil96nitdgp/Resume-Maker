package com.training.sahil.resumemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ShowEntryActivity extends AppCompatActivity {

    EditText entry;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_entry);

        entry=(EditText)findViewById(R.id.entry);
        btn=(Button)findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(ShowEntryActivity.this, ShowActivity.class);
                i.putExtra("key",entry.getText().toString());
                startActivity(i);

            }
        });
    }
}

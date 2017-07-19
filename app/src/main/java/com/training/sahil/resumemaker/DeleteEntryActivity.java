package com.training.sahil.resumemaker;

import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteEntryActivity extends AppCompatActivity {

    Button del;
    EditText entry;
    UserDbHelper userdbhelper;
    SQLiteDatabase db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_entry);

        del=(Button)findViewById(R.id.del);
        entry=(EditText)findViewById(R.id.entry);

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                userdbhelper = new UserDbHelper(DeleteEntryActivity.this);
                db = userdbhelper.getWritableDatabase();
                int id = Integer.parseInt(entry.getText().toString());
                int num_rows = userdbhelper.deleteData(db, id);

                if(num_rows>0){
                    Toast.makeText(DeleteEntryActivity.this, "Deletion Successful", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(DeleteEntryActivity.this, "Deletion not successful\n\n\t\t\t\t\tInvalid Code", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}

package com.training.sahil.resumemaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class ContactActivity extends AppCompatActivity {

    Button contactinfodone;
    EditText name,contact,email,address,gender,dob;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        contactinfodone=(Button)findViewById(R.id.contactinfodone);
        name=(EditText)findViewById(R.id.name);
        contact=(EditText)findViewById(R.id.contact);
        email=(EditText)findViewById(R.id.email);
        address=(EditText)findViewById(R.id.address);
        gender=(EditText)findViewById(R.id.gender);
        dob=(EditText)findViewById(R.id.dob);



        contactinfodone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(ContactActivity.this, "Resume Updated\nNow Enter All Your Academic Info", Toast.LENGTH_LONG).show();


                Intent i=new Intent(ContactActivity.this, AcademicActivity.class);

                i.putExtra("key1", "Name : " + name.getText().toString());
                i.putExtra("key2", "Email : " + email.getText().toString());
                i.putExtra("key3", "Gender : " + gender.getText().toString());
                i.putExtra("key4", "Date Of Birth : " + dob.getText().toString());
                i.putExtra("key5", "Contact Number : " + contact.getText().toString());
                i.putExtra("key6", "Address : " + address.getText().toString());

                startActivity(i);
            }
        });



    }
}

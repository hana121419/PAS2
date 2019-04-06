package com.example.pas;


import android.os.Bundle;
import android.support.annotation.NonNull;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class AddM extends AppCompatActivity {
    TextView textView10,textView11,textView12,textView13,textView15,textView14;
    EditText name,type;
    Button Done;
    FirebaseDatabase database;
    DatabaseReference ref;
    Manager m;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_m);


        textView10= findViewById(R.id.textView10);
        textView11= findViewById(R.id.textView11);

        textView12= findViewById(R.id.textView12);
        textView13= findViewById(R.id.textView13);
        textView15= findViewById(R.id.textView15);
        textView14= findViewById(R.id.textView14);
        name=  findViewById(R.id.addtreat);
        type=  findViewById(R.id.typetreat);
        Done= findViewById(R.id.Done);
        database=FirebaseDatabase.getInstance();
        ref=database.getReference("Manager");
        m=new Manager();

    }
    private void getValues(){
        m.setName(name.getText().toString());
        m.setType(type.getText().toString());
    }
    public void Done(View view){


        ref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                getValues();
                ref.child("medicine").setValue(m);
                Toast.makeText(AddM.this," تمت الاضافة" ,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {

            }
        });
    }


}
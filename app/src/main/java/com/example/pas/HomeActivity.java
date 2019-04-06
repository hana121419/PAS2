package com.example.pas;

import android.content.Intent;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;


import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;

public class HomeActivity extends AppCompatActivity {
    Button LiveV, MCall,information;
    Button  Settings;
    TextView Pname,  H, T;

    ImageView Pphoto;
    TableLayout MList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        MCall=findViewById( R.id.MCall);
        information=findViewById( R.id.information );

        LiveV=findViewById( R.id.liveV );
        Settings= findViewById( R.id.Settings);
        Pname= findViewById( R.id.Pname);
        H= findViewById( R.id.H);
        T= findViewById( R.id.T);
        Pphoto= findViewById( R.id.Pphoto);
        MList= findViewById( R.id.MList );


    }
    //Live Vedio
    public void LiveVedio(View V){
        Intent i = new Intent(this, LiveVedio.class);
        startActivity(i);
        finish();
    }
    //make call
    public void MCall(View V){
        Intent i = new Intent(this, MCall.class);
        startActivity(i);
        finish();
    }
    //information
    public void information(View V){
        Intent i = new Intent(this, information.class);
        startActivity(i);
        finish();
    }
    //Settings
    public void Settings(View V){
        Intent i = new Intent(this, Settings.class);
        startActivity(i);
        finish();
    }

}

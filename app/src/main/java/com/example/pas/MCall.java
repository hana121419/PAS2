package com.example.pas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;

public class MCall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mcall);



    }

    public void dial(View V) {


        EditText ed = (EditText) findViewById(R.id.phoneNumInp);

        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + ed.getText().toString()));
        startActivity(intent);

    }

}

package com.group5.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView titlepage, subtitlepage, text;
    Button btnexercise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        titlepage = (TextView) findViewById(R.id.titlepage);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        btnexercise = (Button) findViewById(R.id.btnexercise);
        text = (TextView) findViewById(R.id.text);


    }
    public void start(View view) {
        Intent intent = new Intent ( this, nextpage.class);
        startActivity(intent);
    }


}
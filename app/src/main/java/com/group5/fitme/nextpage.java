package com.group5.fitme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class nextpage extends AppCompatActivity{

    Button btnexercise1, btnexercise2, btnexercise3, btnexercise4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextpage);

        btnexercise1 = (Button) findViewById(R.id.btnexercise1);
        btnexercise2 = (Button) findViewById(R.id.btnexercise2);
        btnexercise3 = (Button) findViewById(R.id.btnexercise3);
        btnexercise4 = (Button) findViewById(R.id.btnexercise4);
    }

    public void btnExer1(View view) {
        Intent intent = new Intent ( this, btn1.class);
        startActivity(intent);
    }
    public void btnExer2(View view) {
        Intent intent = new Intent ( this, btn2.class);
        startActivity(intent);
    }
    public void btnExer3(View view) {
        Intent intent = new Intent ( this, btn3.class);
        startActivity(intent);
    }
    public void btnExer4(View view) {
        Intent intent = new Intent ( this, btn4.class);
        startActivity(intent);
    }
}
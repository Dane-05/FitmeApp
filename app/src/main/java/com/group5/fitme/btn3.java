package com.group5.fitme;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class btn3 extends AppCompatActivity {
    TextView titlepage, subtitlepage;
    View divpage;
    Button btntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn3);

        titlepage = (TextView) findViewById(R.id.titlepage);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        divpage = (View) findViewById(R.id.divpage);
        btntry = (Button) findViewById(R.id.btntry);
    }

    public void enter(View view) {
        AlertDialog.Builder builder= new AlertDialog.Builder(btn3.this);

        builder.setMessage("Are you sure?")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(btn3.this,Timer.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", null);
        AlertDialog alert =  builder.create();
        alert.show();
    }
}
package com.group5.fitme;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static androidx.core.os.LocaleListCompat.create;

public class btn1 extends AppCompatActivity {
    TextView titlepage, subtitlepage;
    View divpage;
    Button btntry;
    private Button btnAlertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_btn1);
        btnAlertDialog = findViewById(R.id.btntry);

        titlepage = (TextView) findViewById(R.id.titlepage);
        subtitlepage = (TextView) findViewById(R.id.subtitlepage);
        divpage = (View) findViewById(R.id.divpage);
        btntry = (Button) findViewById(R.id.btntry);
        }


    public void enter(View view) {

                AlertDialog.Builder builder= new AlertDialog.Builder(btn1.this);

        builder.setMessage("Are you sure?")
                .setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(btn1.this,Timer.class);
                        startActivity(intent);
                    }
                })
                .setNegativeButton("Cancel", null);
        AlertDialog alert =  builder.create();
        alert.show();
        }
    }
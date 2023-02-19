package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {
    private Button length;
    private Button time;
    private Button weight;
    private Button temp;
    private Button speed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        getSupportActionBar().setTitle("UNIT CONVERSION");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        length = (Button) findViewById(R.id.length);
        weight = (Button) findViewById(R.id.weight);
        temp = (Button) findViewById(R.id.temp);
        speed = (Button) findViewById(R.id.speed);

        length.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, length.class);
                startActivity(intent);


            }


        });

        temp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, temperature.class);
                startActivity(intent);


            }


        });

        speed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, speed.class);
                startActivity(intent);


            }


        });

        weight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity2.this, weight.class);
                startActivity(intent);


            }


        });
}}

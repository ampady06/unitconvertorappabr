package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class temperature extends AppCompatActivity {
    TextView output;
    TextView output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);
        getSupportActionBar().setTitle("CONVERSION OF TEMPERATURE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void con8(View v){
        output=(TextView)findViewById(R.id.o2);
        EditText first8 = findViewById(R.id.i2);
        Button convert8 = findViewById(R.id.button8);
        String a8 = first8.getText().toString();
        Double val8 = Double.parseDouble(a8);
        Double conv8 =  273.15 + val8;
        output.setText(String.valueOf(conv8));
        output2=(TextView)findViewById(R.id.textView7);
        output2.setText("celsius to kelvin");


    }

    public void con2(View v){
        output=(TextView)findViewById(R.id.o2);
        EditText first2 = findViewById(R.id.i2);
        Button convert2 = findViewById(R.id.button9);
        String a2 = first2.getText().toString();
        Double val2 = Double.parseDouble(a2);
        Double conv2 = -273.15 + val2;
        output.setText(String.valueOf(conv2));
        output2=(TextView)findViewById(R.id.textView7);
        output2.setText("kelvin to celsius");


    }

    public void con3(View v){
        output=(TextView)findViewById(R.id.o2);
        EditText first3 = findViewById(R.id.i2);
        Button convert3 = findViewById(R.id.button10);
        String a3 = first3.getText().toString();
        Double val3 = Double.parseDouble(a3);
        Double conv3 =  32 + (val3 *1.8);
        output.setText(String.valueOf(conv3));
        output2=(TextView)findViewById(R.id.textView7);
        output2.setText("celcius to farenheit");


    }

    public void con4(View v){
        output=(TextView)findViewById(R.id.o2);
        EditText first4 = findViewById(R.id.i2);
        Button convert4 = findViewById(R.id.button11);
        String a4 = first4.getText().toString();
        Double val4 = Double.parseDouble(a4);
        Double conv4 = 0.556 * (val4 - 32);
        output.setText(String.valueOf(conv4));
        output2=(TextView)findViewById(R.id.textView7);
        output2.setText("fahrenheit to celsius");


    }

    public void con5(View v){
        output=(TextView)findViewById(R.id.o2);
        EditText first5 = findViewById(R.id.i2);
        Button convert5 = findViewById(R.id.button12);
        String a5 = first5.getText().toString();
        Double val5 = Double.parseDouble(a5);
        Double conv5 =32 + ((val5-273.15) *1.8);
        output.setText(String.valueOf(conv5));
        output2=(TextView)findViewById(R.id.textView7);
        output2.setText("kelvin to fahrenheit");


    }

    public void con6(View v){
        output=(TextView)findViewById(R.id.o2);
        EditText first6 = findViewById(R.id.i2);
        Button convert6 = findViewById(R.id.button13);
        String a6 = first6.getText().toString();
        Double val6 = Double.parseDouble(a6);
        Double conv6 = (0.556 * (val6 - 32)) + 273.15;
        output.setText(String.valueOf(conv6));
        output2=(TextView)findViewById(R.id.textView7);
        output2.setText("fahrenheit to kelvin");


    }
}
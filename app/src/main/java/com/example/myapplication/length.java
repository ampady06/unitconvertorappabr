package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class length extends AppCompatActivity  {
    TextView output;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        getSupportActionBar().setTitle("CONVERSION OF LENGTH");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

    public void con(View v){
        output=(TextView)findViewById(R.id.output);
        EditText first = findViewById(R.id.input);
        Button convert = findViewById(R.id.button2);
        String a = first.getText().toString();
        Double val = Double.parseDouble(a);
            Double conv = 39.37 * val;
            output.setText(String.valueOf(conv));

    }

    public void con2(View v){
        output=(TextView)findViewById(R.id.output);
        EditText first2 = findViewById(R.id.input);
        Button convert2 = findViewById(R.id.button3);
        String a2 = first2.getText().toString();
        Double val2 = Double.parseDouble(a2);
        Double conv2 = 0.0254 * val2;
        output.setText(String.valueOf(conv2));

    }

    public void con3(View v){
        output=(TextView)findViewById(R.id.output);
        EditText first3 = findViewById(R.id.input);
        Button convert3 = findViewById(R.id.button4);
        String a3 = first3.getText().toString();
        Double val3 = Double.parseDouble(a3);
        Double conv3 = 0.3048 * val3;
        output.setText(String.valueOf(conv3));

    }

    public void con4(View v){
        output=(TextView)findViewById(R.id.output);
        EditText first4 = findViewById(R.id.input);
        Button convert4 = findViewById(R.id.button5);
        String a4 = first4.getText().toString();
        Double val4 = Double.parseDouble(a4);
        Double conv4 = 3.28084 * val4;
        output.setText(String.valueOf(conv4));

    }

    public void con5(View v){
        output=(TextView)findViewById(R.id.output);
        EditText first5 = findViewById(R.id.input);
        Button convert5 = findViewById(R.id.button5);
        String a5 = first5.getText().toString();
        Double val5 = Double.parseDouble(a5);
        Double conv5 = 0.0833333 * val5;
        output.setText(String.valueOf(conv5));

    }

    public void con6(View v){
        output=(TextView)findViewById(R.id.output);
        EditText first6 = findViewById(R.id.input);
        Button convert6 = findViewById(R.id.button5);
        String a6 = first6.getText().toString();
        Double val6 = Double.parseDouble(a6);
        Double conv6 = 12 * val6;
        output.setText(String.valueOf(conv6));

    }


}
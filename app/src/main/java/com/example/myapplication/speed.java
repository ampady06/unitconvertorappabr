package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class speed extends AppCompatActivity {
    TextView output;
    TextView output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        getSupportActionBar().setTitle("CONVERSION OF SPEED");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void con(View v){
        output=(TextView)findViewById(R.id.o3);
        EditText first = findViewById(R.id.i3);
        Button convert = findViewById(R.id.button14);
        String a = first.getText().toString();
        Double val = Double.parseDouble(a);
        Double conv = 0.277778 * val;
        output.setText(String.valueOf(conv));
        output2=(TextView)findViewById(R.id.textView5);
        output2.setText("km/hr to m/s");

    }

    public void con2(View v){
        output=(TextView)findViewById(R.id.o3);
        EditText first2 = findViewById(R.id.i3);
        Button convert2 = findViewById(R.id.button15);
        String a2 = first2.getText().toString();
        Double val2 = Double.parseDouble(a2);
        Double conv2 = 3.6 * val2;
        output.setText(String.valueOf(conv2));
        output2=(TextView)findViewById(R.id.textView5);
        output2.setText("m/s to km/hr");

    }
}
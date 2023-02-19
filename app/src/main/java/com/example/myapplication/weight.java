package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class weight extends AppCompatActivity {
    TextView output;
    TextView output2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        getSupportActionBar().setTitle("CONVERSION OF WEIGHT");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void con(View v){
        output=(TextView)findViewById(R.id.o4);
        EditText first = findViewById(R.id.i4);
        Button convert = findViewById(R.id.button17);
        String a = first.getText().toString();
        Double val = Double.parseDouble(a);
        Double conv = 0.00110231 * val;
        output.setText(String.valueOf(conv));
        output2=(TextView)findViewById(R.id.textView4);
        output2.setText("kg to tons");

    }

    public void con2(View v){
        output=(TextView)findViewById(R.id.o4);
        EditText first2 = findViewById(R.id.i4);
        Button convert2 = findViewById(R.id.button20);
        String a2 = first2.getText().toString();
        Double val2 = Double.parseDouble(a2);
        Double conv2 = 907.185 * val2;
        output.setText(String.valueOf(conv2));
        output2=(TextView)findViewById(R.id.textView4);
        output2.setText("tons to kg");

    }

    public void con3(View v){
        output=(TextView)findViewById(R.id.o4);
        EditText first3 = findViewById(R.id.i4);
        Button convert3 = findViewById(R.id.button21);
        String a3 = first3.getText().toString();
        Double val3 = Double.parseDouble(a3);
        Double conv3 = 2.20462 * val3;
        output.setText(String.valueOf(conv3));
        output2=(TextView)findViewById(R.id.textView4);
        output2.setText("kg to pound");

    }

    public void con4(View v){
        output=(TextView)findViewById(R.id.o4);
        EditText first4 = findViewById(R.id.i4);
        Button convert4 = findViewById(R.id.button19);
        String a4 = first4.getText().toString();
        Double val4 = Double.parseDouble(a4);
        Double conv4 = 0.453592 * val4;
        output.setText(String.valueOf(conv4));
        output2=(TextView)findViewById(R.id.textView4);
        output2.setText("pound to kg");

    }

    public void con5(View v){
        output=(TextView)findViewById(R.id.o4);
        EditText first5 = findViewById(R.id.i4);
        Button convert5 = findViewById(R.id.button18);
        String a5 = first5.getText().toString();
        Double val5 = Double.parseDouble(a5);
        Double conv5 = 0.0005 * val5;
        output.setText(String.valueOf(conv5));
        output2=(TextView)findViewById(R.id.textView4);
        output2.setText("pound to ton");

    }

    public void con6(View v){
        output=(TextView)findViewById(R.id.o4);
        EditText first6 = findViewById(R.id.i4);
        Button convert6 = findViewById(R.id.button16);
        String a6 = first6.getText().toString();
        Double val6 = Double.parseDouble(a6);
        Double conv6 = 2000 * val6;
        output.setText(String.valueOf(conv6));
        output2=(TextView)findViewById(R.id.textView4);
        output2.setText("ton to pound");

    }
}
package com.example.firstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText t1,t2;
    TextView res;

EditText edt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        t1 = (EditText) findViewById(R.id.t1);
        t2 = (EditText) findViewById(R.id.t2);
        res = (Button) findViewById(R.id.result);

    }
    public void process (View view){
        double n1 = Double.parseDouble(t1.getText().toString());
        double n2 =  Double.parseDouble(t2.getText().toString());
        double finalres = n1+n2;


        res.setText("Sum : "+finalres);

    }
}


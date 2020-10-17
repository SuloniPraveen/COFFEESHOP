package com.example.coffeeshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity<espcoffee, cappcoffee, filcoffee> extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //create references
        final EditText esp = findViewById(R.id.esp);
        final EditText capp = findViewById(R.id.capp);
        final Button calbt = findViewById(R.id.calbt);
        final TextView result = findViewById(R.id.result);
        //create on clicklistner
        calbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int espcoffee = Integer.parseInt(esp.getText().toString());
                int cappcoffee = Integer.parseInt(esp.getText().toString());
                int filcoffee = Integer.parseInt(esp.getText().toString());
                /* read user input */
                int total = (espcoffee * 150) + (cappcoffee * 200) + (filcoffee * 60);
                String result1;
                result1 = "Total amt is RS" + total;
                result.setText(result1);
            }

        });
    }}


package com.romanjandas.calculatorwithsteps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button brb,blb,bdi,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bmu,bpl,bmi,beq,bde;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        brb=findViewById(R.id.button2);
        blb=findViewById(R.id.button3);
        b1=findViewById(R.id.button22);
        b2=findViewById(R.id.button21);
        b3=findViewById(R.id.button20);
        b4=findViewById(R.id.button18);
        b5=findViewById(R.id.button17);
        b6=findViewById(R.id.button16);
        b7=findViewById(R.id.button14);
        b8=findViewById(R.id.button13);
        b9=findViewById(R.id.button12);
        b0=findViewById(R.id.button9);
        bdi=findViewById(R.id.button6);
        bmu=findViewById(R.id.button19);
        bpl=findViewById(R.id.button15);
        bmi=findViewById(R.id.button11);
        beq=findViewById(R.id.button7);
        bde=findViewById(R.id.button8);

        brb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input(')');
                textView.setText(StringFormation.input_string);
            }
        });
        blb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('(');
                textView.setText(StringFormation.input_string);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('1');
                textView.setText(StringFormation.input_string);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('2');
                textView.setText(StringFormation.input_string);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('3');
                textView.setText(StringFormation.input_string);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('4');
                textView.setText(StringFormation.input_string);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('5');
                textView.setText(StringFormation.input_string);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('6');
                textView.setText(StringFormation.input_string);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('7');
                textView.setText(StringFormation.input_string);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('8');
                textView.setText(StringFormation.input_string);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('9');
                textView.setText(StringFormation.input_string);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('0');
                textView.setText(StringFormation.input_string);
            }
        });
        bpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('+');
                textView.setText(StringFormation.input_string);
            }
        });
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('-');
                textView.setText(StringFormation.input_string);
            }
        });
        bdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('/');
                textView.setText(StringFormation.input_string);
            }
        });
        bmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('x');
                textView.setText(StringFormation.input_string);
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('=');
                if(!StringFormation.result.equals("")){
                    textView.setText(StringFormation.result);
                }
            }
        });
        bde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('.');
                textView.setText(StringFormation.input_string);
            }
        });

    }


}
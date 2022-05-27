package com.romanjandas.calculatorwithsteps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2;
    Button brb,blb,bdi,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bmu,bpl,bmi,beq,bde,del,clear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        textView2=findViewById(R.id.textView2);
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
        del=findViewById(R.id.button4);
        clear=findViewById(R.id.button10);

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.no_key_pressed=true;
                StringFormation.allow=false;
                StringFormation.input_string="";
                EvaluateString.steps="";
                textView.setText("");
                textView2.setText("");
            }
        });

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(StringFormation.input_string.length()!=0){
                    if(StringFormation.input_string.charAt(StringFormation.input_string.length()-1)=='(' && StringFormation.lbn>0){
                        StringFormation.lbn=StringFormation.lbn-1;
                    }
                    if(StringFormation.input_string.charAt(StringFormation.input_string.length()-1)==')' && StringFormation.rbn>0){
                        StringFormation.rbn=StringFormation.rbn-1;
                    }
                    StringFormation.input_string=StringFormation.input_string.substring(0,StringFormation.input_string.length()-1);
                    if(StringFormation.input_string.length()==0){
                        StringFormation.no_key_pressed=true;
                        StringFormation.allow=false;
                        StringFormation.rbn=0;StringFormation.lbn=0;
                    }
                    if(StringFormation.input_string.length()>1){
                        StringFormation.p=StringFormation.input_string.charAt(StringFormation.input_string.length()-1);
                    }

                    textView.setText(StringFormation.input_string);
                }
            }
        });

        brb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input(')');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        blb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('(');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('1');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('2');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('3');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('4');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('5');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('6');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('7');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('8');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('9');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('0');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        bpl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('+');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        bmi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('-');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        bdi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('/');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        bmu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('x');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('=');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                if(!StringFormation.result.equals("")){
                    //textView.setText(StringFormation.result);
                    textView.setText(StringFormation.input_string);
                    textView2.setText(EvaluateString.steps);
                    EvaluateString.steps="";
                }
            }
        });
        bde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringFormation.verify_input('.');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                textView.setText(StringFormation.input_string);
            }
        });

    }


}
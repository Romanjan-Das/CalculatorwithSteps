package com.romanjandas.calculatorwithsteps;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    TextView textView,textView2;
    Button brb,blb,bdi,b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bmu,bpl,bmi,beq,bde,del,clear;
    FloatingActionButton show_steps;
    private static String OldInput="",tooLarge="Number too large",temp_step="";
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
        show_steps=findViewById(R.id.floatingActionButton);
        show_steps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams layoutParams=new LinearLayout.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
                layoutParams.gravity= Gravity.TOP;
                textView2.setText(temp_step);
            }
        });

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
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
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
                else{
                    makeTextBig(false);
                }
                textView.setText(StringFormation.input_string);
            }
        });
        beq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                OldInput=StringFormation.input_string;
                StringFormation.verify_input('=');
                if(!StringFormation.allow){
                    Toast.makeText(MainActivity.this, "wrong input", Toast.LENGTH_SHORT).show();
                }
                else{
                    makeTextBig(true);
                    temp_step=EvaluateString.steps;
                    textView2.setText(OldInput);

                }
                if(!StringFormation.result.equals("")){
                    //textView.setText(StringFormation.result);
                    if(EvaluateString.number_too_large){
                        textView.setText(tooLarge);

                        StringFormation.no_key_pressed=true;
                        StringFormation.allow=false;
                        StringFormation.input_string="";
                        EvaluateString.steps="";
                        textView2.setText("");

                        EvaluateString.number_too_large=false;
                    }
                    else{
                        textView.setText(StringFormation.input_string);
                    }
                    EvaluateString.steps="";
                    StringFormation.equal_is_pressed=true;
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
                else{
                    makeTextBig(false);
                }
                textView.setText(StringFormation.input_string);
            }
        });

    }

    private void makeTextBig(boolean big){
        int x;
        if(EvaluateString.number_too_large){
            x=tooLarge.length();
        }
        else{
            x=StringFormation.input_string.length();
        }
        if(x<9){
            if(big){
                textView.setTextSize(50);
            }
            if(!big){
                textView.setTextSize(28);
            }
        }
        else if(x>8 && x<18){
                textView.setTextSize(28);
        }
        else if(x>17 && x<22){
            textView.setTextSize(24);
        }
        else if(x>21 && x<26){
            textView.setTextSize(20);
        }
        else if(x>25 && x<30){
            textView.setTextSize(16);
        }
        else{
            textView.setTextSize(12);
        }

        int y=OldInput.length();
        if(y<28){
            textView2.setTextSize(16);
        }
        else{
            textView2.setTextSize(42-y);
        }
    }


}
package com.romanjandas.calculatorwithsteps;

import android.util.Log;

public class EvaluateString{
        private static final char PLUS='+';
        private static final char MINUS='-';
        private static final char DIVIDE='/';
        private static final char MULTIPLY='x';
        private static final char LEFTBRACKET='(';
        private static final char RIGHTBRACKET=')';

        private static String process_string="";
        private static String temp_string="initial_random_string";
        private static String answer="";
        private static String left_of_equation="";
        private static String right_of_equation="";
        private static String temp_equation="random_temp_equation";

        public static String steps="";
  
    public static String evaluate_string(String s){
        while(!temp_equation.equals(s)){
            temp_equation=s;

            Log.d("mytag", "\nstep 1: " + s);
            process_string=look_for_brackets(s);

            Log.d("mytag", "step 3: " + process_string);
            process_of_evaluation_of_simple_string();
            s=left_of_equation+answer+right_of_equation;
            left_of_equation="";right_of_equation="";
            Log.d("mytag", "step 4: " + answer);
            Log.d("mytag", "step 5: " + s);
            steps=steps+"\n"+s;
            if(answer.equals(s)){
                break;
            }
        }    
        return s;
    }

    private static void process_of_evaluation_of_simple_string(){
        while(temp_string!=process_string){
            temp_string=process_string;
            checkForMultiplyOrDivisionSign(process_string);        
        }
        process_string=simplifyString(process_string);
        add_or_subtract(process_string);
    }

    private static void checkForMultiplyOrDivisionSign(String s){
        int m=0;
        while(m<s.length()){
            if(DIVIDE==s.charAt(m)){
                divide_or_multiply(m,true);
                break;
            }
            if(MULTIPLY==s.charAt(m)){
                divide_or_multiply(m,false);
                break;
            }
            m++;
        }
    }

    private static void divide_or_multiply(int i,boolean operator){
        int k,l; String leftString="",rightString="",leftOfResult="",rightOfResult=""; double leftNumber,rightNumber,resultNumber;
        int j=i;
        j=j-1;
        while(true){
            leftString=process_string.charAt(j)+leftString;
            j=j-1;
            if((j==-1) || process_string.charAt(j)==MINUS || process_string.charAt(j)==PLUS || process_string.charAt(j)==MULTIPLY || process_string.charAt(j)==DIVIDE){    
                k=j;
                break;
            }
        }
        j=i;
        j=j+1;
        while(true){
            rightString=rightString+process_string.charAt(j);
            j=j+1;
            if(j==process_string.length()){ 
                l=j-1;
                break;
            }
            if(process_string.charAt(j)==MINUS || process_string.charAt(j)==PLUS || process_string.charAt(j)==MULTIPLY || process_string.charAt(j)==DIVIDE){
                l=j;
                break;
            }
        }
        while(l<process_string.length()){
            rightOfResult=rightOfResult+process_string.charAt(l);
            l++;
        }

        while(k>-1){
            leftOfResult=process_string.charAt(k)+leftOfResult;
            k=k-1;
        }
        leftNumber=Double.parseDouble(leftString);
        rightNumber=Double.parseDouble(rightString);
        if(operator){
            resultNumber=leftNumber/rightNumber;
                    process_string=leftOfResult+String.format("%.5f",resultNumber)+rightOfResult;

        }
        if(!operator){
            resultNumber=leftNumber*rightNumber;
                    process_string=leftOfResult+String.format("%.5f",resultNumber)+rightOfResult;

        }
    }

    private static String simplifyString(String s){
        int i=0; String tempString="";
        while(i<s.length()){
            if(s.charAt(i)==PLUS && s.charAt(i+1)==MINUS){
                tempString=tempString+"-";
                i=i+2;
            }
            else if(s.charAt(i)==MINUS && s.charAt(i+1)==MINUS){
                tempString=tempString+"+";
                i=i+2;
            }
            else{
                tempString=tempString+s.charAt(i);
                i++;
            }
            
        }
        return tempString;
    }

    private static void add_or_subtract(String s){
        int i=s.length()-1; String str=""; double num=0;
        while(i!=-1){
            str=s.charAt(i)+str;
            if(MINUS==s.charAt(i) || PLUS==s.charAt(i) || i==0){
                num=Double.parseDouble(str)+num;
                str="";
            }
            i=i-1;
        }
        answer=String.format("%.2f",num);
    }

    private static String look_for_brackets(String s){
        int leftBracketPosition=0,rightBracketPosition=0,i=0;
        String s1="";
        while(true){
            if(i<s.length()){
                if(LEFTBRACKET==s.charAt(i)){
                    leftBracketPosition=i;
                }
                else if(RIGHTBRACKET==s.charAt(i)){
                    rightBracketPosition=i;
                    s1=separate_the_string(leftBracketPosition,rightBracketPosition,s);
                    break;
                }

            }
            else{
                s1=s;
                break;
            }
            i++;
        }
        return s1;
    }

    private static String separate_the_string(int a,int b,String s){
        String midStr="",leftStr="",rightStr="",evalStr="",joinedStr="";
        int i=0,j=b+1;
        while(i<a){
            leftStr=leftStr+s.charAt(i);
            i++;
        }
        while(j<s.length()){
            rightStr=rightStr+s.charAt(j);
            j++;
        }
        while(a<b-1){
            a++;
            midStr=midStr+s.charAt(a);
        }
        Log.d("mytag", "step 2: " + leftStr + "   " + midStr + "   " + rightStr);
        left_of_equation=leftStr;
        right_of_equation=rightStr;
        return midStr;
    }
    
}
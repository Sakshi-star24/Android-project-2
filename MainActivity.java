package com.example.calculate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6;
    EditText et1,et2,et3;
    String s1=null;
    String s2=null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.btn1);
        b2=findViewById(R.id.btn2);
        b3=findViewById(R.id.btn3);
        b4=findViewById(R.id.btn4);
        b5=findViewById(R.id.btn5);
        b6=findViewById(R.id.btn6);
        et1=findViewById(R.id.et1);
        et2=findViewById(R.id.et2);
        et3=findViewById(R.id.et3);
    }
    public void add(View v){
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        int a=0,b=0;
        if(s1==null && s2!=null) {
            a = 0;
            b = Integer.parseInt(s2);
        }
        else if(s2==null && s1!=null) {
            a = Integer.parseInt(s1);
            b = 0;
        }
        else if(s1==null && s2==null){
            a=0;
            b=0;
        }
        else {
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
        }
        int c=a+b;
        String s=String.valueOf(c);
        et3.setText(s);
    }
    public void sub(View v){
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        int a=0,b=0;
        if(s1==null && s2!=null) {
            a = 0;
            b = Integer.parseInt(s2);
        }
        else if(s2==null && s1!=null) {
            a = Integer.parseInt(s1);
            b = 0;
        }
        else if(s1==null && s2==null){
            a=0;
            b=0;
        }
        else {
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
        }
        int c=a-b;
        String s=String.valueOf(c);
        et3.setText(s);
    }
    public void mult(View v){
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        int a=0,b=0;
        if(s1==null && s2!=null) {
            a = 0;
            b = Integer.parseInt(s2);
        }
        else if(s2==null && s1!=null) {
            a = Integer.parseInt(s1);
            b = 0;
        }
        else if(s1==null && s2==null){
            a=0;
            b=0;
        }
        else {
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
        }
        int c=a*b;
        String s=String.valueOf(c);
        et3.setText(s);
    }
    public void div(View v){
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        float a=0,b=0;
        if(s1==null && s2!=null) {
            a = 0;
            b = Float.parseFloat(s2);
        }
        else if(s2==null && s1!=null) {
            a = Float.parseFloat(s1);
            b = 0;
        }
        else if(s1==null && s2==null){
            a=0;
            b=0;
        }
        else {
            a = Float.parseFloat(s1);
            b = Float.parseFloat(s2);
        }
        float c=a/b;
        String s=String.valueOf(c);
        et3.setText(s);
    }
    public void mode(View v){
        String s1=et1.getText().toString();
        String s2=et2.getText().toString();
        int a=0,b=0;
        if(s1==null && s2!=null) {
            a = 0;
            b = Integer.parseInt(s2);
        }
        else if(s2==null && s1!=null) {
            a = Integer.parseInt(s1);
            b = 0;
        }
        else if(s1==null && s2==null){
            a=0;
            b=0;
        }
        else {
            a = Integer.parseInt(s1);
            b = Integer.parseInt(s2);
        }
        int c=a%b;
        String s=String.valueOf(c);
        et3.setText(s);
    }
    public void clear(View v){
        et1.setText(null);
        et2.setText(null);
        et3.setText(null);
    }
}

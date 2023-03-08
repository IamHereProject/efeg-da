package com.furkanozek.efegida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Fenerbahçe(){
        System.out.println("FB<3");
    }

    public void bet(){
        System.out.println("KG OYNA!");
    }
    public void fb(){
        System.out.println("valenciaaaaaaa");
    }
}
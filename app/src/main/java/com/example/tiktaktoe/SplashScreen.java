package com.example.tiktaktoe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        Intent i = new Intent(this,MainActivity.class);
        new Thread(){
            public void run(){
                try {
                    sleep(2000);
                }catch (Exception e){

                }
                startActivity(i);
                finish();
            }
        }.start();
    }
}
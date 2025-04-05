package com.example.drivesmart;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Activity_splash_screen extends AppCompatActivity {

    private ImageView appLogo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);
        appLogo = findViewById(R.id.appLogo);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.first_animation);
        appLogo.setAnimation(animation);
            new Thread(){
                public void run(){
                    try {
                        sleep(2000);
                        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(intent);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }.start();
        }
    }

package com.example.drivesmart;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Context;
import android.content.Intent;

import android.net.ConnectivityManager;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.google.firebase.auth.FirebaseAuth;



public class MainActivity extends AppCompatActivity {


    private FirebaseAuth mAuth;
    Context context;


    private boolean isConnected(){
        ConnectivityManager connectivityManager = (ConnectivityManager) getApplicationContext().getSystemService(context.CONNECTIVITY_SERVICE);
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnectedOrConnecting();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CardView cvStartTest = findViewById(R.id.cvStartTest);
        CardView cvTrophy = findViewById(R.id.cvLogo);
        CardView cvBook = findViewById(R.id.cvBook);
        ImageView cvRules = findViewById(R.id.cvRules);
        cvStartTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isConnected()) {
                    startActivity(new Intent(MainActivity.this, TestOptionActivity.class));
                }else {
                    startActivity(new Intent(MainActivity.this, NoInternet.class));
                }
            }
        });
        cvTrophy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isConnected()) {
                    startActivity(new Intent(MainActivity.this, Trophies.class));
                } else {
                    startActivity(new Intent(MainActivity.this, NoInternet.class));
                }
            }
        });
        cvBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,BookActivity.class));
            }
        });
        cvRules.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,RulesActivity.class));
            }
        });

    }
}

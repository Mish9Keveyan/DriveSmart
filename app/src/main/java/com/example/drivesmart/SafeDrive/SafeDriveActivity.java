package com.example.drivesmart.SafeDrive;

import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.example.drivesmart.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class SafeDriveActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safe_drive);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        SharedPreferences save = getSharedPreferences("Save",MODE_PRIVATE);
        final int level = save.getInt("Level3", 1);

        CardView cvLevel1 = findViewById(R.id.cvLevel1);
        TextView cv1 = findViewById(R.id.newDrive);
        ImageView lockLevel1 = findViewById(R.id.lockLevel1);
        ConstraintLayout constraintLayout1 = findViewById(R.id.ConstraintLayout1);

        ImageView One = findViewById(R.id.imageView11);

        constraintLayout1.setBackgroundColor(Color.WHITE);
        cv1.setTextColor(Color.BLACK);
        lockLevel1.setVisibility(View.GONE);


        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference One1 = database.getReference("Levels/Two");


        One1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                Picasso.get().load(value).into(One);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        findViewById(R.id.imageViewQuizOption).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        cvLevel1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SafeDriveActivity.this, SafeDrive1.class));
                finish();
            }
        });
    }
}

package com.example.drivesmart;


import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class Trophies extends AppCompatActivity {
    View v11,v12,v13,v14,v21,v22,v23,v24,v31,v32,v33,v34,v41,v42,v43,v44;
    TextView TV1,TV2,TV3,TV4;
    ImageView TrafficSigns,Balance,FirstHelp,Crossroads,a1,a2,a3,a4;
    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trophies);
        findViewById(R.id.imageViewQuizOption).setOnClickListener(view -> finish());
        SharedPreferences save = getSharedPreferences("Save",MODE_PRIVATE);
        final int level = save.getInt("Level", 1);
        final int level2 = save.getInt("Level2",1);
        final int level3 = save.getInt("Level3",1);
        final int level4 = save.getInt("Level4",1);

        v11 = findViewById(R.id.v11);v12 = findViewById(R.id.v12);v13 = findViewById(R.id.v13);v14 = findViewById(R.id.v14);
        v21 = findViewById(R.id.v21);v22 = findViewById(R.id.v22);v23 = findViewById(R.id.v23);v24 = findViewById(R.id.v24);
        v31 = findViewById(R.id.v31);
        v41 = findViewById(R.id.v41);v42 = findViewById(R.id.v42);v43 = findViewById(R.id.v43);v44 = findViewById(R.id.v44);
        TV1 = findViewById(R.id.TV1);TV2 = findViewById(R.id.TV2);TV3 = findViewById(R.id.TV3);TV4 = findViewById(R.id.TV4);
        TrafficSigns = findViewById(R.id.imageView10);
        Crossroads = findViewById(R.id.imageView11);
        FirstHelp = findViewById(R.id.imageView12);
        Balance = findViewById(R.id.imageView13);
        a1 = findViewById(R.id.korona1);
        a2 = findViewById(R.id.korona2);
        a3 = findViewById(R.id.korona3);
        a4 = findViewById(R.id.korona4);
        ProgressBar progressBar = findViewById(R.id.progressBar2);
        CardView cvTrafficSigns = findViewById(R.id.cvTrafficSigns);
        CardView cvCrossroads = findViewById(R.id.cvCrossroads);
        CardView cvFirstHelp = findViewById(R.id.cvFirst_help);
        CardView cvBalance = findViewById(R.id.cvLaw);
        TextView textView1 = findViewById(R.id.textView3);
        TextView textView2 = findViewById(R.id.textView4);
        TextView textView3 = findViewById(R.id.textView5);
        TextView textView4 = findViewById(R.id.textView6);
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference Traffic_Signs68 = database.getReference("Traffic Signs");
        DatabaseReference Crossroads69 = database.getReference("Crossroads");
        DatabaseReference FirstHelp70 = database.getReference("FirstHelp");
        DatabaseReference Balance71 = database.getReference("Balance");

        Traffic_Signs68.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                if (progressBar != null) {
                    progressBar.setVisibility(View.GONE);
                    String value = snapshot.getValue(String.class);
                    Picasso.get().load(value).into(TrafficSigns);
                }
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
        Crossroads69.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                Picasso.get().load(value).into(Crossroads);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
        FirstHelp70.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                Picasso.get().load(value).into(FirstHelp);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
        Balance71.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                Picasso.get().load(value).into(Balance);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });
        cvTrafficSigns.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick (View view){
                    if (level >= 5){
                        Toast.makeText(Trophies.this, "Поздравляю вы прошли тест Дорожние знаки", Toast.LENGTH_SHORT).show();
                    }else {
                        Toast.makeText(Trophies.this, "Пройдите тесты, чтобы получить трофеи", Toast.LENGTH_SHORT).show();
                    }
            }
            
        });
        cvCrossroads.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level2 >= 5){
                Toast.makeText(Trophies.this, "Поздравляю вы прошли тест Перекресток", Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(Trophies.this, "Пройдите тесты, чтобы получить трофеи", Toast.LENGTH_SHORT).show();
            }}
        });
        cvFirstHelp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level3 >= 2) {
                    Toast.makeText(Trophies.this, "Поздравляю вы прошли тест \nБезопасность дорожного движения", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Trophies.this, "Пройдите тесты, чтобы получить трофеи", Toast.LENGTH_SHORT).show();
                }
            }
        });
        cvBalance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (level4 >= 5) {
                    Toast.makeText(Trophies.this, "Поздравляю вы прошли тест \nЗакон дорожного движения", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(Trophies.this, "Пройдите тесты, чтобы получить трофеи", Toast.LENGTH_SHORT).show();
                }
            }
        });

        if (level >= 2) {
            v11.setBackgroundResource(R.color.bg_color);
            TV1.setTextColor(getResources().getColor(R.color.bg_color));
            TV1.setText("25%");
        }
        if (level >= 3) {
            v12.setBackgroundResource(R.color.bg_color);
            TV1.setTextColor(getResources().getColor(R.color.bg_color));
            TV1.setText("50%");
        }
        if (level >= 4) {
            v13.setBackgroundResource(R.color.bg_color);
            TV1.setTextColor(getResources().getColor(R.color.bg_color));
            TV1.setText("75%");
        }
        if (level >= 5) {
            v11.setBackgroundResource(R.color.white);
            v12.setBackgroundResource(R.color.white);
            v13.setBackgroundResource(R.color.white);
            v14.setBackgroundResource(R.color.white);
            TV1.setText("100%");
            TV1.setTextColor(getResources().getColor(R.color.white));
            textView1.setTextColor(getResources().getColor(R.color.white));
            cvTrafficSigns.setBackgroundResource(R.color.Gold);
            Picasso.get()
                    .load("https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/a.png?alt=media&token=0f2496fb-d2ef-433e-a3de-f79d7c653e6c")
                    .into(a1);
        }

        if (level2 >= 2) {
            v21.setBackgroundResource(R.color.bg_color);
            TV2.setTextColor(getResources().getColor(R.color.bg_color));
            TV2.setText("25%");
        }
        if (level2 >= 3) {
            v22.setBackgroundResource(R.color.bg_color);
            TV2.setTextColor(getResources().getColor(R.color.bg_color));
            TV2.setText("50%");
        }
        if (level2 >= 4) {
            v23.setBackgroundResource(R.color.bg_color);
            TV2.setTextColor(getResources().getColor(R.color.bg_color));
            TV2.setText("75%");
        }
        if (level2 >= 5) {
            v21.setBackgroundResource(R.color.white);
            v22.setBackgroundResource(R.color.white);
            v23.setBackgroundResource(R.color.white);
            v24.setBackgroundResource(R.color.white);
            TV2.setText("100%");
            TV2.setTextColor(getResources().getColor(R.color.white));
            textView2.setTextColor(getResources().getColor(R.color.white));
            cvCrossroads.setBackgroundResource(R.color.Gold);
            Picasso.get()
                    .load("https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/a.png?alt=media&token=0f2496fb-d2ef-433e-a3de-f79d7c653e6c")
                    .into(a2);
        }

        if (level3 >= 2) {
            v31.setBackgroundResource(R.color.white);
            TV3.setText("100%");
            TV3.setTextColor(getResources().getColor(R.color.white));
            textView3.setTextColor(getResources().getColor(R.color.white));
            cvFirstHelp.setBackgroundResource(R.color.Gold);
            Picasso.get()
                    .load("https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/a.png?alt=media&token=0f2496fb-d2ef-433e-a3de-f79d7c653e6c")
                    .into(a3);
        }

        if (level4 >= 2) {
            v41.setBackgroundResource(R.color.bg_color);
            TV4.setTextColor(getResources().getColor(R.color.bg_color));
            TV4.setText("25%");
        }
        if (level4 >= 3) {
            v42.setBackgroundResource(R.color.bg_color);
            TV4.setTextColor(getResources().getColor(R.color.bg_color));
            TV4.setText("50%");
        }
        if (level4 >= 4) {
            v43.setBackgroundResource(R.color.bg_color);
            TV4.setTextColor(getResources().getColor(R.color.bg_color));
            TV4.setText("75%");
        }
        if (level4 >= 5) {
            v41.setBackgroundResource(R.color.white);
            v42.setBackgroundResource(R.color.white);
            v43.setBackgroundResource(R.color.white);
            v44.setBackgroundResource(R.color.white);
            TV4.setText("100%");
            TV4.setTextColor(getResources().getColor(R.color.white));
            textView4.setTextColor(getResources().getColor(R.color.white));
            cvBalance.setBackgroundResource(R.color.Gold);
            Picasso.get()
                    .load("https://firebasestorage.googleapis.com/v0/b/drive-smart-b1101.appspot.com/o/a.png?alt=media&token=0f2496fb-d2ef-433e-a3de-f79d7c653e6c")
                    .into(a4);
        }
    }
}
package com.example.drivesmart.CrossRoads;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drivesmart.R;
import com.example.drivesmart.TestOptionActivity;

public class Result2 extends AppCompatActivity {

    TextView txtCorrectText;
    TextView txtPercentText;
    private int totalQuestions;
    private int finalScore;
    private int PercentScore2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result2);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

        txtCorrectText = findViewById(R.id.correct_textview);
        txtPercentText = findViewById(R.id.percent_textview);
        TextView uwu = findViewById(R.id.uwu);
        Button res = findViewById(R.id.b1);
        Button menu = findViewById(R.id.ktestam);

        Intent intent = getIntent();
        totalQuestions = intent.getIntExtra("totalQuestions",0);
        finalScore = intent.getIntExtra("finalScore",0);

        PercentScore2 = finalScore * 100/ totalQuestions;

        txtPercentText.setText(String.format("%s%%",Integer.toString(Integer.valueOf(PercentScore2))));

        @SuppressLint("StringFormatMatches") String final_Score_Text = getString(R.string.txtCorrectScore,finalScore,totalQuestions);

        txtCorrectText.setText(final_Score_Text);
        if (PercentScore2 > 69){
            menu.setBackgroundColor(getResources().getColor(R.color.Right));
            uwu.setText("Поздравляю, вы прошли!");
        }else {
            res.setBackgroundColor(getResources().getColor(R.color.Incorrect));
            uwu.setText("Вы не прошли тестирование");
        }
    }


    public void restartGame(View view) {
        Intent intent = getIntent();
        String level = intent.getStringExtra("level2");
        if (level != null && level.equals("first1")) {
            Intent intent_first = new Intent(Result2.this, CrossRoads1.class);
            startActivity(intent_first);
        } else if (level != null && level.equals("second1")) {
            Intent intent_second = new Intent(Result2.this, CrossRoads2.class);
            startActivity(intent_second);
        }else if (level != null && level.equals("third1")) {
            Intent intent_third = new Intent(Result2.this, CrossRoads3.class);
            startActivity(intent_third);
        }else if (level != null && level.equals("fourth1")) {
            Intent intent_third = new Intent(Result2.this, CrossRoads4.class);
            startActivity(intent_third);
        }
        finish();
    }

    public void goToMenu(View view) {
        Intent intent = getIntent();
        String level = intent.getStringExtra("level2");
        if (level != null && level.equals("first1")) {
            SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
            final int level11 = save.getInt("Level2", 1);
            if (!(level11 > 1) && PercentScore2 > 69) {
                SharedPreferences.Editor editor = save.edit();
                editor.putInt("Level2", 2);
                editor.apply();
            }
        } else if (level != null && level.equals("second1")) {
            SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
            final int level12 = save.getInt("Level2", 2);
            if (!(level12 > 2) && PercentScore2 > 69) {
                SharedPreferences.Editor editor = save.edit();
                editor.putInt("Level2", 3);
                editor.apply();
            }
        } else if (level != null && level.equals("third1")) {
            SharedPreferences save= getSharedPreferences("Save", MODE_PRIVATE);
            final int level13 = save.getInt("Level2", 3);
            if (!(level13 > 3) && PercentScore2 > 69) {
                SharedPreferences.Editor editor = save.edit();
                editor.putInt("Level2", 4);
                editor.apply();
            }
        } else if (level != null && level.equals("fourth1")) {
            SharedPreferences save = getSharedPreferences("Save", MODE_PRIVATE);
            final int level14 = save.getInt("Level2", 4);
            if (!(level14 > 4) && PercentScore2 > 69) {
                SharedPreferences.Editor editor = save.edit();
                editor.putInt("Level2", 5);
                editor.apply();
            }
        }
        startActivity(new Intent(Result2.this, TestOptionActivity.class));
        finish();
    }
}
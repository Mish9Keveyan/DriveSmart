package com.example.drivesmart.CrossRoads;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drivesmart.R;
import com.google.firebase.database.FirebaseDatabase;
import com.squareup.picasso.Picasso;

public class CrossRoads3 extends AppCompatActivity {

    final RadioButton[] rb1 = new RadioButton[3];
    private ImageView mTestImage;

    private String mAnswer;
    private int correctAnswerIndex;

    private int mScore = 0;
    private int mTestNum = 1;
    private int QuestionNum = 0;
    private TextView mQuestionView;
    private TextView mTestNumView;

    private Questions2 Questions13 = new Questions2();
    String Coorectanswers13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cross_roads1);

        FirebaseDatabase database = FirebaseDatabase.getInstance();

        mQuestionView = findViewById(R.id.question_textview);
        mTestNumView = findViewById(R.id.quiznum);

        updateQuestion();

        Button next = findViewById(R.id.button_next);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean isAnyRadioButtonNotEmpty = false;
                for (RadioButton rb : rb1) {
                    if (rb.isChecked()) {
                        isAnyRadioButtonNotEmpty = true;
                        break;
                    }
                }
                if (isAnyRadioButtonNotEmpty) {
                    if (Questions13.getType13(QuestionNum) == "radiobutton") {
                        next.setVisibility(View.GONE);
                        if (Questions13.getCoorectAnswers13(QuestionNum).equals(mAnswer)) {
                            mScore++;
                        }
                    }
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            if (QuestionNum == Questions13.getLenght13() - 1) {
                                Intent intent_result = new Intent(CrossRoads3.this, Result2.class);
                                intent_result.putExtra("totalQuestions", Questions13.getLenght13());
                                intent_result.putExtra("finalScore", mScore);
                                intent_result.putExtra("level2", "third1");
                                startActivity(intent_result);
                                QuestionNum = 0;
                                mScore = 0;
                                mTestNum = 1;
                                finish();
                            } else {
                                QuestionNum++;
                                mTestNum++;
                                updateQuestion();
                            }
                        }
                    }, 550);
                } else {
                    Toast.makeText(CrossRoads3.this, "Выберите правильный ответ", Toast.LENGTH_SHORT).show();
                }
            }
        });

        findViewById(R.id.imageViewQuizOption).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void displayToastCorrectAnswer() {

        Toast.makeText(this, "Правильно", Toast.LENGTH_SHORT).show();

    }

    private void displayToastWrongAnswer() {
        Toast.makeText(this, "Неверно", Toast.LENGTH_SHORT).show();
    }

    private void updateQuestion() {
        LinearLayout answer_layout = findViewById(R.id.answers_layout);
        answer_layout.removeAllViews();
        mAnswer = "";
        findViewById(R.id.button_next).setBackgroundColor(findViewById(R.id.button_next).getContext().getResources().getColor(R.color.bg_color));

        mTestNumView.setText(mTestNum + "/" + String.valueOf(Questions13.getLenght13()));
        mQuestionView.setText(Questions13.getQuestions13(QuestionNum));

        if (Questions13.getType13(QuestionNum).equals("radiobutton")) {
            findViewById(R.id.button_next).setVisibility(View.VISIBLE);
            showRadioButtonAnswers(QuestionNum);
        }

        showMainImage();
    }

    private void showMainImage() {
        mTestImage = findViewById(R.id.question_image);

        String imgUrl = Questions13.getImages13(QuestionNum);

        Picasso.get().load(imgUrl).into(mTestImage);
    }

    private void showRadioButtonAnswers(int anum) {
        final LinearLayout answerLayout = findViewById(R.id.answers_layout);

        RadioGroup rg = new RadioGroup(this);
        rg.setOrientation(RadioGroup.VERTICAL);

        LinearLayout.LayoutParams lp = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT);

        rg.setLayoutParams(lp);
        rg.setPadding(40, 100, 40, 0);
        View topLineView = new View(this);
        topLineView.setBackgroundColor(Color.BLACK);
        LinearLayout.LayoutParams topLineParams = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                2
        );
        topLineView.setLayoutParams(topLineParams);
        rg.addView(topLineView, 0);

        rb1[0] = new RadioButton(this);
        rb1[1] = new RadioButton(this);
        rb1[2] = new RadioButton(this);

        for (int i = 0; i <= 2; i++) {
            rb1[i].setText(Questions13.getChoice13(anum)[i]);
            rb1[i].setTextColor(Color.BLACK);
            rb1[i].setPadding(10, 70, 8, 70);
            rb1[i].setTextSize(18);
            rb1[i].setId(i);
            rb1[i].setWidth(4000);
            rg.addView(rb1[i]);
            View lineView = new View(this);
            lineView.setBackgroundColor(Color.BLACK);
            LinearLayout.LayoutParams lineParams = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, 2);
            lineView.setLayoutParams(lineParams);
            rg.addView(lineView);

            if (Questions13.getCoorectAnswers13(anum).equals(Questions13.getChoice13(anum)[i])) {
                correctAnswerIndex = i;
            }
        }

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int Id) {
                mAnswer = Questions13.getChoice13(QuestionNum)[Id];
                displayCorrectAnswer();
            }
        });
        answerLayout.addView(rg);
    }

    private void displayCorrectAnswer() {
        for (int i = 0; i < rb1.length; i++) {
            rb1[i].setEnabled(false);
        }

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < rb1.length; i++) {
                    if (Questions13.getCoorectAnswers13(QuestionNum).equals(rb1[i].getText())) {
                        rb1[i].setButtonTintList(ColorStateList.valueOf(Color.GREEN));
                        if (rb1[i].isChecked()) {
                            displayToastCorrectAnswer();
                            rb1[i].setBackgroundResource(R.color.Right);
                            rb1[i].setTextColor(getResources().getColor(R.color.white));
                        }
                    } else {
                        if (rb1[i].isChecked()) {
                            rb1[i].setButtonTintList(ColorStateList.valueOf(Color.RED));
                            rb1[i].setBackgroundResource(R.color.Incorrect);
                            rb1[i].setTextColor(getResources().getColor(R.color.white));
                            displayToastWrongAnswer();
                        }
                    }
                }
            }
        }, 550);
    }
}
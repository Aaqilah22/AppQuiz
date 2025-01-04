package com.quiz; // Change this to your actual package name

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    private TextView textHi;
    private TextView text;
    private TextView button2;
    private ImageButton optionsBut;
    private TextView butQuiz1;
    private TextView butQuiz2;
    private ImageButton startQuiz1;
    private ImageButton startQuiz2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home); // Make sure this matches your XML file name

        // Initialize views
        textHi = findViewById(R.id.textHi);
        text = findViewById(R.id.text);
        button2 = findViewById(R.id.button2);
        optionsBut = findViewById(R.id.optionsBut);
        butQuiz1 = findViewById(R.id.butQuiz1);
        butQuiz2 = findViewById(R.id.butQuiz2);
        startQuiz1 = findViewById(R.id.startQuiz1);
        startQuiz2 = findViewById(R.id.startQuiz2);
        ImageButton imgButHome = findViewById(R.id.imgButHome);
        ImageButton imgButQuiz = findViewById(R.id.imgButQuiz);
        ImageButton imgButAccount = findViewById(R.id.textView7);

        // Set click listeners
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle button click
                // For example, start a new activity
                Intent intent = new Intent(HomeActivity.this, GradeActivity.class); // Change to your target activity
                startActivity(intent);
            }
        });

        optionsBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle options button click
                // For example, show options or settings
            }
        });

        startQuiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Quiz 1
                Intent intent = new Intent(HomeActivity.this, IsiQuizActivity.class); // Change to your Quiz1 activity
                startActivity(intent);
            }
        });

        startQuiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start Quiz 2
                Intent intent = new Intent(HomeActivity.this, QuizActivity.class); // Change to your Quiz2 activity
                startActivity(intent);
            }
        });
        // Set listener untuk ImageButton Home
        imgButHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi ketika tombol Home diklik
                // Misalnya, pindah ke aktivitas Home
                Intent intent = new Intent(HomeActivity.this, HomeActivity.class);
                startActivity(intent);
            }
        });

        // Set listener untuk ImageButton Quiz
        imgButQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi ketika tombol Quiz diklik
                // Misalnya, pindah ke aktivitas Quiz
                Intent intent = new Intent(HomeActivity.this, QuizActivity.class);
                startActivity(intent);
            }
        });

        // Set listener untuk ImageButton Account
        imgButAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Aksi ketika tombol Account diklik
                // Misalnya, pindah ke aktivitas Account
                Intent intent = new Intent(HomeActivity.this, AccountActivity.class);
                startActivity(intent);
            }
        });
    }
}
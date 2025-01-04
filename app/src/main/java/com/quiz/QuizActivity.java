package com.quiz; // Ganti dengan nama paket Anda

import android.content.Intent; // Untuk menggunakan Intent
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton; // Import ImageButton
import androidx.appcompat.app.AppCompatActivity;

public class QuizActivity extends AppCompatActivity {

    private ImageButton imagePanah; // Deklarasi ImageButton untuk panah
    private ImageButton startQuiz1; // Deklarasi ImageButton untuk mulai quiz 1
    private ImageButton startQuiz2; // Deklarasi ImageButton untuk mulai quiz 2
    private ImageButton imgButHome; // Deklarasi ImageButton untuk tombol Home
    private ImageButton imgButAccount; // Deklarasi ImageButton untuk tombol Account


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz); // Ganti dengan nama layout Anda

        // Inisialisasi ImageButton
        imagePanah = findViewById(R.id.imagePanah);
        startQuiz1 = findViewById(R.id.startQuiz1);
        startQuiz2 = findViewById(R.id.startQuiz2);
        imgButHome = findViewById(R.id.imgButHome); // Inisialisasi tombol Home
        imgButAccount = findViewById(R.id.imgButAccount); // Inisialisasi tombol Account


        // Set OnClickListener untuk ImageButton panah
        imagePanah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang dilakukan ketika tombol panah diklik
                finish(); // Mengakhiri aktivitas saat ini (kembali ke aktivitas sebelumnya)
            }
        });

        // Set OnClickListener untuk mulai Quiz 1
        startQuiz1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang dilakukan ketika tombol mulai quiz 1 diklik
                Intent intent = new Intent(QuizActivity.this, IsiQuizActivity.class); // Ganti dengan aktivitas quiz yang sesuai
                startActivity(intent);
            }
        });

        // Set OnClickListener untuk mulai Quiz 2
        startQuiz2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang dilakukan ketika tombol mulai quiz 2 diklik
                Intent intent = new Intent(QuizActivity.this, IsiQuizActivity.class); // Ganti dengan aktivitas quiz yang sesuai
                startActivity(intent);
            }
        });

        // Set OnClickListener untuk tombol Home
        imgButHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang dilakukan ketika tombol Home diklik
                Intent intent = new Intent(QuizActivity.this, HomeActivity.class); // Ganti dengan aktivitas Home yang sesuai
                startActivity(intent);
            }
        });

        // Set OnClickListener untuk tombol Account
        imgButAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang dilakukan ketika tombol Account diklik
                Intent intent = new Intent(QuizActivity.this, AccountActivity.class); // Ganti dengan aktivitas Account yang sesuai
                startActivity(intent);
            }
        });
    }
}
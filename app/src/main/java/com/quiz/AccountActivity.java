package com.quiz; // Ganti dengan nama paket Anda

import android.content.Intent; // Untuk menggunakan Intent
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast; // Untuk menampilkan pesan
import androidx.appcompat.app.AppCompatActivity;

public class AccountActivity extends AppCompatActivity {

    private ImageButton imgButHome; // Deklarasi ImageButton untuk home
    private ImageButton imgButQuiz; // Deklarasi ImageButton untuk quiz
    private ImageButton imgButAccount; // Deklarasi ImageButton untuk account
    private Button menuBut; // Deklarasi Button untuk menu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account); // Ganti dengan nama layout Anda

        // Inisialisasi ImageButton dan Button
        imgButHome = findViewById(R.id.imgButHome);
        imgButQuiz = findViewById(R.id.imgButQuiz);
        imgButAccount = findViewById(R.id.imgButAccount);
        menuBut = findViewById(R.id.menuBut);

        // Set OnClickListener untuk ImageButton home
        imgButHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this, HomeActivity.class); // Ganti dengan nama aktivitas home Anda
                startActivity(intent);
                finish(); // Mengakhiri aktivitas saat ini
            }
        });

        // Set OnClickListener untuk ImageButton quiz
        imgButQuiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(AccountActivity.this, QuizActivity.class); // Ganti dengan nama aktivitas quiz Anda
                startActivity(intent);
            }
        });

        // Set OnClickListener untuk ImageButton account
        imgButAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(AccountActivity.this, "Anda sudah berada di halaman akun.", Toast.LENGTH_SHORT).show();
            }
        });

        // Set OnClickListener untuk Button menu
        menuBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang dilakukan ketika tombol menu diklik
                Toast.makeText(AccountActivity.this, "Menu dibuka!", Toast.LENGTH_SHORT).show();
                // Anda dapat menambahkan logika tambahan di sini
            }
        });
    }
}
package com.quiz; // Ganti dengan nama paket Anda

import android.content.Intent; // Untuk menggunakan Intent
import android.graphics.Color; // Untuk menggunakan warna
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class IsiQuizActivity extends AppCompatActivity {

    private TextView pilihA; // Pilihan A
    private TextView pilihB; // Pilihan B
    private TextView pilihC; // Pilihan C
    private TextView pilihD; // Pilihan D
    private TextView submit;  // Tombol submit
    private String correctAnswer = "A"; // Jawaban yang benar
    private String selectedAnswer = ""; // Menyimpan jawaban yang dipilih
    private ImageButton imagePanah;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_quiz); // Ganti dengan nama layout Anda jika berbeda

        // Inisialisasi komponen UI
        pilihA = findViewById(R.id.pilihA);
        pilihB = findViewById(R.id.pilihB);
        pilihC = findViewById(R.id.pilihC);
        pilihD = findViewById(R.id.pilihD);
        submit = findViewById(R.id.submit);
        imagePanah = findViewById(R.id.imagePanah);

        // Set OnClickListener untuk pilihan A
        pilihA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnswer = "A"; // Simpan jawaban yang dipilih
                handleAnswer(selectedAnswer);
                resetColors(); // Reset warna pilihan lainnya
                pilihA.setTextColor(Color.GREEN); // Ubah warna teks pilihan A menjadi hijau
            }
        });

        // Set OnClickListener untuk pilihan B
        pilihB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnswer = "B"; // Simpan jawaban yang dipilih
                handleAnswer(selectedAnswer);
                resetColors(); // Reset warna pilihan lainnya
                pilihB.setTextColor(Color.GREEN); // Ubah warna teks pilihan B menjadi hijau
            }
        });

        // Set OnClickListener untuk pilihan C
        pilihC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnswer = "C"; // Simpan jawaban yang dipilih
                handleAnswer(selectedAnswer);
                resetColors(); // Reset warna pilihan lainnya
                pilihC.setTextColor(Color.GREEN); // Ubah warna teks pilihan C menjadi hijau
            }
        });

        // Set OnClickListener untuk pilihan D
        pilihD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedAnswer = "D"; // Simpan jawaban yang dipilih
                handleAnswer(selectedAnswer);
                resetColors(); // Reset warna pilihan lainnya
                pilihD.setTextColor(Color.GREEN); // Ubah warna teks pilihan D menjadi hijau
            }
        });

        // Set OnClickListener untuk tombol submit
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cek apakah ada jawaban yang dipilih sebelum berpindah ke GradeActivity
                if (!selectedAnswer.isEmpty()) {
                    Intent intent = new Intent(IsiQuizActivity.this, GradeActivity.class);
                    intent.putExtra("selectedAnswer", selectedAnswer); // Kirim jawaban yang dipilih ke GradeActivity
                    startActivity(intent);
                } else {
                    Toast.makeText(IsiQuizActivity.this, "Silakan pilih jawaban sebelum submit!", Toast.LENGTH_SHORT).show();
                }
            }
        });
            imagePanah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // Tindakan yang dilakukan ketika tombol diklik
                    // Misalnya, kembali ke aktivitas sebelumnya
                    finish(); // Mengakhiri aktivitas saat ini
                }
            });
        }

        private void handleAnswer(String selectedAnswer) {
        // Logika untuk memproses jawaban yang dipilih
        if (selectedAnswer.equals(correctAnswer)) {
            Toast.makeText(this, "Jawaban benar!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Jawaban salah. Coba lagi!", Toast.LENGTH_SHORT).show();
        }
    }

    private void resetColors() {
        // Reset warna semua pilihan ke warna default (misalnya, hitam)
        pilihA.setTextColor(Color.BLACK);
        pilihB.setTextColor(Color.BLACK);
        pilihC.setTextColor(Color.BLACK);
    }
}
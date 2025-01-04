package com.quiz; // Ganti dengan nama paket Anda

import android.content.Intent; // Untuk menggunakan Intent
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast; // Untuk menampilkan pesan
import androidx.appcompat.app.AppCompatActivity;

public class GradeActivity extends AppCompatActivity {

    private ImageButton imagePanah; // Deklarasi ImageButton untuk panah
    private TextView butSelesai; // Deklarasi TextView untuk tombol selesai
    private TextView butNilai; // Deklarasi TextView untuk menampilkan nilai

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade); // Ganti dengan nama layout Anda

        // Inisialisasi ImageButton dan TextView
        imagePanah = findViewById(R.id.imagePanah);
        butSelesai = findViewById(R.id.butSelesai);
        butNilai = findViewById(R.id.butNilai);

        // Set OnClickListener untuk ImageButton panah
        imagePanah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang dilakukan ketika tombol panah diklik
                Intent intent = new Intent(GradeActivity.this, HomeActivity.class); // Pastikan HomeActivity ada
                startActivity(intent);
                finish(); // Mengakhiri aktivitas saat ini
            }
        });

        // Set OnClickListener untuk TextView selesai
        butSelesai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Tindakan yang dilakukan ketika tombol selesai diklik
                Toast.makeText(GradeActivity.this, "Quiz selesai!", Toast.LENGTH_SHORT).show();
                // Anda dapat melakukan tindakan lain di sini, seperti menyimpan nilai atau berpindah ke aktivitas lain
            }
        });

        // Menampilkan nilai (misalnya, Anda bisa mengatur nilai dari aktivitas sebelumnya)
        butNilai.setText("100/100"); // Ganti dengan nilai yang sesuai
    }
}
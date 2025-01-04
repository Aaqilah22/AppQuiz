package com.quiz; // Ganti dengan package name Anda

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.quiz.SignInActivity;

public class MasukActivity extends AppCompatActivity {

    private TextView signInButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masuk); // Pastikan nama layout sesuai

        signInButton = findViewById(R.id.textView3);

        // Set onClickListener untuk tombol Sign In
        signInButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Ganti dengan activity tujuan Anda
                Intent intent = new Intent(MasukActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });
    }
}
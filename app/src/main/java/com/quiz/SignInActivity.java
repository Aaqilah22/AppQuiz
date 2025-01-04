package com.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SignInActivity extends AppCompatActivity {
    private UserDatabase userDatabase;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        userDatabase = new UserDatabase(this);

        EditText emailInput = findViewById(R.id.emailInput);
        EditText usernameInput = findViewById(R.id.usernameInput);
        EditText passwordInput = findViewById(R.id.passwordInput);
        Button createAccountButton = findViewById(R.id.creatBut);

        createAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString().trim();
                String username = usernameInput.getText().toString().trim();
                String password = passwordInput.getText().toString().trim();

                if (email.isEmpty() || username.isEmpty() || password.isEmpty()) {
                    Toast.makeText(SignInActivity.this, "All fields are required!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (userDatabase.isEmailRegistered(email)) {
                    Toast.makeText(SignInActivity.this, "Email already registered!", Toast.LENGTH_SHORT).show();
                } else {
                    boolean success = userDatabase.addUser(email, username, password);
                    if (success) {
                        Toast.makeText(SignInActivity.this, "Account created successfully!", Toast.LENGTH_SHORT).show();

                        // Pindah ke halaman Home
                        Intent intent = new Intent(SignInActivity.this, HomeActivity.class);
                        startActivity(intent);
                        finish(); // Mengakhiri aktivitas saat ini
                    } else {
                        Toast.makeText(SignInActivity.this, "Failed to create account.", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}

package com.quiz;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class CoverActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cover);

        // Delay for 3 seconds before navigating to MasukActivity
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                // Start MasukActivity
                Intent intent = new Intent(CoverActivity.this, MasukActivity.class);
                startActivity(intent);
                // Close CoverActivity
                finish();
            }
        }, 3000); // 3000 milliseconds = 3 seconds
    }
}

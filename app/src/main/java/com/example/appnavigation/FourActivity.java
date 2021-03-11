package com.example.appnavigation;

import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        Button button = findViewById(R.id.button_activity);
        button.setOnClickListener(v -> {
            finish();
        });
    }
}
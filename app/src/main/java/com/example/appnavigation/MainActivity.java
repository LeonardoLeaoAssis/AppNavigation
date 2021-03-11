package com.example.appnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("log", "onCreate A");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onRestart() {
        Log.i("log", "onRestart A");
        super.onRestart();
    }

    @Override
    protected void onStart() {
        Log.i("log", "onStart A");
        super.onStart();
    }

    @Override
    protected void onResume() {
        Log.i("log", "onResume A");
        super.onResume();
    }

    @Override
    protected void onPause() {
        Log.i("log", "onPause A");
        super.onPause();
    }

    @Override
    protected void onStop() {
        Log.i("log", "onStop A");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.i("log", "onDestroy A");
        super.onDestroy();
    }

}
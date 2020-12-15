package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run()
            {
                Intent intent = new Intent(MainActivity.this, Step1.class);
                startActivity(intent);
            }
        };
        timer.schedule(timerTask, 1000L);
    }
}
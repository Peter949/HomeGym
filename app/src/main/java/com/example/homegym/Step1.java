package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Step1 extends AppCompatActivity implements View.OnClickListener {
    ImageView i11;
    ImageView i9;
    Step2 qwe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step1);
        i11 = findViewById(R.id.imageView11);
        i9 = findViewById(R.id.imageView9);
        i11.setOnClickListener(this);
        i9.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.imageView11:

                break;
            case R.id.imageView9:

                break;
        }
        Intent intent = new Intent(this, Step2.class);
        startActivity(intent);
    }
}
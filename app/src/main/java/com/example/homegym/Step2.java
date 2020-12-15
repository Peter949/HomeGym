package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.solver.widgets.Helper;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Step2 extends AppCompatActivity implements View.OnClickListener {
    ImageView male;
    ImageView female;
    ImageView button;
    ImageView imageView;
    String checker;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step2);
        male = findViewById(R.id.imageView16);
        female = findViewById(R.id.imageView15);
        imageView = findViewById(R.id.imageView12);
        button = findViewById(R.id.imageView17);
        male.setOnClickListener(this);
        female.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.imageView16:

                Intent intentM = new Intent(this, Step3.class);
                startActivity(intentM);
                break;
            case R.id.imageView15:

                Intent intentF = new Intent(this, Step3_1.class);
                startActivity(intentF);
                break;
            default:
                Toast.makeText(getApplicationContext(), "Invalid",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
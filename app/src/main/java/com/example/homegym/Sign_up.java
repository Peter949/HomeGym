package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Sign_up extends AppCompatActivity implements View.OnClickListener {
    ImageView back;
    ImageView signup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        signup = findViewById(R.id.signup);
        signup.setOnClickListener(this);
        back = findViewById(R.id.back);
        back.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.back:
                Intent intent = new Intent(this, Sign_in.class);
                startActivity(intent);
                break;
            case R.id.signup:
                Toast.makeText(getApplicationContext(), "Неверный логин, пароль, не совпадают пароли" ,Toast.LENGTH_SHORT).show();
                break;
            default:

                break;
        }
    }
}
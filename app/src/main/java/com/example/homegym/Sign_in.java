package com.example.homegym;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class Sign_in extends AppCompatActivity implements View.OnClickListener {
    String login = "serk";
    String password = "123";
    EditText e1;
    EditText e2;
    ImageView button;
    ImageView s1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        e1 = findViewById(R.id.login);
        e2 = findViewById(R.id.password);
        button = findViewById(R.id.signin);
        s1 = findViewById(R.id.sunext);
        button.setOnClickListener(this);
        s1.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.signin:
                if(e1.getText().toString().equals(login) && e2.getText().toString().equals(password))
                {
                    Intent intent = new Intent(this, Step1.class);
                    startActivity(intent);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "Wrong Login or Password!" , Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.sunext:
                Intent intent = new Intent(this, Sign_up.class);
                startActivity(intent);
                break;
            default:

                break;
        }
    }
}
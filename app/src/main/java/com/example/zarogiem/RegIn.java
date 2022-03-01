package com.example.zarogiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class RegIn extends AppCompatActivity{
    TextView LoginTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_in);

        LoginTextView = findViewById(R.id.login);
    }

    public void logIn(View view) {
        Intent logInIntent = new Intent(this, LogIn.class);
        startActivity(logInIntent);
    }


}
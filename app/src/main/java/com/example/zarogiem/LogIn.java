package com.example.zarogiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LogIn extends AppCompatActivity {

    TextView RegisterTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RegisterTextView = findViewById(R.id.register);

    }



    public void registerIn(View view) {
        Intent regisIn = new Intent(this, RegIn.class);
        startActivity(regisIn);
    }
}
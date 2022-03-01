package com.example.zarogiem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button bSearch, bAnnoune;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bSearch = findViewById(R.id.button_Search);
        bAnnoune = findViewById(R.id.button_Announce);
    }

    public void announce(View view) {
        Intent logRegIn = new Intent(this, LogIn.class);
        startActivity(logRegIn);

    }
}
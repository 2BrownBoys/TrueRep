package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class NameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        Intent intent =getIntent();
        String message = intent.getStringExtra("Name_Chosen");
        TextView textview = findViewById(R.id.tvInfo);
        textview.setText("Politician: " + message);
    }
}

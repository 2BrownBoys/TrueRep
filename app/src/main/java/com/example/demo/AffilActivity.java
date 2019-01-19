package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AffilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_affil);

        Intent intent =getIntent();
        String message = intent.getStringExtra("Affil_Chosen");
        TextView textview = findViewById(R.id.tvInfo);
        textview.setText("Affiliation: " + message);
    }
}

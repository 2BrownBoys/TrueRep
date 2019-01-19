package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class TopicActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topic);

        Intent intent =getIntent();
        String message = intent.getStringExtra("Topic_Chosen");
        TextView textview = findViewById(R.id.tvInfo);
        textview.setText("Issue: " + message);
    }
}

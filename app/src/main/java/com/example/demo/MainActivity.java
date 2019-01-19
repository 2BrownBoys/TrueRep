package com.example.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Topic;
    private EditText Affiliation;
    private Button BName;
    private Button BTopic;
    private Button BAffil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name = findViewById(R.id.etName);
        Topic = findViewById(R.id.etTopic);
        Affiliation = findViewById(R.id.etAffiliation);
        BName = findViewById(R.id.btnName);
        BTopic = findViewById(R.id.btnTopic);
        BAffil = findViewById(R.id.btnAffiliation);

        BName.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nameSearch(Name.getText().toString());
            }
        });

        BTopic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                topicSearch(Topic.getText().toString());
            }
        });

        BAffil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                affilSearch(Affiliation.getText().toString());
            }
        });

    }

    private void nameSearch(String name) {
        EditText editText = findViewById(R.id.etName);
        String message = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this, NameActivity.class);
        intent.putExtra("Name_Chosen", message);
        startActivity(intent);
    }

    private void topicSearch(String name) {
        EditText editText = findViewById(R.id.etTopic);
        String message = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this, TopicActivity.class);
        intent.putExtra("Topic_Chosen", message);
        startActivity(intent);
    }

    private void affilSearch(String name) {
        EditText editText = findViewById(R.id.etAffiliation);
        String message = editText.getText().toString();

        Intent intent = new Intent(MainActivity.this, AffilActivity.class);
        intent.putExtra("Affil_Chosen", message);
        startActivity(intent);
    }

}

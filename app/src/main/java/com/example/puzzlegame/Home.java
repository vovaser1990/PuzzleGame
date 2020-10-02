package com.example.puzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Button startButton = findViewById(R.id.start_button);
        Button HighScoreButton = findViewById(R.id.highscore_button);
         startButton.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent chooseDifficultIntent = new Intent(Home.this,ChooseDifficultActivity.class);
                 startActivity(chooseDifficultIntent);
             }
         });
        HighScoreButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HighScoreIntent = new Intent(Home.this,LeaderBoardBeginner.class);
                startActivity(HighScoreIntent);
            }
        });

    }
}
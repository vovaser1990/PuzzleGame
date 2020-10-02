package com.example.puzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LeaderBoardBeginner extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board_beginner);
        ImageButton imageButtonRight = findViewById(R.id.buttonright);

        imageButtonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent leaderBoard = new Intent(LeaderBoardBeginner.this,LeaderBoardAmateur.class);
                startActivity(leaderBoard);
            }
        });
        Button BackMenuButton = findViewById(R.id.backToMainMenu1);
        BackMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeIntent = new Intent(LeaderBoardBeginner.this,Home.class);
                startActivity(HomeIntent);
            }
        });
    }
}
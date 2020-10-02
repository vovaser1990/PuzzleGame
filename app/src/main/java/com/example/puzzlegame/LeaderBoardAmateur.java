package com.example.puzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LeaderBoardAmateur extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board_amateur);
        ImageButton imageButtonRight = findViewById(R.id.buttonright2);
        ImageButton imageButtonLeft = findViewById(R.id.buttonleft2);
        imageButtonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent leaderBoard = new Intent(LeaderBoardAmateur.this,LeaderBoardBeginner.class);
                startActivity(leaderBoard);
            }
        });
        imageButtonRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent leaderBoard = new Intent(LeaderBoardAmateur.this,LeaderBoardProfessional.class);
                startActivity(leaderBoard);
            }
        });

        Button BackMenuButton = findViewById(R.id.backToMainMenu2);
        BackMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeIntent = new Intent(LeaderBoardAmateur.this,Home.class);
                startActivity(HomeIntent);
            }
        });
    }
}
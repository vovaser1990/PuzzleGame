package com.example.puzzlegame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class LeaderBoardProfessional extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leader_board_professional);
        ImageButton imageButtonLeft = findViewById(R.id.buttonleft3);
        imageButtonLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent leaderBoard = new Intent(LeaderBoardProfessional.this,LeaderBoardAmateur.class);
                startActivity(leaderBoard);
            }
        });
        Button BackMenuButton = findViewById(R.id.backToMainMenu3);
        BackMenuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent HomeIntent = new Intent(LeaderBoardProfessional.this,Home.class);
                startActivity(HomeIntent);
            }
        });
    }
}
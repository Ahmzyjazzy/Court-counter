package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0, scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }



    /**
     * Add Score for Team A
     */
    public void addOneForTeamA(View view) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View view) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void addThreeForTeamA(View view) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Add Scroe for Team B
     */
    public void addOneForTeamB(View view) {
        scoreTeamB++;
        displayForTeamB(scoreTeamA);
    }

    public void addTwoForTeamB(View view) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamA);
    }

    public void addThreeForTeamB(View view) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamA);
    }




}

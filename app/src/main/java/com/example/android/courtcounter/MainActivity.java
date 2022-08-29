package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Отображает данный счет для команды A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Отображает данный счет для команды B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForTeamA(View view) {
        displayForTeamA(scoreTeamA += 3);
    }

    public void addTwoForTeamA(View view) {
        displayForTeamA(scoreTeamA += 2);
    }

    public void addOneForTeamA(View view) {
        displayForTeamA(scoreTeamA += 1);
    }

    public void addThreeForTeamB(View view) {
        displayForTeamB(scoreTeamB += 3);
    }

    public void addTwoForTeamB(View view) {
        displayForTeamB(scoreTeamB += 2);
    }

    public void addOneForTeamB(View view) {
        displayForTeamB(scoreTeamB += 1);
    }

    public void resetScore(View view) {
        displayForTeamA(scoreTeamA = 0);
        displayForTeamB(scoreTeamB = 0);
    }


}
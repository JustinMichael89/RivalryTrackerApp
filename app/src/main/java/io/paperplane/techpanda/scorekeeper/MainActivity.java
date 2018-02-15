package io.paperplane.techpanda.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamOne = 0;
    int scoreTeamTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Display score for Team One
    public void displayTeamOneScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamOneScore);
        scoreView.setText(String.valueOf(score));
    }

    // Display score for Team Two
    public void displayTeamTwoScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamTwoScore);
        scoreView.setText(String.valueOf(score));
    }

    // Add touchdown points to Team One
    public void teamATD(View view) {
        int touchdown = 6;
        scoreTeamOne = scoreTeamOne + touchdown;
        displayTeamOneScore(scoreTeamOne);
    }

    // Add field goal points to Team One
    public void teamAFG(View view) {
        int fieldGoal = 3;
        scoreTeamOne = scoreTeamOne + fieldGoal;
        displayTeamOneScore(scoreTeamOne);
    }

    // Add extra point to Team One
    public void teamAExtraPoint(View view) {
        int extraPoint = 1;
        scoreTeamOne = scoreTeamOne + extraPoint;
        displayTeamOneScore(scoreTeamOne);
    }

    // Add 2 point conversion to Team One
    public void teamATwoPoints(View view) {
        int twoPointConversion = 2;
        scoreTeamOne = scoreTeamOne + twoPointConversion;
        displayTeamOneScore(scoreTeamOne);
    }

    // Add touchdown points to Team Two
    public void teamBTD(View view) {
        int touchdown = 6;
        scoreTeamTwo = scoreTeamTwo + touchdown;
        displayTeamTwoScore(scoreTeamTwo);
    }

    // Add field goal points to Team Two
    public void teamBFG(View view) {
        int fieldGoal = 3;
        scoreTeamTwo = scoreTeamTwo + fieldGoal;
        displayTeamTwoScore(scoreTeamTwo);
    }

    // Add extra point to Team Two
    public void teamBExtraPoint(View view) {
        int extraPoint = 1;
        scoreTeamTwo = scoreTeamTwo + extraPoint;
        displayTeamTwoScore(scoreTeamTwo);
    }

    // Add 2 point conversion to Team Two
    public void teamBTwoPoints(View view) {
        int twoPointConversion = 2;
        scoreTeamTwo = scoreTeamTwo + twoPointConversion;
        displayTeamTwoScore(scoreTeamTwo);
    }

    // Reset points for both teams
    public void resetScores(View view) {
        scoreTeamOne = 0;
        scoreTeamTwo = 0;
        displayTeamOneScore(scoreTeamOne);
        displayTeamTwoScore(scoreTeamTwo);
    }
}
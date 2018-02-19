package io.paperplane.techpanda.scorekeeper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    // These values are initialized in the onCreate method
    int scoreTeamOne = 0;
    int scoreTeamTwo = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Check to see if this is the initial creation
        if (savedInstanceState == null) {
            // If yes, init the score counters
            Intent intent = getIntent();

            scoreTeamOne = intent.getIntExtra("scoreTeamOne", 0);
            scoreTeamTwo = intent.getIntExtra("scoreTeamTwo", 0);
        }
        // If NOT initial creation, retrieve saved scores
        else {
            scoreTeamOne = savedInstanceState.getInt("scoreTeamOne");
            scoreTeamTwo = savedInstanceState.getInt("scoreTeamTwo");
        }

        displayTeamOneScore(scoreTeamOne);
        displayTeamTwoScore(scoreTeamTwo);
    }

    // If the process is killed or restarted this will save the bundle
    // and pass the data to the onCreate method.
    @Override
    protected void onSaveInstanceState(Bundle savedInstanceState) {
        super.onSaveInstanceState(savedInstanceState);
        savedInstanceState.putInt("scoreTeamOne", scoreTeamOne);
        savedInstanceState.putInt("scoreTeamTwo", scoreTeamTwo);
    }

    // Restore the state from the savedInstanceState
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamOne = savedInstanceState.getInt("scoreTeamOne");
        scoreTeamTwo = savedInstanceState.getInt("scoreTeamTwo");

        displayTeamOneScore(scoreTeamOne);
        displayTeamTwoScore(scoreTeamTwo);
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

    // Display score for Team One
    public void displayTeamOneScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamOne);
        scoreView.setText(String.valueOf(score));
    }

    // Display score for Team Two
    public void displayTeamTwoScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.scoreTeamTwo);
        scoreView.setText(String.valueOf(score));
    }
}
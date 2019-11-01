package com.example.android.courtcount;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;


/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {
    int ScoreForTeamA = 0;
    int ScoreForTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    /**
     * This method is called when the button for 3 poits for team A is clicked.
     */
    public void displayForTeamA3(View view)
    {
        ScoreForTeamA=ScoreForTeamA+3;
        displayForTeamA(ScoreForTeamA);
    }
    /**
     * This method is called when the 2 poits for team A button is clicked.
     */
    public void displayForTeamA2(View view)
    {
        ScoreForTeamA=ScoreForTeamA+2;
        displayForTeamA(ScoreForTeamA);
    }
    /**
     * This method is called when the 1 poit for team A button is clicked.
     */
    public void displayForTeamA1(View view)
    {
        ScoreForTeamA=ScoreForTeamA+1;
        displayForTeamA(ScoreForTeamA);
    }
    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));

    }
    /**
     * Displays the given score for Team B.
     */

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB1(View view)
    {
        ScoreForTeamB=ScoreForTeamB+1;
        displayForTeamB(ScoreForTeamB);
    }
    public void displayForTeamB2(View view)
    {
        ScoreForTeamB=ScoreForTeamB+2;
        displayForTeamB(ScoreForTeamB);
    }
    public void displayForTeamB3(View view)
    {
        ScoreForTeamB=ScoreForTeamB+3;
        displayForTeamB(ScoreForTeamB);
    }
 }


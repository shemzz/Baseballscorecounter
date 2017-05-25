package com.example.android.baseballscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ballDisplay = 0;
    int strikeDisplay = 0;
    int outDisplay = 0;
    int innDisplay = 0;
    int guestRun = 0;
    int guestHit = 0;
    int guestError = 0;
    int homeRun = 0;
    int homeHit = 0;
    int homeError = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the Ball points.
     */
    public void ballViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.display_ball);
        scoreView.setText(String.valueOf(score));
    }

    //update ball display view
    public void addOneForBall(View v) {
        ballDisplay = ballDisplay + 1;
        ballViewDisplay(ballDisplay);
    }

    /**
     * Displays the Strike points.
     */
    public void strikeViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.display_strike);
        scoreView.setText(String.valueOf(score));
    }

    //update ball display view
    public void addOneForStrike(View v) {
        strikeDisplay = strikeDisplay + 1;
        strikeViewDisplay(strikeDisplay);
    }

    /**
     * Displays the Out points.
     */
    public void outViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.display_out);
        scoreView.setText(String.valueOf(score));
    }

    //update out display view
    public void addOneForOut(View v) {
        outDisplay = outDisplay + 1;
        outViewDisplay(outDisplay);
    }

    /**
     * Displays the Inn points.
     */
    public void innViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.display_inn);
        scoreView.setText(String.valueOf(score));
    }

    //update inn display view
    public void addOneForInn(View v) {
        innDisplay = innDisplay + 1;
        innViewDisplay(innDisplay);
    }

    /**
     * Displays the Guest Runs points.
     */
    public void guestRunViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guest_runs);
        scoreView.setText(String.valueOf(score));
    }

    //update guest run display view
    public void addOneForGuestRun(View v) {
        guestRun = guestRun + 1;
        guestRunViewDisplay(guestRun);
    }

    /**
     * Displays the Guest Hit points.
     */
    public void guestHitViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guest_hits);
        scoreView.setText(String.valueOf(score));
    }

    //update guest hit display view
    public void addOneForGuestHit(View v) {
        guestHit = guestHit + 1;
        guestHitViewDisplay(guestHit);
    }

    /**
     * Displays the Guest errors points.
     */
    public void guestErrorViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.guest_errors);
        scoreView.setText(String.valueOf(score));
    }

    //update guest error display view
    public void addOneForGuestError(View v) {
        guestError = guestError + 1;
        guestErrorViewDisplay(guestError);
    }

    /**
     * Displays the Home run points.
     */
    public void homeRunViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_runs);
        scoreView.setText(String.valueOf(score));
    }

    //update home run display view
    public void addOneForHomeRun(View v) {
        homeRun = homeRun + 1;
        homeRunViewDisplay(homeRun);
    }


    /**
     * Displays the Home hits points.
     */
    public void homeHitViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_hits);
        scoreView.setText(String.valueOf(score));
    }

    //update home hit display view
    public void addOneForHomeHit(View v) {
        homeHit = homeHit + 1;
        homeHitViewDisplay(homeHit);
    }

    /**
     * Displays the Home error points.
     */
    public void homeErrorViewDisplay(int score) {
        TextView scoreView = (TextView) findViewById(R.id.home_errors);
        scoreView.setText(String.valueOf(score));
    }

    //update home error display view
    public void addOneForHomeError(View v) {
        homeError = homeError + 1;
        homeErrorViewDisplay(homeError);
    }

    //reset counts to zero
    public void resetScore(View v){
        ballDisplay = 0;
        strikeDisplay = 0;
        outDisplay = 0;
        innDisplay = 0;
        guestRun = 0;
        guestHit = 0;
        guestError = 0;
        homeRun = 0;
        homeHit = 0;
        homeError = 0;
        homeRunViewDisplay(homeRun);
        ballViewDisplay(ballDisplay);
        strikeViewDisplay(strikeDisplay);
        outViewDisplay(outDisplay);
        innViewDisplay(innDisplay);
        guestRunViewDisplay(guestRun);
        guestHitViewDisplay(guestHit);
        guestErrorViewDisplay(guestError);
        homeHitViewDisplay(homeHit);
        homeErrorViewDisplay(homeError);
    }

}

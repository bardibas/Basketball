package com.mindconsole.nivas.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     }

    int apoints=0;
    int bpoints=0;
    public void bpoint3(View view){
       bpoints+=3;
        displayForTeamB(bpoints);
    }

    public void bpoint2(View view){
        bpoints+=2;
        displayForTeamB(bpoints);
    }

    public void bpoint(View view){
        bpoints++;
        displayForTeamB(bpoints);
    }

    public void apoint3(View view){
        apoints+=3;
        displayForTeamA(apoints);
    }

    public void apoint2(View view){
        apoints+=2;
        displayForTeamA(apoints);
    }

    public void apoint(View view){
        apoints++;
        displayForTeamA(apoints);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_txt_view);
        scoreView.setText(String.valueOf(score));
    }

    public void reset(View view){
        apoints=bpoints=0;
        displayForTeamA(apoints);
        displayForTeamB(bpoints);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_txt_view2);
        scoreView.setText(String.valueOf(score));
    }
}

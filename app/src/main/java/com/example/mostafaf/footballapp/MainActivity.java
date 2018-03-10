package com.example.mostafaf.footballapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String result;
    int resultA;
    int resultB;
    int foulsA;
    int foulsB;
    int yellowA;
    int yellowB;
    int redA;
    int redB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null) {
            // Restore value of members from saved state
            result = savedInstanceState.getString("Result");
            resultA = savedInstanceState.getInt("ResultA");
            resultB = savedInstanceState.getInt("ResultB");
            foulsA = savedInstanceState.getInt("FoulsA");
            foulsB = savedInstanceState.getInt("FoulsB");
            yellowA = savedInstanceState.getInt("YellowA");
            yellowB = savedInstanceState.getInt("YellowB");
            redA = savedInstanceState.getInt("RedA");
            redB = savedInstanceState.getInt("RedB");

        } else {
            // Probably initialize members with default values for a new instance
            result = "0 - 0";
            resultA = 0;
            resultB = 0;
            foulsA = 0;
            foulsB = 0;
            yellowA = 0;
            yellowB = 0;
            redA = 0;
            redB = 0;
        }
        setContentView(R.layout.activity_main);
        displayFoulsA(foulsA);
        displayFoulsB(foulsB);
        displaRedA(redA);
        displaRedB(redB);
        displaYellowA(yellowA);
        displaYellowB(yellowB);
        displayResult(result);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putString("Result", result);
        savedInstanceState.putInt("ResultA", resultA);
        savedInstanceState.putInt("ResultB", resultB);
        savedInstanceState.putInt("FoulsA", foulsA);
        savedInstanceState.putInt("FoulsB", foulsB);
        savedInstanceState.putInt("YellowA", yellowA);
        savedInstanceState.putInt("YellowB", yellowB);
        savedInstanceState.putInt("RedA", redA);
        savedInstanceState.putInt("RedB", redB);


        // Always call the superclass so it can save the view hierarchy state
        super.onSaveInstanceState(savedInstanceState);

    }


    public void goalA(View view) {
        resultA = resultA + 1;
        result = resultA + " - " + resultB;
        displayResult(result);
    }

    public void goalB(View view) {
        resultB = resultB + 1;
        result = resultA + " - " + resultB;
        displayResult(result);
    }

    public void foulA(View view) {
        foulsA = foulsA + 1;
        displayFoulsA(foulsA);
    }

    public void foulB(View view) {
        foulsB = foulsB + 1;
        displayFoulsB(foulsB);
    }

    public void yellowA(View view) {
        yellowA = yellowA + 1;
        displaYellowA(yellowA);
    }

    public void yellowB(View view) {
        yellowB = yellowB + 1;
        displaYellowB(yellowB);
    }


    public void redA(View view) {
        redA = redA + 1;
        displaRedA(redA);
    }

    public void redB(View view) {
        redB = redB + 1;
        displaRedB(redB);
    }

    public void reset(View view) {
        result = "0 - 0";
        resultA = 0;
        resultB = 0;
        foulsA = 0;
        foulsB = 0;
        yellowA = 0;
        yellowB = 0;
        redA = 0;
        redB = 0;

        displayFoulsA(foulsA);
        displayFoulsB(foulsB);
        displaRedA(redA);
        displaRedB(redB);
        displaYellowA(yellowA);
        displaYellowB(yellowB);
        displayResult(result);
    }

    public void displayResult(String result) {
        TextView scoreView = (TextView) findViewById(R.id.result);
        scoreView.setText(String.valueOf(result));
    }

    public void displaYellowA(int num) {
        TextView scoreView = (TextView) findViewById(R.id.yellowA);
        scoreView.setText(String.valueOf(num));
    }

    public void displaYellowB(int num) {
        TextView scoreView = (TextView) findViewById(R.id.yellowB);
        scoreView.setText(String.valueOf(num));
    }

    public void displaRedA(int num) {
        TextView scoreView = (TextView) findViewById(R.id.redA);
        scoreView.setText(String.valueOf(num));
    }

    public void displaRedB(int num) {
        TextView scoreView = (TextView) findViewById(R.id.redB);
        scoreView.setText(String.valueOf(num));
    }


    public void displayFoulsA(int num) {
        TextView scoreView = (TextView) findViewById(R.id.foulsA);
        scoreView.setText(String.valueOf(num));
    }

    public void displayFoulsB(int num) {
        TextView scoreView = (TextView) findViewById(R.id.foulsB);
        scoreView.setText(String.valueOf(num));
    }


}

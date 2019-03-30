package com.kaleb.strategypattern.Main;

import com.kaleb.strategypattern.Main.Games.BaseGame;
import com.kaleb.strategypattern.Main.Games.BlazblueGame;
import com.kaleb.strategypattern.Main.Games.UnielGame;
import com.kaleb.strategypattern.R;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class FightingGame extends AppCompatActivity {

    private Button blazblueComboButton;

    private Button blazblueExecButton;

    private Button blazblueFootsiesButton;

    private BaseGame blazblueGame;

    private Button unielComboButton;

    private Button unielExecButton;

    private Button unielFootsiesButton;

    private BaseGame unielGame;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fighting_game);
        this.blazblueGame = new BlazblueGame(this);
        this.unielGame = new UnielGame(this);
        initButtons();
    }

    private void initButtons() {
        blazblueComboButton = findViewById(R.id.btn_blazblueCombos);
        blazblueComboButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blazblueGame.yellTheCombos();
            }
        });

        blazblueExecButton = findViewById(R.id.btn_blazblueExecution);
        blazblueExecButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blazblueGame.yellTheExecution();
            }
        });

        blazblueFootsiesButton = findViewById(R.id.btn_blazblueFootsies);
        blazblueFootsiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                blazblueGame.yellTheFootsies();
            }
        });

        unielComboButton = findViewById(R.id.btn_unielCombos);
        unielComboButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unielGame.yellTheCombos();
            }
        });

        unielExecButton = findViewById(R.id.btn_unielExecution);
        unielExecButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unielGame.yellTheExecution();
            }
        });

        unielFootsiesButton = findViewById(R.id.btn_unielFootsies);
        unielFootsiesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                unielGame.yellTheFootsies();
            }
        });
    }
}

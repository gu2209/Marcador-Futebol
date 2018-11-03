package com.example.android.marcadorfutebol;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int golsTimeA = 0;
    int golsTimeB = 0;
    int cartaoVermelhoA = 0;
    int cartaoVermelhoB = 0;
    int cartaoAmareloA = 0;
    int cartaoAmareloB = 0;

    public MainActivity(Teste teste) {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGolForTeamA(View v) {
        golsTimeA = golsTimeA + 1;
        displayGolsForTeamA(golsTimeA);
    }

    public void addCartAForTeamA(View v) {
        cartaoAmareloA = cartaoAmareloA + 1;
        displayCartAForTeamA(cartaoAmareloA);
    }


    public void addCartVForTeamA(View v) {
        cartaoVermelhoA = cartaoVermelhoA + 1;
        displayCartVForTeamA(cartaoVermelhoA);
    }


    public void displayGolsForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gols_A);
        scoreView.setText(String.valueOf("Gols marcados =" + score));
    }

    public void displayCartAForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cart_A_A);
        scoreView.setText(String.valueOf("Cartões Amarelos =" + score));
    }

    public void displayCartVForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cart_V_A);
        scoreView.setText(String.valueOf("Cartões Vermelhos = " + score));
    }


    public void addGolForTeamB(View v) {
        golsTimeB = golsTimeB + 1;
        displayGolsForTeamB(golsTimeB);
    }


    public void addCartAForTeamB(View v) {
        cartaoAmareloB = cartaoAmareloB + 1;
        displayCartAForTeamB(cartaoAmareloB);
    }


    public void addCartVForTeamB(View v) {
        cartaoVermelhoB = cartaoVermelhoB + 1;
        displayCartVForTeamB(cartaoVermelhoB);
    }


    public void displayGolsForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.gols_B);
        scoreView.setText(String.valueOf("Gols marcados =" + score));
    }

    public void displayCartAForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cart_A_B);
        scoreView.setText(String.valueOf("Cartões Amarelos =" + score));
    }

    public void displayCartVForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.cart_V_B);
        scoreView.setText(String.valueOf("Cartões Vermelhos = " + score));
    }

    public void RGame(View v) {
        golsTimeA = 0;
        displayGolsForTeamA(golsTimeA);

        golsTimeB = 0;
        displayGolsForTeamB(golsTimeB);

        cartaoAmareloA = 0;
        displayCartAForTeamA(cartaoAmareloA);

        cartaoAmareloB = 0;
        displayCartAForTeamB(cartaoAmareloB);

        cartaoVermelhoA = 0;
        displayCartVForTeamA(cartaoVermelhoA);

        cartaoVermelhoB = 0;
        displayCartVForTeamB(cartaoVermelhoB);


    }
}
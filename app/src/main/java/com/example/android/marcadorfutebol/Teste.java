package com.example.android.marcadorfutebol;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Teste extends AppCompatActivity {

    private MainActivity addGolForTeamA;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teste);

        this.addGolForTeamA = new  MainActivity(this);
    }

    public Teste(MainActivity addGolForTeamA) {
        this.addGolForTeamA = addGolForTeamA;
    }

}

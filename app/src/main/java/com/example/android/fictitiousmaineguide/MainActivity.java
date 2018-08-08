package com.example.android.fictitiousmaineguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //#1 Location - Cabot Cover, Maine
        TextView cabotCoveLocation = findViewById(R.id.cabotCove);
        cabotCoveLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent cabotCoveIntent = new Intent(MainActivity.this, Location1Activity.class);
                startActivity(cabotCoveIntent);
            }
        });

        //#2 Location - Derry, Maine
        TextView derryLocation = findViewById(R.id.derry);
        derryLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent derryIntent = new Intent(MainActivity.this, Location2Activity.class);
                startActivity(derryIntent);
            }
        });

        //#3 Location - Dark Score Lake, Maine
        TextView darkScoreLakeLocation = findViewById(R.id.darkScoreLake);
        darkScoreLakeLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent darkScoreLakeIntent = new Intent(MainActivity.this, Location3Activity.class);
                startActivity(darkScoreLakeIntent);
            }
        });

        //#4 Location - Little Tall Island, Maine
        TextView littleTallIslandLocation = findViewById(R.id.littleTallIsland);
        littleTallIslandLocation.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent littleTallIslandIntent = new Intent(MainActivity.this, Location4Activity.class);
                startActivity(littleTallIslandIntent);
            }
        });

    }
}

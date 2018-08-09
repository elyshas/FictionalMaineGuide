package com.example.android.fictitiousmaineguide;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * Created by elysh on 8/6/2018.
 */

//Bag of Bones by Stephen King: Dark Score Lake, Maine *** Actual Location is Flagstaff Lake, Maine
public class Location3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        //**Image taken from Google Image Search**//
        ImageView imageHeaderView = new ImageView(this);//use getActivity() on fragment
        imageHeaderView.setBackgroundColor(Color.parseColor("#607D8B"));
        imageHeaderView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.dark_score_maine));

        final ArrayList<Location> infoList = new ArrayList<>();

        infoList.add(new Location(getResources().getString(R.string.darkScoreLakeText), getResources().getString(R.string.flagstaffText),
                getResources().getString(R.string.darkScoreLakeInfo), getResources().getString(R.string.darkScoreLink)));

        LocationAdapter adapter = new LocationAdapter(this, infoList);

        final ListView listView = findViewById(R.id.list);
        listView.addHeaderView(imageHeaderView, null, false);
        listView.setAdapter(adapter);
    }
}

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

public class Location4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        //**Image taken from Google Image Search**//
        ImageView imageHeaderView = new ImageView(this);//use getActivity() on fragment
        imageHeaderView.setBackgroundColor(Color.parseColor("#607D8B"));
        imageHeaderView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.little_tall_island_maine));

        final ArrayList<Location> infoList = new ArrayList<>();

        infoList.add(new Location("Little Tall Island, Maine", "Actual Name: Southwest Harbor, Maine", "Little Tall Island, Maine is the primary setting for both Stephen King's Dolores Claiborne " +
                "and Storm of the Century. Weather it's a devastating winter storm, or a total solar eclipse, these tight-knit communities fester beings with sinister plots. " +
                "\n" + "\n" + "Little Tall Island is a fictional version of Southwest Harbor, Maine. Southwest Harbor is a town in Hancock County, Maine. Side note: Hancock is referenced in " +
                "Stephen King's Pet Cemetery, fictionally known as Ludlow, Maine. " +
                "\n" + "\n" + "Southwest Harbor is located on Mount Desert Island. It is the largest municipality on the southwestern “quiet side” of the island. It is thought to be a historically romantic icon of seafaring coastal life, " +
                "and is ranked as one of the top ten commercial fishing harbors in the state of Maine. Some of the world’s most spectacular sailboats and yachts are built by more than ten boat builders on the island. " +
                "The small town has some great shops, galleries, eateries, and accommodations, plus many people enjoy Acadia National Park for its relaxed setting.",
                "https://www.kingsleighinn.com/southwestharborinformation.html"));

        LocationAdapter adapter = new LocationAdapter(this, infoList);

        final ListView listView = findViewById(R.id.list);
        listView.addHeaderView(imageHeaderView, null, false);
        listView.setAdapter(adapter);
    }
}

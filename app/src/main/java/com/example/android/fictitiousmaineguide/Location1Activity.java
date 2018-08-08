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

public class Location1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        //**Image taken from Google Image Search**//
        ImageView imageHeaderView = new ImageView(this);//use getActivity() on fragment
        imageHeaderView.setBackgroundColor(Color.parseColor("#607D8B"));
        imageHeaderView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.cabot_cove_maine));

        final ArrayList<Location> infoList = new ArrayList<>();

        infoList.add(new Location("Cabot Cove, Maine", "Actual Name: Kennebunkport, Maine", "Murder, She Wrote is an American crime drama television series " +
                "starring Angela Lansbury as mystery writer and amateur detective Jessica Fletcher.  " +
                "The show revolves around the day-to-day life of Jessica Fletcher, a childless, widowed, retired English teacher who becomes a successful mystery writer. " +
                "Despite fame and fortune, Jessica remains a resident of Cabot Cove, a small coastal community in Maine, " +
                "and maintains her links with all of her old friends, never letting her success go to her head." +
                "\n" + "\n" + "The fictional \"Cabot Cove\" name for the series' coastal town was derived from the name of an actual bay harbor inlet in Kennebunkport, " +
                "Maine, located near the town's center, on the road where motels and lobster shack dives are located. Kennebunkport is known for its beaches, including long, sandy Goose Rocks Beach and smaller Arundel Beach.",
                "&lt;a href=\"https://en.wikipedia.org/wiki/Murder,_She_Wrote\"&gt;&lt;/a&gt;"));

        LocationAdapter adapter = new LocationAdapter(this, infoList);

        final ListView listView = findViewById(R.id.list);
        listView.addHeaderView(imageHeaderView, null, false);
        listView.setAdapter(adapter);
    }
}

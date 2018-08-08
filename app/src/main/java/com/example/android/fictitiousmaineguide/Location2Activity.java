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

public class Location2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_activity);

        //**Image taken from Google Image Search**//
        ImageView imageHeaderView = new ImageView(this);//use getActivity() on fragment
        imageHeaderView.setBackgroundColor(Color.parseColor("#607D8B"));
        imageHeaderView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.derry_maine));

        final ArrayList<Location> infoList = new ArrayList<>();

        infoList.add(new Location("Derry, Maine", "Actual Name: Bangor, Maine", "Derry is a fictional town and a part of Stephen King's fictional Maine topography. " +
                "Derry has served as the primary setting for a number of his stories such as: IT, Insomnia, Bag of Bones, Dreamcatcher, Fair Extension, 11/22/63, and more. " +
                "King has acknowledged that Derry is actually his portrayal of Bangor, Maine." +
                "\n" + "\n" + "Bangor is located in Penobscot County. Bangor has a port of entry at Bangor International Airport, also home to the Bangor Air National Guard Base. " +
                "Bangor has a humid continental climate, with cold, snowy winters, and warm summers. Outdoor activities in the Bangor City Forest and other nearby parks, forests, and waterways include " +
                "hiking, sailing, canoeing, hunting, fishing, skiing, and snowmobiling.",
                "&lt;a href=\"https://en.wikipedia.org/wiki/Derry_(Stephen_King)\"&gt;&lt;/a&gt;"));

        LocationAdapter adapter = new LocationAdapter(this, infoList);

        final ListView listView = findViewById(R.id.list);
        listView.addHeaderView(imageHeaderView, null, false);
        listView.setAdapter(adapter);
    }
}

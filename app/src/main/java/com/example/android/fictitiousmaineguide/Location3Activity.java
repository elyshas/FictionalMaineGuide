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

        infoList.add(new Location("Dark Score Lake, Maine", "Actual Name: Flagstaff Lake, Maine", "Dark Score Lake, Maine is specifically referenced in Stephen King's Bag of Bones. " +
                "Another part of this story takes place in Castle Rock, Maine, which holds an important linked role in many of Stephen King's stories. " +
                "Castle Rock is a fictional location, taking details from the actual location of Woodland, Maine." +
                "\n" + "\n" + "Dark Score Lake's actual location is known as Flagstaff Lak, Maine. Flagstaff Lake is located in Somerset County and Franklin County, Maine. The lake's surface area is 20,300 acres. " +
                "It is extremely shallow, with the deepest point at 48 feet. Landlocked salmon and brook trout can be caught here. Some points on the lake are very marshy and have to be negotiated with a canoe or kayak; " +
                "even then, wading may be necessary in the marshy areas to get through to the rest of the lake.",
                "&lt;a href=\"http://stephenkingsmaine.com/dark-score-lake/\"&gt;&lt;/a&gt;"));

        LocationAdapter adapter = new LocationAdapter(this, infoList);

        final ListView listView = findViewById(R.id.list);
        listView.addHeaderView(imageHeaderView, null, false);
        listView.setAdapter(adapter);
    }
}

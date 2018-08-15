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

//Two stories by Stephen King: Little Tall Island, Maine *** Actual Location is Southwest Harbor, Maine
public class Location4Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Location4Fragment())
                .commit();
    }

//        //**Image taken from Google Image Search**//
//        ImageView imageHeaderView = new ImageView(this);//use getActivity() on fragment
//        imageHeaderView.setBackgroundColor(Color.parseColor("#607D8B"));
//        imageHeaderView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.little_tall_island_maine));
//
//        final ArrayList<Location> infoList = new ArrayList<>();
//
//        infoList.add(new Location(getResources().getString(R.string.littleTallIslandText), getResources().getString(R.string.southwestHarborText),
//                getResources().getString(R.string.littleTallIslandInfo), getResources().getString(R.string.littleTallLink)));
//
//        LocationAdapter adapter = new LocationAdapter(this, infoList);
//
//        final ListView listView = findViewById(R.id.list);
//        listView.addHeaderView(imageHeaderView, null, false);
//        listView.setAdapter(adapter);
//    }
}

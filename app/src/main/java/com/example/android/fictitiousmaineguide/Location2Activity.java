package com.example.android.fictitiousmaineguide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by elysh on 8/6/2018.
 */

//Multiple Stories by Stephen King: Derry, Maine *** Actual Location is Bangor, Maine
public class Location2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, new Location2Fragment())
                .commit();
    }

//        //**Image taken from Google Image Search**//
//        ImageView imageHeaderView = new ImageView(this);//use getActivity() on fragment
//        imageHeaderView.setBackgroundColor(Color.parseColor("#607D8B"));
//        imageHeaderView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.derry_maine));
//
//        final ArrayList<Location> infoList = new ArrayList<>();
//
//        infoList.add(new Location(getResources().getString(R.string.derryText), getResources().getString(R.string.bangorText),
//                getResources().getString(R.string.derryInfo), getResources().getString(R.string.derryLink)));
//
//        LocationAdapter adapter = new LocationAdapter(this, infoList);
//
//        final ListView listView = findViewById(R.id.list);
//        listView.addHeaderView(imageHeaderView, null, false);
//        listView.setAdapter(adapter);
//    }
}

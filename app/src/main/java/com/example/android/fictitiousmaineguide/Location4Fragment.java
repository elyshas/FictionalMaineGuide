package com.example.android.fictitiousmaineguide;

import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */

//Two stories by Stephen King: Little Tall Island, Maine *** Actual Location is Southwest Harbor, Maine
public class Location4Fragment extends Fragment {

    public Location4Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.list_activity, container, false);

        //**Image taken from Google Image Search**//
        ImageView imageHeaderView = new ImageView(getActivity());//use getActivity() on fragment
        imageHeaderView.setBackgroundColor(Color.parseColor("#607D8B"));
        imageHeaderView.setImageBitmap(BitmapFactory.decodeResource(getResources(), R.drawable.little_tall_island_maine));

        final ArrayList<Location> infoList = new ArrayList<>();

        infoList.add(new Location(getResources().getString(R.string.littleTallIslandText), getResources().getString(R.string.southwestHarborText),
                getResources().getString(R.string.littleTallIslandInfo)));

        LocationAdapter adapter = new LocationAdapter(getActivity(), infoList);

        final ListView listView = rootView.findViewById(R.id.list);
        listView.addHeaderView(imageHeaderView, null, false);
        listView.setAdapter(adapter);

        return rootView;
    }

}

package com.example.android.fictitiousmaineguide;

import android.content.Context;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by elysh on 8/6/2018.
 */

public class LocationAdapter extends ArrayAdapter<Location> {

    public LocationAdapter(Context context, ArrayList<Location> location) {
        super(context, 0, location);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.selected_location, parent, false);
        }

        Location currentLocation = getItem(position);

        TextView fictionalNameTextView = listItemView.findViewById(R.id.locationName);
        fictionalNameTextView.setText(currentLocation.getFictionalName());


        TextView actualNameTextView = listItemView.findViewById(R.id.locationActualName);
        actualNameTextView.setText(currentLocation.getActualName());


        TextView locationInfoTextView = listItemView.findViewById(R.id.locationInfo);
        locationInfoTextView.setText(currentLocation.getLocationInfo());

        return listItemView;
    }
}

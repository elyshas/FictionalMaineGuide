package com.example.android.fictitiousmaineguide;

/**
 * Created by elysh on 8/6/2018.
 */

public class Location {

    private String mFictionalName;

    private String mActualName;

    private String mLocationInfo;

    private String mMapLink;

    public Location(String FictionalName, String ActualName, String LocationInfo, String MapLink){
        mFictionalName = FictionalName;
        mActualName = ActualName;
        mLocationInfo = LocationInfo;
        mMapLink = MapLink;
    }

    public String getFictionalName() {
        return mFictionalName;
    }

    public String getActualName() {
        return mActualName;
    }

    public String getLocationInfo() {
        return mLocationInfo;
    }

    public String getMapLink() {
        return mMapLink;
    }

}


package com.example.android.fictitiousmaineguide;

/**
 * Created by elysh on 8/6/2018.
 */

public class Location {

    private String mFictionalName;

    private String mActualName;

    private String mLocationInfo;

    private String mWebLink;

    public Location(String FictionalName, String ActualName, String LocationInfo, String WebLink){
        mFictionalName = FictionalName;
        mActualName = ActualName;
        mLocationInfo = LocationInfo;
        mWebLink = WebLink;
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

    public String getWebLink() {
        return mWebLink;
    }

}


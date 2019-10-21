package com.example.android.tourguideapp;


public class Word {
    final private int NO_IMAGE_PROVIDED = -1;
    private String mEventName;
    private String mEventAddress;
    private String mEventCity;
    private String mEventHours;
    private int mImageId = NO_IMAGE_PROVIDED;


    public Word(String name, String eventAddress, String eventCity,
                String hours, int imageId){
        mEventName = name;
        mEventAddress = eventAddress;
        mEventCity = eventCity;
        mEventHours = hours;
        mImageId = imageId;
    }

    public Word(String name, String eventAddress, String eventCity, String hours){
        mEventName = name;
        mEventAddress = eventAddress;
        mEventCity = eventCity;
        mEventHours = hours;
    }


    public String getEventName () {
        return mEventName;
    }

    public String getEventAddress() {
        return mEventAddress;
    }

    public String getEventCity() {
        return mEventCity;
    }

    public String getEventHours () {
        return mEventHours;
    }

    public int getImageId() {
        return mImageId;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
}

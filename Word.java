package com.example.android.tourapp;

public class Word {

    private int mDefaultPark;

    private int mDetails;

    private int mRating;

    private int mImageResourceId = No_IMAGE_PROVIDED;

    private static final int No_IMAGE_PROVIDED = -1;

    public Word(int defaultPark, int details, int rating){
        mDefaultPark = defaultPark;
        mDetails = details;
        mRating = rating;
    }

    public Word(int defaultPark, int details, int imageResourceId, int rating){
        mRating = rating;
        mDetails = details;
        mDefaultPark = defaultPark;
        mImageResourceId = imageResourceId;
    }

    public int getDefaultPark() {
        return mDefaultPark;
    }

    public int getRating() {
        return mRating;
    }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getDetails() {
        return mDetails;
    }

    public boolean hasImage(){
        return mImageResourceId != No_IMAGE_PROVIDED;
    }
}

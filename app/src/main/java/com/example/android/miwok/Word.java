package com.example.android.miwok;

// This is the custom Word constructor to handle
// the displaying of the Miwok and English words for
// each categoty.

public class Word {
    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageId){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageId = imageId;
    }

    public String getMiwokTranslation () {
        return mMiwokTranslation;
    }

    public String getDefaultTranslation () {
        return mDefaultTranslation;
    }

    public int getImageId() {
        return mImageId;
    }

    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }
}

package com.example.android.tourguideapp;

public class Attraction {

    /**
     * Constant value that represents no image was provided for this Attraction
     */
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     * String resource ID for the name of the attraction
     */
    private int mNameId;
    /**
     * String resource ID for the address of the attraction
     */
    private int mAddressId;
    /**
     * String resource ID for the short description of the attraction
     */
    private int mShortInfoId;
    /**
     * String resource ID for the long description of the attraction
     */
    private int mLongInfoId;
    /**
     * Image resource ID for the attraction
     */
    private int mImageId = NO_IMAGE_PROVIDED;

    /**
     * Create a new Attraction object.
     *
     * @param nameId      is the string resource ID for the name of attraction
     * @param shortInfoId is the string resource Id for the short description of attraction
     */
    public Attraction(int nameId, int addressId, int shortInfoId, int longInfoId, int imageId) {
        mNameId = nameId;
        mAddressId = addressId;
        mShortInfoId = shortInfoId;
        mLongInfoId = longInfoId;
        mImageId = imageId;

    }

    /**
     * Create a new Attraction object.
     *
     * @param nameId      is the string resource ID for the name of attraction
     * @param shortInfoId is the string resource Id for the short description of attraction
     * @param imageId     is the drawable resource ID for the image associated with the attraction
     */
    public Attraction(int nameId, int shortInfoId, int imageId) {
        mNameId = nameId;
        mShortInfoId = shortInfoId;
        mImageId = imageId;
    }

    /**
     * Get the string resource ID for the default translation of the attraction.
     */
    public int getmNameId() {
        return mNameId;
    }

    /**
     * Get the string resource ID for the short description of the attraction.
     */
    public int getmShortInfoId() {
        return mShortInfoId;
    }

    /**
     * Get the string resource ID for the address of the attraction.
     */
    public int getmAddressId() {
        return mAddressId;
    }

    /**
     * Get the string resource ID for the long description of the attraction.
     */
    public int getmLongInfoId() {
        return mLongInfoId;
    }

    /**
     * Return the image resource ID of the attraction.
     */
    public int getmImageId() {
        return mImageId;
    }

    /**
     * Returns whether or not there is an image for this attraction.
     */
    public boolean hasImage() {
        return mImageId != NO_IMAGE_PROVIDED;
    }

}
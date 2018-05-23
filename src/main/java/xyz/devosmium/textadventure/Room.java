/*******************************************************************************
 * Copyright (c) 2018. All rights reserved. No part of this software package can be reproduced or stored in a
 * retrieval system except for the express purpose of contributing to this software package. No derivatives may be made.
 ******************************************************************************/

package xyz.devosmium.textadventure;

import java.util.Arrays;

public class Room {

    private String mName;
    private EnumCompassDir[] mExits;
    private String mDescription;
    private String[] mSpecialCharacteristics;
    private String[] mResponses;

    public Room(String name, EnumCompassDir[] exits, String[] specialCharacteristics, String[] responses) {
        mName = name;
        mExits = exits;
        mSpecialCharacteristics = specialCharacteristics;
        mResponses = responses;
    }


    public String getmName() {
        return mName;
    }

    public void setName(String mName) {
        this.mName = mName;
    }

    public EnumCompassDir[] getmExits() {
        return mExits;
    }

    public void setExits(EnumCompassDir[] mExits) {
        this.mExits = mExits;
    }

    public String getmDescription() {
        String descriptionWithExits = mDescription + "\n" + "Exits are: " + Arrays.toString(mExits);
        return descriptionWithExits;
    }

    public void setDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public String[] getmSpecialCharacteristics() {
        return mSpecialCharacteristics;
    }

    public void setmSpecialCharacteristics(String[] mSpecialCharacteristics) {
        this.mSpecialCharacteristics = mSpecialCharacteristics;
    }

    public String[] getmResponses() {
        return mResponses;
    }

    public void setmResponses(String[] mResponses) {
        this.mResponses = mResponses;
    }
}

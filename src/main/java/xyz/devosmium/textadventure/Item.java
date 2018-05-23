/*******************************************************************************
 * Copyright (c) 2018. All rights reserved. No part of this software package can be reproduced or stored in a
 * retrieval system except for the express purpose of contributing to this software package. No derivatives may be made.
 ******************************************************************************/

package xyz.devosmium.textadventure;


public class Item {

    private String mName;
    private String mDescription;
    private float mDamageMod;

    public Item(String name, String description, boolean isWeapon, float damageMod) {
        mName = name;
        mDescription = description;
        if (isWeapon) {
            mDamageMod = damageMod;
        } else {

        }
    }

    public String getmName() {
        return mName;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }

    public float getmDamageMod() {
        return mDamageMod;
    }

    public void setmDamageMod(float mDamageMod) {
        this.mDamageMod = mDamageMod;
    }
}

/*******************************************************************************
 * Copyright (c) 2018. All rights reserved. No part of this software package can be reproduced or stored in a
 * retrieval system except for the express purpose of contributing to this software package. No derivatives may be made.
 ******************************************************************************/

package xyz.devosmium.textadventure;

public class Player {

    private String mName;
    private int mGold;
    private String[] mInventory;
    private int mCarryCapacity;
    private int mLevel;
    private Room mCurrentRoom;
    public Player(String name, int gold, String[] inventory, int carryCapacity, Room currentRoom) {
        mName = name;
        mGold = gold;
        mInventory = inventory;
        mCarryCapacity = carryCapacity;
        mLevel = 0;
        mCurrentRoom = currentRoom;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public int getmGold() {
        return mGold;
    }

    public void setmGold(int mGold) {
        this.mGold = mGold;
    }

    public String[] getmInventory() {
        return mInventory;
    }

    public void setmInventory(String[] mInventory) {
        this.mInventory = mInventory;
    }

    public int getmCarryCapacity() {
        return mCarryCapacity;
    }

    public void setmCarryCapacity(int mCarryCapacity) {
        this.mCarryCapacity = mCarryCapacity;
    }

    public int getmLevel() {
        return mLevel;
    }

    public void setmLevel(int mLevel) {
        this.mLevel = mLevel;
    }

    public Room getmCurrentRoom() {
        return mCurrentRoom;
    }

    public void setmCurrentRoom(Room mCurrentRoom) {
        this.mCurrentRoom = mCurrentRoom;
    }
}

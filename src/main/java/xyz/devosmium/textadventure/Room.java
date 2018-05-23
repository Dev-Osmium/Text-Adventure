package xyz.devosmium.textadventure;

import java.util.Arrays;

public class Room {

    private String mName;
    private String[] mExits;
    private String mDescription;
    private String[] mSpecialCharacteristics;
    private String[] mResponses;

    public Room(String name, String[] exits, String[] specialCharacteristics, String[] responses) {
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

    public String[] getmExits() {
        return mExits;
    }

    public void setExits(String[] mExits) {
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

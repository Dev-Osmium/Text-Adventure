package xyz.devosmium.textadventure;

public class Room {

    private String mName;
    private String[] mExits;
    private String mDescription;
    private String[] mSpecialCharacteristics;

    public Room(String name, String[] exits, String[] specialCharacteristics) {
        mName = name;
        mExits = exits;
        mSpecialCharacteristics = specialCharacteristics;
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
        String descriptionWithExits = mDescription + "\n" + "Exits are: " + mExits.toString();
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
}

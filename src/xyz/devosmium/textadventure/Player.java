package xyz.devosmium.textadventure;

public class Player {

    private String mName;
    private int mGold;
    private String[] mInventory;
    private int mCarryCapacity;
    private int mLevel;
    public Player(String name, int gold, String[] inventory, int carryCapacity) {
        mName = name;
        mGold = gold;
        mInventory = inventory;
        mCarryCapacity = carryCapacity;
        mLevel = 0;
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
}

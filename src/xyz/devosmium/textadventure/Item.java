package xyz.devosmium.textadventure;

import com.sun.istack.internal.Nullable;

public class Item {

    private String mName;
    private int mDamageMod;
    private String mDescription;

    public Item(String name, int damageMod, @Nullable String description) {
        mName = name;
        mDamageMod = damageMod;
        mDescription = description;
    }

    public String getmName() {
        return mName;
    }

    public int getmDamageMod() {
        return mDamageMod;
    }

    public void setmDamageMod(int mDamageMod) {
        this.mDamageMod = mDamageMod;
    }

    public String getmDescription() {
        return mDescription;
    }
}

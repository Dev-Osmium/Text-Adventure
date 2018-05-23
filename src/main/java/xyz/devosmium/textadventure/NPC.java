/*******************************************************************************
 * Copyright (c) 2018. All rights reserved. No part of this software package can be reproduced or stored in a
 * retrieval system except for the express purpose of contributing to this software package. No derivatives may be made.
 ******************************************************************************/

package xyz.devosmium.textadventure;

public class NPC {
	
	private String mName;
	private String[] mWeapons;
	private int mHp;
	private String[] mEffects;
	
	public NPC(String name, String[] weapons, int hp, String[] effects) {
		mName = name;
		mWeapons = weapons;
		mHp = hp;
		mEffects = effects;
	}
	
	public String getmName() {
		return mName;
	}
	
	public void setmName(String mName) {
		this.mName = mName;
	}
	
	public String[] getmWeapons() {
		return mWeapons;
	}
	
	public void setmWeapons(String[] mWeapons) {
		this.mWeapons = mWeapons;
	}
	
	public int getmHp() {
		return mHp;
	}
	
	public void setmHp(int mHp) {
		this.mHp = mHp;
	}
	
	public String[] getmEffects() {
		return mEffects;
	}
	
	public void setmEffects(String[] mEffects) {
		this.mEffects = mEffects;
	}
}

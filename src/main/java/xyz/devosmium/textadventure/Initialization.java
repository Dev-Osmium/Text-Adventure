/*******************************************************************************
 * Copyright (c) 2018. All rights reserved. No part of this software package can be reproduced or stored in a
 * retrieval system except for the express purpose of contributing to this software package. No derivatives may be made.
 ******************************************************************************/

package xyz.devosmium.textadventure;

import java.util.ArrayList;
import java.util.List;

public class Initialization {
	
	public Initialization() {
	
	}
	
	/**
	 *
	 * @return an ArrayList of Rooms
	 * @author Owen Salter
	 */
	public List<Room> initializeRooms() {
		List<Room> roomArrayList = new ArrayList<Room>();
		//Instantiate all rooms before setting their descriptions
		Room cell1 = new Room("cell1", new EnumCompassDir[]{EnumCompassDir.NORTH}, new String[]{"door=locked"}, new String[]{"north"});
		Room dungeonHall = new Room("dungeonHall", new EnumCompassDir[]{EnumCompassDir.NORTH, EnumCompassDir.SOUTH}, null, new String[]{"north", "south"});
		Room kingBathroom = new Room("kingBathroom", new EnumCompassDir[]{EnumCompassDir.EAST, EnumCompassDir.DOWN}, null, new String[]{"east", "down"});
		Room kingBedroom = new Room("kingBedroom", new EnumCompassDir[]{EnumCompassDir.EAST, EnumCompassDir.DOWN}, new String[]{"desk=unlooted"}, new String[]{"north", "down", "loot"});
		
		
		//Add all the descriptions
		cell1.setDescription("You find yourself in a dark and wet prison cell. There is an iron door set into the north wall, and a small " +
				"window set into the east wall.");
		dungeonHall.setDescription("You are in a long, stone hallway lined with iron doors much like the one behind you. There are " +
				"torches every few feet. There is a wooden door at the end of the hallway.");
		kingBathroom.setDescription("You push the trapdoor open and you emerge in a fancy bathroom. There is a wooden halfdoor to the " +
				"left and a window to the right that looks down about fifty feet to the ground.");
		kingBedroom.setDescription("You enter the room and see the most opulent room that you have ever been in.\n" +
				"There is a desk to your right, a massive feather bed to your left, and an angry King right in front of you.");
		
		
		// Add all the rooms to the arraylist
		roomArrayList.add(cell1);
		roomArrayList.add(dungeonHall);
		roomArrayList.add(kingBathroom);
		roomArrayList.add(kingBedroom);
		return roomArrayList;
	}
	
}

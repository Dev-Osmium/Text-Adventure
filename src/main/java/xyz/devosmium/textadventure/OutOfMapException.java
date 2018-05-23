/*******************************************************************************
 * Copyright (c) 2018. All rights reserved. No part of this software package can be reproduced or stored in a
 * retrieval system except for the express purpose of contributing to this software package. No derivatives may be made.
 ******************************************************************************/

package xyz.devosmium.textadventure;

public class OutOfMapException extends RuntimeException {
	
	public OutOfMapException() {
		super("You went out of the map");
	}
	
}

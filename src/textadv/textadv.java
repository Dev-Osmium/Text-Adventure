package textadv;/*
 * Copyright (c) 2016. All Rights Reserved. This file is under the protection of the GNU General Public License 3.0 ShareAlike Attribution.
 */
/*    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    */

import java.util.Scanner;


public class textadv {
    static final Scanner scanner = new Scanner(System.in);

    public static void main(String args[]) {
        //Declare Vars here.
	    String playerLoc = "jailCell";
	    Boolean hasWon = false;
	    String playerChoice = null;
	    String map = null;
        float hp = 20;
	    int gold = 0;
	    double VERSION = 0.6;
        System.out.println("Welcome to The Castle v" + VERSION);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Your goal is to find the end of the castle");
        System.out.println("Have fun, and don't forget to give feedback on the website!");
		while (hasWon == false) {
			switch (playerLoc) {
				case "jailCell":
					System.out.println("You are standing in a small, cramped dungeon");
					System.out.println("There is a small puddle in the corner");
					System.out.println("There is a large, heavy locked door to the north.");
					System.out.println(">");
					playerChoice = scanner.next();
					switch (playerChoice) {
						case "wait":
							System.out.println("The jailer comes with a tray of food.");
							System.out.println("There is a knife on the tray");
							System.out.println(">");
							playerChoice = null;
							playerChoice = scanner.next();
							switch (playerChoice) {
								case "fight":
									System.out.println("Fight what?");
									playerChoice = null;
									playerChoice = scanner.next();
									switch (playerChoice) {
										case "jailer":
											System.out.println("You take the knife and stab the jailer");
											System.out.println("Exits are: North");
											System.out.println(">");
											playerChoice = null;
											playerChoice = scanner.next();
											switch (playerChoice) {
												case "north":
													System.out.println("You go through the door.");
													playerChoice = null;
													playerLoc = "dungeonHall";
													break;
											}
									}
							}
					}
				case "dungeonHall":
					System.out.println("You are standing in a corridor running north,");
					System.out.println("The walls are lined with doors");
					System.out.println("You hear the prisoners eating.");
					System.out.println("Exits are: North, South");
					System.out.print(">");
					playerChoice = scanner.next();
					switch (playerChoice) {
						case "south":
							playerLoc = "jailCell";
					}
			}


		}
    }



    private static void gameOver (String diedOf ) {
        System.out.println("GAME OVER");
        System.out.println("You died of " + diedOf);
        System.out.println("Score System TBA");
        System.out.println("Kill Count System TBA");
        System.out.println("I Hope you Had Fun Playing...");
        System.out.println("THE CASTLE");
        System.exit(0);
        }
}
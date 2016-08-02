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
        float hp = 20;
        int gold = 0;


        double VERSION = 0.6;
        System.out.println("Welcome to The Castle v" + VERSION);
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("Your goal is to find the end of the castle");
        System.out.println("Play? Y/N");
        String play = scanner.next();

        switch (play) {
            case "y":
                System.out.println("Welcome to the Castle.");
                System.out.println("You must make it to the end in order to escape.");
                System.out.println("The more gold you find, the more points you get.");
	            System.out.println("You are standing in a dungeon. There is a puddle of water.");
	            System.out.println("If you wait, the jailer will come.");
	            System.out.print("");
	            System.out.print(">");
	            String choice1 = scanner.next();
	            switch (choice1) {
		            case "wait":
			            System.out.println("You wait a while. The Jailer comes.");
			            System.out.println("You find a knife on the tray he brings.");
			            System.out.print("");
			            System.out.println(">");
			            String choice2 = scanner.next();
			            System.out.println(choice2);
			            switch (choice2) {
				            case "attack":
					            System.out.println("You take the knife and stab him in the back.");
					            System.out.println("You get 20 gold!");
					            gold += 20;
					            System.out.println("Exits are: north");
					            System.out.println("Go where?");
					            String choice3 = scanner.next();
					            switch (choice3) {

						            case "north":
							            System.out.println("You're in a corridor, lined with cells.");
							            System.out.println("There are stairs at either end.");
							            System.out.println("Exits are: east, west");
							            System.out.println("Go where?");
							            String choice4 = scanner.next();
							            switch (choice4){

								            case "east":
									            System.out.println("You're at the eastern end of the corridor");
									            System.out.println("Exits are: up, west");
									            System.out.println("Go Where?");
									            String choice5 = scanner.next();
									            switch (choice5){

										            case "up":
											            System.out.println("You're in a staircase.");
											            System.out.println("Exits are: up, down");
											            System.out.println("Go where?");
											            String choice6 = scanner.next();
											            switch (choice6) {
												            case "up":
													            System.out.println("You're in the royal bathroom.");
													            System.out.println("You wonder why the dungeons are beneath the toilet.");
													            System.out.println("There is a gilded door to the north.");
													            System.out.println("Exits are: north");
													            System.out.println("Go where?");
													            String choice7 = scanner.next();
													            switch (choice7) {
														            case "north":
															            System.out.println("You're in the king's bedchambers");
															            System.out.println("There is a bouncy bed");
															            System.out.println("There is a desk with a lot of drawers.");
															            System.out.print("");
															            System.out.println(">");
															            String choice8 = scanner.next();
															            switch (choice8) {
																            case "bounce":
																	            System.out.println("You bounced on the bed.");
																	            System.out.println("The bed broke and you died.");
																	            gameOver("Drowning");
																            case "desk":
																	            System.out.println("Do what with the desk?");
																	            System.out.println(">");
																	            String choice9 = scanner.next();
																	            switch (choice9) {
																		            case "inspect":
																			            System.out.println("You look through all the drawers.");
																			            System.out.println("You took a long time, and the king");
																			            System.out.print(" arrived.");
																			            System.out.println("He doesn't like you, and chops off");
																			            System.out.println("your head.");
																			            gameOver("Unfriendly king");
																	            }
															            }
													            }
											            }

									            }

							            }
					            }


			            }
		            case "drink":
			            System.out.println("Drink What?");
			            System.out.print("");
			            System.out.println(">Drink ");
			            String choice3 = scanner.next();
			            switch (choice3){
				            case "puddle":
					            System.out.println("You drank the puddle, and also rat pee.");

					            gameOver("Contaminated Puddle");

			            }
		            case "force":
			            System.out.println("Force What?");
			            System.out.print("");
			            System.out.println(">Force ");
			            choice3 = scanner.next();
			            switch (choice3) {
				            case "door":
					            System.out.println("You're too thirsty");
			            }
		            case "help":
			            System.out.println("Commands are:");
			            System.out.println("help-Display this message");
			            System.out.println("gold-Displays your current gold.*");
			            System.out.println("kills-Displays your kills*");
			            System.out.println("info-Displays Information");
			            System.out.println("quit-Quits the game.");
			            System.out.println("A * denotes a WIP feature.");
	            }
                System.out.println("Thanks for Playing!");

            case "n":
                System.out.println("Thanks for loading, anyways... :(");
                System.exit(2);
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
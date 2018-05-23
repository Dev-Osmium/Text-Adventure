
/*******************************************************************************
 * Copyright (c) 2018. All rights reserved. No part of this software package can be reproduced or stored in a
 * retrieval system except for the express purpose of contributing to this software package. No derivatives may be made.
 ******************************************************************************/

package xyz.devosmium.textadventure;



import java.util.Scanner;

public class Main {

    public static Player player1;
    public static Scanner sc = new Scanner(System.in);
    public static boolean notDead = true;
    public static void main(String[] args) {
        /* Creates the rooms */
        Room cell1 = new Room("cell1", new String[]{"north"}, new String[]{"door=locked"}, new String[]{"north","wait"});
        cell1.setDescription("You find yourself in a dark and wet prison cell. There is an iron door set into the north wall, and a small " +
                "window set into the east wall.");
        Room dungeonHall = new Room("dungeonHall", new String[]{"north", "south"}, null, new String[]{"north", "south"});
        dungeonHall.setDescription("You are in a long, stone hallway lined with iron doors much like the one behind you. There are " +
                "torches every few feet. There is a wooden door at the end of the hallway.");

        System.out.println("Welcome to THE CASTLE, a revolutionary new Text Adventure game.");
        System.out.println("We need some information before we start.");
        System.out.print("What is your name? ");
        String name = sc.next();
        if (name.equalsIgnoreCase("god")) {
            System.out.println("WHOA REALLY?");
        }
        player1 = new Player(name, 100, new String[]{}, 10, cell1);
        System.out.println("Your goal is simple. You must escape...");
        System.out.println("  _______ _    _ ______    _____           _____ _______ _      ______");
        System.out.println(" |__   __| |  | |  ____|  / ____|   /\\    / ____|__   __| |    |  ____|");
        System.out.println("    | |  | |__| | |__    | |       /  \\  | (___    | |  | |    | |__   ");
        System.out.println("    | |  |  __  |  __|   | |      / /\\ \\  \\___ \\   | |  | |    |  __|  ");
        System.out.println("    | |  | |  | | |____  | |____ / ____ \\ ____) |  | |  | |____| |____ ");
        System.out.println("    |_|  |_|  |_|______|  \\_____/_/    \\_\\_____/   |_|  |______|______|");

        while(notDead) {
            Room currentRoom = player1.getmCurrentRoom();
            System.out.println(currentRoom.getmDescription());
            switch (currentRoom.getmName()) {
                case "cell1":
                    switch (getInput(currentRoom.getmResponses())) {
                        case "north":
                            if(currentRoom.getmSpecialCharacteristics()[0].equalsIgnoreCase("door=locked")) {
                                System.out.println("The door is locked. You notice a bowl of food on the floor and assume that" +
                                        " the jailor will come by soon and open the door to collect it.");
                                break;
                            } else if(currentRoom.getmSpecialCharacteristics()[0].equalsIgnoreCase("door=unlocked")) {
                                System.out.println("Realizing that the door is unlocked, you push it open and venture out.");
                                player1.setmCurrentRoom(dungeonHall);
                            }
                        case "wait":
                            System.out.println("After waiting for what seems like ages, you hear a key turn in the rusty lock. " +
                                    "The door swings open to reveal an ancient jailer who seems to be on his last few years of life. " +
                                    "You push him over, and run out the door.");
                            currentRoom.setmSpecialCharacteristics(new String[]{"door=unlocked"});
                            player1.setmCurrentRoom(dungeonHall);
                            break;

                    }
                case "dungeonHall":
                    switch (getInput(currentRoom.getmResponses())) {
                        case "north":
                            System.out.println("Hi");
                    }
            }
        }
    }

    public static String getInput(String[] responses) {
        boolean answeredCorrectly = false;
        String userInput = null;
        while (!answeredCorrectly) {
            System.out.print(">");
            userInput = sc.next();
            for (int i = 0; i < responses.length; i++) {
                if (userInput.equalsIgnoreCase(responses[i])) {
                    return userInput;
                } else {
                    System.out.println("That is not an acceptable response.");
                    answeredCorrectly = false;
                }
            }
        }
        return userInput;
    }
}
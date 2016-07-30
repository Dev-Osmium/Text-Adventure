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


class textadv {
    private static final Scanner scanner = new Scanner(System.in);

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
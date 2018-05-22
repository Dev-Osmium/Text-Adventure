package xyz.devosmium.textadventure;

import java.util.Scanner;

public class Main {

    public static Player player1;
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to THE CASTLE, a revolutionary new Text Adventure game.");
        System.out.println("We need some information before we start.");
        System.out.print("What is your name? ");
        String name = sc.next();
        player1 = new Player(name, 100, new String[]{}, 10);
        System.out.println("Your goal is simple. You must escape...");
        System.out.println("  _______ _    _ ______    _____           _____ _______ _      ______");
        System.out.println(" |__   __| |  | |  ____|  / ____|   /\\    / ____|__   __| |    |  ____|");
        System.out.println("    | |  | |__| | |__    | |       /  \\  | (___    | |  | |    | |__   ");
        System.out.println("    | |  |  __  |  __|   | |      / /\\ \\  \\___ \\   | |  | |    |  __|  ");
        System.out.println("    | |  | |  | | |____  | |____ / ____ \\ ____) |  | |  | |____| |____ ");
        System.out.println("    |_|  |_|  |_|______|  \\_____/_/    \\_\\_____/   |_|  |______|______|");
        Room cell = new Room("cell", new String[]{"north"});
        cell.setDescription("You are in a goddamn cell.");
        System.out.println(cell.getmDescription());
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
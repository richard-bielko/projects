package game_logic;

import java.util.Scanner;

public class GameLogic {
    static Scanner scanner = new Scanner(System.in);
    static Player player;
    public static boolean isRunning;
    public static void main(String[] args) {
    }
    //--------------------------------------------------------------------------------------------
    // get input method
    public static int getInput(int choices) {
        int input;
        do {
            System.out.println("->");
            try {
                input = Integer.parseInt(scanner.next());
            } catch (Exception exception) {
                input = -1;
                System.out.println("Please enter a number of your choice (integer)");
            }
        } while ( input < 1 || input > choices);
        return input;
    }
    //--------------------------------------------------------------------------------------------
    // clear the screen method
    public static void clearScreen() {
        for (int i = 0; i < 100; i++) {
            System.out.println();
        }
    }
    //--------------------------------------------------------------------------------------------
    // print a separator method
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }
    //--------------------------------------------------------------------------------------------
    // print head method
    public static void head(String text) {
        printSeparator(30);
        System.out.println(text);
        printSeparator(30);
        System.out.println();
    }
    //--------------------------------------------------------------------------------------------
    // wait method
    public static void waitForTheUser() {
        System.out.println("\nEnter anything to continue...");
        scanner.next();
    }
    //--------------------------------------------------------------------------------------------
    // Start the game, choose Name and initialize the Player characer
    public static void startTheGame(){
        boolean gameSet = false;
        String name = "";
        clearScreen();
        printSeparator(40);
        printSeparator(20);
        System.out.println("HERO LIKE NO OTHER");
        printSeparator(20);
        printSeparator(40);
        waitForTheUser();
        // ask player to choose his name
       do {
           clearScreen();
           head("What is your name?");
           name = scanner.next();
           clearScreen();
           System.out.println("Your name is " + name + ", correct?");
           System.out.println("(1) Yes!");
           System.out.println("(2) No, I want to change it.");
           int input = getInput(2);
           if (input == 1){
               gameSet = true;
           }
       } while (!gameSet);

        // create a player
        player = new Player(name);


        // check if the game is running
        isRunning = true;

        // start main game loop
        gameLoop();
    }
    //--------------------------------------------------------------------------------------------
    // Character info method.
    public static void characterInfo() {
        clearScreen();
        head("Character Info");
        printSeparator(20);
        System.out.println(player.name + "\tHP: " + player.hp + "\tMax HP: " + player.maxHp);
        printSeparator(20);
        System.out.println("XP: " + player.xp);
        printSeparator(20);
        System.out.println("Your attack: +" + player.attackPoints);
        System.out.println("Your defense: +" + player.defensePoints);
        System.out.println("Your speed: +" + player.speedPoints);
        System.out.println("Your charisma: +" + player.charismaPoints);
        waitForTheUser();
    }
    //--------------------------------------------------------------------------------------------
    // Menu                                                      // replace "Menu" with "location"
    public static void printMenu() {
        clearScreen();
        head("Menu");
        System.out.println("Choose an action");
        printSeparator(20);
        System.out.println("(1) Continue on your journey");
        System.out.println("(2) Character Info");
        System.out.println("(3) Exit game");
    }
    //--------------------------------------------------------------------------------------------
    // Game loop
    public static void gameLoop(){
        while (isRunning) {
            printMenu();
            int input = getInput(3);
            if (input == 1){
                //continueJourney();
            } else if (input == 2) {
                characterInfo();
            } else {
                isRunning = false;
            }
            }
        }

}

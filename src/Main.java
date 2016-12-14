import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Runs the program.
 *
 * @author Erika Sankari
 * @author Toni Seppalainen
 * @version 2016.1124
 * @since 1.7
 */
public class Main {

    /**
     * Reads user input from console.
     */
    private static Scanner scanner = new Scanner(System.in);

    /**
     * Holds player1's information.
     */
    private static Human player1;

    /**
     * Holds player2's information.
     */
    private static Human player2;

    /**
     * Holds computer's information.
     */
    private static Computer computer;

    /**
     * Holds information about the gameboard.
     */
    private static Gameboard gameboard;

    /**
     * Acts as a starting point of the program.
     *
     * @param args not used
     */
    public static void main(String[] args) {

        String a = "";
        a += "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
        a += "+                                                           +\n";
        a += "+         #####   ###   #####  #####  #      #####          +\n";
        a += "+         #  #   #   #    #      #    #      #              +\n";
        a += "+         ###    #####    #      #    #      ###            +\n";
        a += "+         #  #   #   #    #      #    #      #              +\n";
        a += "+         #####  #   #    #      #    #####  #####          +\n";
        a += "+                                                           +\n";
        a += "+                  #####  #   #  ##  #####                  +\n";
        a += "+                  #      #   #  ##  #   #                  +\n";
        a += "+                  #####  #####  ##  #####                  +\n";
        a += "+                      #  #   #  ##  #                      +\n";
        a += "+                  #####  #   #  ##  #                      +\n";
        a += "+                                                           +\n";
        a += "+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n";
        System.out.println(a);

        int players = 0;
        try {
            do {
                System.out.println("Number of players? (max 2)");
                players = scanner.nextInt();
            } while (players <= 0 || players > 2);
        } catch (InputMismatchException e) {
            e.printStackTrace();
        }

        player1 = new Human();
        if (players == 1) {
            computer = new Computer();
            gameboard = new Gameboard(player1, computer);
        } else {
            player2 = new Human();
            gameboard = new Gameboard(player1, player2);
        }

        System.out.println(gameboard);
    }

    /**
     * Creates ships for a player interactively.
     *
     * Asks the player where to place each ships
     * start and end points. After receiving valid
     * ship coordinates, creates the ship
     * objects for the player.
     *
     * @param player The player to add ships for.
     */
    private static void setupShips(Player player) {

    }

    /**
     * Creates ships in random coordinates for the player.
     *
     * Used mainly for creating AI ships without getting
     * input from the player.
     *
     * @param player The player to create ships for.
     */
    private void randomSetupShips(Player player) {

    }

    /**
     * Places a ship for a player.
     *
     * Gets input from the player for adding a single ship
     * and validates if ship can be placed in given coordinates.
     * This is repeated until the player gives a valid places
     * a ship in valid coordinates or placing the ship was canceled.
     *
     * @param player The player to place a ship for.
     * @return True if a ship was placed, otherwise false.
     */
    private boolean placeShip(Player player) {
        return false;
    }
}



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
    Human player2;

    /**
     * Holds computer's information.
     */
    Computer computer;

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

    }
}

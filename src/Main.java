import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Runs the program.
 *
 * @author Erika Sankari
 * @version 2016.1124
 * @since 1.7
 */
public class Main {

    /**
     * Reads user input from console.
     */
    static Scanner scanner = new Scanner(System.in);

    /**
     * Acts as a starting point of the program.
     *
     * @param args not used
     */
    public static void main(String[] args) {
        int players;
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

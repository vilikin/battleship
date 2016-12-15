/**
 * The class Math contains basic mathods to perform basic numeric operations.
 *
 */
public class Math {

    /**
     * Adds two integer values together and prints the sum of those numbers.
     *
     * @param number1 integer value
     * @param number2 integer value
     * @return result sum of number1 and number2
     */
    public int plus(int number1, int number2) {
        int result = number1 + number2;
        return result;
    }

    /**
     * Takes two numbers and substracts second number from first number.
     *
     * @param number1 number to substract from
     * @param number2 reducer
     * @return result substraction of number1 and number2
     */
    public int minus(int number1, int number2) {
        int result = number1 - number2;
        return result;
    }

    /**
     * Takes two numbers and multiplies them.
     *
     * @param number1 integer value
     * @param number2 integer value
     * @return result multiplication result
     */
    public int multiplication(int number1, int number2) {
        int result = number1 * number2;
        return result;
    }

    /**
     * Takes two numbers and divides the first number by the second number.
     *
     * @param number1 dividend
     * @param number2 divider
     * @return result division result
     */
    public double division(int number1, int number2) {
        double result = (double) number1 / number2;
        return result;
    }

    /**
     * Takes String argument that it tries to parse to integer.
     *
     * @param text must contain only numbers
     * @return integer representation of given String
     */
    public int stringToInt(String text) {
        int result;

        try {
            result = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("text must contain only numbers!");
        }

        return result;
    }

    /**
     * Takes String argument that it tries to parse to double.
     *
     * @param text must contain only numbers
     * @return double representation of given String
     */
    public double stringToDouble(String text) {
        double result;

        try {
            result = Double.parseDouble(text);
        } catch (NumberFormatException e) {
            System.out.println("text must contain only numbers");
        }

        return result;
    }

    /**
     * Takes two int numbers and returns random number between them.
     *
     * @param min number
     * @param max number
     * @return random number between min and max
     */
    public int random(int min, int max) {
        int randomNumber = (int) Math.floor(Math.random() * max) + min;
        return randomNumber;
    }
}

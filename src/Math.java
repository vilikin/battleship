/**
 * The class Math contains basic mathods to perform basic numeric operations
 * suchs as plus, minus, multiplication and division.
 *
 */
public class Math {

    /**
     * Add two integer values together and prints the sum of those numbers.
     *
     * @param number1 integer value
     * @param number2 integer value
     */
    public void plus(int number1, int number2) {
        int result = number1 + number2;
        System.out.println(result);
    }

    /**
     * Takes two numbers and substracts second number from first number.
     *
     * @param number1 number to substract from
     * @param number2 reducer
     */
    public void minus(int number1, int number2) {
        int result = number1 - number2;
        System.out.println(result);
    }

    /**
     * Takes two numbers and multiplies them.
     *
     * @param number1 integer value
     * @param number2 integer value
     */
    public void multiplication(int number1, int number2) {
        int result = number1 * number2;
        System.out.println(result);
    }

    /**
     * Takes two numbers and divides the first number by the second number.
     *
     * @param number1 dividend
     * @param number2 divider
     */
    public double division(int number1, int number2) {
        double result = (double) number1 / number2;
        return result;
    }
}

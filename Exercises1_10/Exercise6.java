package Exercises1_10;

public class Exercise6 {

    static private int sumOfSquares(int naturalNumbers) {
        int sum = 0;
        for (int i = 0; i <= naturalNumbers; i++) {
            sum = sum + (int) Math.pow(i, 2);
        }
        return sum;
    }

    static private int squareOfSum(int naturalNumbers) {
        int sum = 0;
        for (int i = 0; i <= naturalNumbers; i++) {
            sum = sum + i;
        }

        sum = (int) Math.pow(sum, 2);
        return sum;
    }

    static public int Execute(int maxNaturalNumber) {

        int sumOfSquares = sumOfSquares(maxNaturalNumber);
        int squareOfSum = squareOfSum(maxNaturalNumber);
        int difference = squareOfSum - sumOfSquares;

        return difference;
    }
}

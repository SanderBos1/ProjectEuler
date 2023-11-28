package Exercises1_10;

public class Exercise7 {

    static private Boolean isPrime(int number) {
        boolean isPrime = true;
        double sqrtNumber = Math.round(Math.sqrt((double) number));
        for (int i = 2; i <= sqrtNumber; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;

    }

    static private int xthPrimeNumber(int number) {

        int sum = 0;
        int current = 1;
        while (sum != number) {
            current++;
            Boolean check = isPrime(current);
            if (check) {
                sum++;
            }
        }

        return current;
    }

    static public int Execute(int number) {

        return (xthPrimeNumber(number));

    }
}

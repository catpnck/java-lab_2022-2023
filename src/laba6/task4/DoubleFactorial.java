package laba6.task4;

public class DoubleFactorial {

    public static int factorial(int num) {
        int fact = 1;
        for (int i = num; i >= 1; i -= 2) {
            fact *= i;
        }

        return fact;
    }

    public static int factorialRecursive(int num) {
        if (num <= 2) {
            return num;
        }

        return factorialRecursive(num - 2) * num;
    }

}

package laba6.task5;

public class Square {

    public static int squareSum(int num) {
        int squareSum = 0;
        for (int i = num; i >= 1; i--) {
            squareSum += i * i;
        }
        return squareSum;
    }

    public static int squareSumRecursive(int num) {
        if (num <= 1) {
            return num;
        }
        return squareSumRecursive(num - 1) + num * num;
    }
}

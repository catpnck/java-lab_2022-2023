package laba9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    private static final int[][] MATRIX = new int[][] {
            new int[] {11, 21, 31, 41, 51, 61},
            new int[] {12, 22, 32, 42, 52, 62},
            new int[] {13, 23, 33, 43, 53, 63},
            new int[] {14, 24, 34, 44, 54, 64},
            new int[] {15, 25, 35, 45, 55, 65}
    };

    public static void main(String[] args) {
        var n = -1;
        try (var scanner = new Scanner(System.in)) {
            n = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Введено неверное значение");
            return;
        }

        if (n < 1 || n > MATRIX[0].length) {
            System.out.println("Нет столбца с таким номером.");
            return;
        }

        for (var row : MATRIX) {
            System.out.println(row[n - 1]);
        }
    }
}

package laba11.task;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.print("Введите длину массива: ");
            var n = scanner.nextInt();
            var arr = new int[n];
            inputArray(scanner, arr, n - 1);
            printArray(arr, n - 1);
        }
    }

    public static void inputArray(Scanner scanner, int[] arr, int n) {
        if (n < 0) {
            return;
        }
        inputArray(scanner, arr, n - 1);
        System.out.print("Введите " + (n + 1) + " число: ");
        arr[n] = scanner.nextInt();
    }

    public static void printArray(int[] arr, int n) {
        if (n < 0) {
            return;
        }
        printArray(arr, n - 1);
        System.out.println(arr[n]);
    }
}

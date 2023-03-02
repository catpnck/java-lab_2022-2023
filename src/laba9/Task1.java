package laba9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        var numbers = readNumbers();
        var average = countAverageFromPositiveNumbers(numbers);
        if (average < 0) {
            System.out.println("Вы не ввели ни одного положительного числа");
            return;
        }
        System.out.println(average);
    }

    private static double countAverageFromPositiveNumbers(int[] numbers) {
        var sum = 0;
        var count = 0;
        for (var number : numbers) {
            if (number <= 0) {
                continue;
            }
            sum += number;
            count++;
        }

        if (count == 0) {
            return -1;
        }

        return (double) sum / count;
    }

    private static int[] readNumbers() throws InputMismatchException {
        try (var scanner = new Scanner(System.in)) {
            var n = -1;
            while (n < 0) {
                System.out.print("Введите количество чисел: ");
                try {
                    n = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Введено неверное значение. Попробуйте еще раз.");
                    scanner.next();
                }
                System.out.println();
            }

            System.out.println("Введите " + n + " чисел:");
            var arr = new int[n];
            for (var i = 0; i < n; i++) {
                try {
                    arr[i] = scanner.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Введено неверное значение. Попробуйте еще раз.");
                    scanner.next();
                    i--;
                }
            }

            return arr;
        }
    }
}

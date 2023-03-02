package laba9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        var arr = readBytes();
        byte sum = 0;
        try {
            sum = countSum(arr);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println(sum);
    }

    private static byte countSum(byte[] bytes) {
        var sum = 0;
        for (var num : bytes) {
            sum += num;
        }

        if (sum < Byte.MIN_VALUE || sum > Byte.MAX_VALUE) {
            throw new IllegalArgumentException("Сумма находится за пределами типа byte");
        }

        return (byte) sum;
    }

    private static byte[] readBytes() {
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

            var arr = new byte[n];
            for (var i = 0; i < n; i++) {
                try {
                    arr[i] = scanner.nextByte();
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

package laba3;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int a;
        try {
            a = in.nextInt();
        } catch (Exception e) {
            System.out.println("Введено некорректное значение");
            return;
        }
        if (a < 0) {
            System.out.println("Введено некорректное значение");
            return;
        }
        int[] numbers = new int[a];
        for (int i = 2; i / 5 < a; i += 5) {
            if (i % 5 == 2) {
                numbers[i / 5] = i;
            }
        }
        for (int i=0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        in.close();
    }
}

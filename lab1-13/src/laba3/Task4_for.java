package laba3;

import java.util.Scanner;

public class Task4_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            System.out.print(i + " ");
        }
        in.close();
    }
}

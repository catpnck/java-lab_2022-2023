package laba3;

import java.util.Scanner;

public class Task4_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = in.nextInt();
        System.out.println("Введите второе число");
        int b = in.nextInt();
        int c = Math.min(a, b);
        int d = Math.max(a, b);
        while (c <= d) {
            System.out.print(c + " ");
            c++;
        }
        in.close();
    }
}

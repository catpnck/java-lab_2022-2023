package laba2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        if (a >= 5 && a <= 10) {
            System.out.println("Число попадает в диапазон [5;10]");
        } else {
            System.out.println("Число не попадает в диапазон [5;10]");
        }
        in.close();
    }
}


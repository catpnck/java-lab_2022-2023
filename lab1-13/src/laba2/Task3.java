package laba2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int a = in.nextInt();
        if (a % 4 == 0 && a >= 10) {
            System.out.println("Число соответствует условиям");
        } else {
            System.out.println("Число не соответствует условиям");
        }
        in.close();
    }
}

package laba2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = in.nextInt();
        if (a % 3 == 0) {
            System.out.println("Введенное число делится нацело на 3");
        } else {
            System.out.println("Введеное число не делится нацело на 3");
        }
        in.close();
    }
}

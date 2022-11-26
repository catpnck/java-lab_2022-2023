package laba2;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в формате 1234,4:");
        float f = in.nextFloat();
        int a = (int) f;
        int b = a / 1000;
        System.out.println("Число содержит " + b%10 + " тысяч(у)");

        in.close();
    }
}

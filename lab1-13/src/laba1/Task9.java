package laba1;

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        float a = in.nextFloat();

        float b = a - 1;

        float c = a + 1;

        float d = a + b + c;

        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d * d);

        in.close();
    }
}

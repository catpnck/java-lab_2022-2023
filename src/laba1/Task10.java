package laba1;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        float a = in.nextFloat();

        System.out.println("Введите второе число: ");
        float b = in.nextFloat();

        float c = a + b;

        float d = a - b;

        System.out.println("Сумма введенных вами чисел " + c);
        System.out.println("Разность введенных вами чисел " + d);

        in.close();
    }
}

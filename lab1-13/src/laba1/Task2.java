package laba1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите возраст: ");
        String age = in.nextLine();

        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);

        in.close();
    }
}

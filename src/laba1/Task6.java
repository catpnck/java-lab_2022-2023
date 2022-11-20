package laba1;

import java.time.Year;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя: ");
        String name = in.nextLine();

        System.out.println("Введите ваш год рождения: ");
        int birthYear = in.nextInt();

        int currentYear = Year.now().getValue();

        int age = currentYear - birthYear;

        System.out.println( name + ", ваш возраст " + age);

        in.close();
    }
}

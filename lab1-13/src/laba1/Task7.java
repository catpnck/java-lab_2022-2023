package laba1;

import java.time.Year;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Сколько вам лет? ");
        int age = in.nextInt();

        int currentYear = Year.now().getValue();

        int birthYear = currentYear - age;

        System.out.println("Ваш год рождения: " + birthYear);

        in.close();
    }
}

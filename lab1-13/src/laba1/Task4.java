package laba1;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите название месяца: ");
        String month = in.nextLine();

        System.out.println("Сколько дней в этом месяце? ");
        String days = in.nextLine();

        System.out.println("Месяц " + month + " состоит из " + days + " дней(ня)" );

        in.close();
    }
}

package laba1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Какой сегодня день недели? ");
        String dayOfWeek = in.nextLine();

        System.out.println("Какое сегодня число? ");
        String date = in.nextLine();

        System.out.println("Какой сейчас месяц? ");
        String month = in.nextLine();

        System.out.println("Сегодня: " + dayOfWeek + ", " + date + "е, " + "месяц " + month + " :)");

        in.close();
    }
}

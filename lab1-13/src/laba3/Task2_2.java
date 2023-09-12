package laba3;

import java.util.Scanner;

public class Task2_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите название дня недели");
        String dayOfWeek = in.next().toLowerCase();
        if ("понедельник".equals(dayOfWeek)) {
            System.out.println(1);
        } else if ("вторник".equals(dayOfWeek)) {
            System.out.println(2);
        } else if ("среда".equals(dayOfWeek)) {
            System.out.println(3);
        } else if ("четверг".equals(dayOfWeek)) {
            System.out.println(4);
        } else if ("пятница".equals(dayOfWeek)) {
            System.out.println(5);
        } else if ("суббота".equals(dayOfWeek)) {
            System.out.println(6);
        } else if ("воскресенье".equals(dayOfWeek)) {
            System.out.println(7);
        } else {
            System.out.println("Такого дня нет");

        }
        in.close();
    }
}

package laba1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите фамилию: ");
        String lastName = in.nextLine();

        System.out.println("Введите имя: ");
        String name = in.nextLine();

        System.out.println("Введите отчество: ");
        String surname = in.nextLine();

        System.out.println("Привет, " + lastName + " " + name + " " + surname + "!");

        in.close();
    }
}

package laba3;

import java.util.Scanner;

public class Task3_do_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длинну последовательности");
        int a = in.nextInt();
        int b = 0;
        int c = 1;
        int i = 0;
        do {
            System.out.println(c + " ");
            int d = b + c;
            b = c;
            c = d;
            i++;
        } while (i < a - 1);
        in.close();
    }
}

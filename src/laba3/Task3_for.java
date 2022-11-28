package laba3;

import java.util.Scanner;

public class Task3_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину последовательности");
        int a = in.nextInt();
        int b = 0;
        int c = 1;
        System.out.print(c + " ");
        for (int i = 0; i < a - 1; i++) {
            int d = b + c;
            System.out.print(d + " ");
            b = c;
            c = d;
        }
        in.close();
    }
}

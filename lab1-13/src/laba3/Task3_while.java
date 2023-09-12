package laba3;

import java.util.Scanner;

public class Task3_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите длину последовательности:");
        int a = in.nextInt();
        int b = 0;
        int c = 1;
        int i = 0;
           System.out.print(c + " ");
        while (i < a-1) {
            int d = b + c;
            System.out.print(d + " ");
            b = c;
            c = d;
            i++;
        }
        in.close();
    }
}

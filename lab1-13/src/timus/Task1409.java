package timus;

import java.util.Scanner;

public class Task1409 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = (a + b) - 1;
        int d = c - a;
        int f = c - b;
        System.out.println(d + " " + f);
        in.close();
    }
}

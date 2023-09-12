package timus;

import java.util.Scanner;

public class Task2066 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        int b = a[0] - a[2] * a[1];
        int c = a[0] - a[1] - a[2];
        System.out.println(Math.min(b, c));
        in.close();
    }
}

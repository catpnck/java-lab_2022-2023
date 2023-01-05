package timus;

import java.util.Scanner;

public class Task1910 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = in.nextInt();
            }

            int max = 0;
            int maxN = 0;
            for (int i = 1; i < n - 1; i++) {
                int s = a[i - 1] + a[i] + a[i + 1];
                if (s > max) {
                    max = s;
                    maxN = i;
                }
            }

            System.out.println(max + " " + (maxN + 1));
        }
    }
}

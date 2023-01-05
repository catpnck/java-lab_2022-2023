package timus;

import java.util.Scanner;

public class Task1068 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int s = 0;
            if (n < 1) {
                for (int i = 1; i >= n; i--) {
                    s += i;
                }
            } else {
                for (int i = 1; i <= n; i++) {
                    s += i;
                }
            }
            System.out.println(s);
        }
    }
}

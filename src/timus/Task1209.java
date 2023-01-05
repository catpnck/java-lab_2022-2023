package timus;

import java.util.Scanner;

public class Task1209 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            String[] r = new String[n];
            for (int i = 0; i < n; i++) {
                r[i] = "0";
                double a = (double) in.nextInt();
                double s = 8 * a - 7;
                double sqrt = Math.sqrt(s);
                if (sqrt % 1 == 0) {
                    r[i] = "1";
                }
            }

            System.out.println(String.join(" ", r));
        }
    }
}

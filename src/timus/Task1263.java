package timus;

import java.util.Scanner;

public class Task1263 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            double[] res = new double[n];
            for (int i = 0; i < m; i++) {
                int num = scanner.nextInt() - 1;
                res[num] = (res[num] * m + 1) / m;
            }

            for (int i = 0; i < res.length; i++) {
                System.out.printf("%.2f%%%n", res[i] * 100);
            }
        }
    }
}

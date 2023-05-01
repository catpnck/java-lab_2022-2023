package timus;

import java.util.Scanner;

public class Task2056 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int sum = 0;
            boolean hasThree = false;
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                sum += num;
                hasThree |= num == 3;
            }
            double avg = (double) sum / n;
            if (hasThree) {
                System.out.println("None");
            } else if (Math.abs(avg - 5) < 1e-8) {
                System.out.println("Named");
            } else if (avg >= 4.5) {
                System.out.println("High");
            } else {
                System.out.println("Common");
            }
        }
    }
}

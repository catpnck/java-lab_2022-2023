package timus;

import java.util.Scanner;

public class Task1493 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int n1 = n - 1;
            int n2 = n + 1;
            if (isHappy(n1) || isHappy(n2)) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }

    private static boolean isHappy(int num) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < 3; i++) {
            sum1 += num % 10;
            num /= 10;
        }
        for (int i = 0; i < 3; i++) {
            sum2 += num % 10;
            num /= 10;
        }

        return sum1 == sum2;
    }
}

package timus;

import java.util.Scanner;

public class Task1349 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            if (n == 1) {
                System.out.println("1 2 3");
            } else if (n == 2) {
                System.out.println("3 4 5");
            } else {
                System.out.println("-1");
            }
        }
    }
}

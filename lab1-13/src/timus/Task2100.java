package timus;

import java.util.Scanner;

public class Task2100 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            int a = 2;
            for (int i = 0; i < n; i++) {
                String b = in.next();
                a++;
                if (b.endsWith("+one")) {
                    a++;
                }
            }
            if (a == 13) {
                a++;
            }
            System.out.println(a * 100);
        }
    }
}

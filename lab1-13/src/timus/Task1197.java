package timus;

import java.util.Scanner;

public class Task1197 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                String c = in.next();
                int a = c.charAt(0) - 'a';
                int b = c.charAt(1) - '0' - 1;
                int r = checkCell(a + 2, b + 1)
                        + checkCell(a + 2, b - 1)
                        + checkCell(a - 2, b + 1)
                        + checkCell(a - 2, b - 1)
                        + checkCell(a + 1, b + 2)
                        + checkCell(a + 1, b - 2)
                        + checkCell(a - 1, b + 2)
                        + checkCell(a - 1, b - 2);
                System.out.println(r);
            }
        }
    }

    public static int checkCell(int a, int b) {
        if (a >= 0 && a <= 7 && b >= 0 && b <= 7) {
            return 1;
        }
        return 0;
    }
}

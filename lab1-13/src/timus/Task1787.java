package timus;

import java.util.Scanner;

public class Task1787 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();
        int p = 0;
        for (int i = 0; i < n; i++) {
            int d = in.nextInt();
            p += d - k;
            if (p < 0) {
                p = 0;
            }
        }
        System.out.println(p);
        in.close();
    }
}

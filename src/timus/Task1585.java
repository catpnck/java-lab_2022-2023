package timus;

import java.util.Scanner;

public class Task1585 {
    public static void main(String[] args) {
        String a1 = "Emperor Penguin";
        String a2 = "Little Penguin";
        String a3 = "Macaroni Penguin";
        int n1 = 0, n2 = 0, n3 = 0;
        try (Scanner in = new Scanner(System.in)) {
            int n = Integer.parseInt(in.nextLine());
            for (int i = 0; i < n; i++) {
                String s = in.nextLine();
                if (s.startsWith("E")) {
                    n1++;
                } else if (s.startsWith("L")) {
                    n2++;
                } else if (s.startsWith("M")) {
                    n3++;
                }
            }
        }
        int max = Math.max(n1, Math.max(n2, n3));
        if (n1 == max) {
            System.out.println(a1);
        } else if (n2 == max) {
            System.out.println(a2);
        } else {
            System.out.println(a3);
        }
    }
}

package timus;

import java.util.Scanner;

public class Task1639 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            if ((a * b) % 2 == 0) {
                System.out.println("[:=[first]");
            } else {
                System.out.println("[second]=:]");
            }
        }
    }
}

package timus;

import java.util.HashSet;
import java.util.Scanner;

public class Task1563 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String ns = scanner.nextLine();
            int n = Integer.parseInt(ns);
            HashSet<String> set = new HashSet<>();
            int count = 0;
            for (int i = 0; i < n; i++) {
                String s = scanner.nextLine();
                if (set.contains(s)) {
                    count++;
                }
                set.add(s);
            }

            System.out.println(count);
        }
    }
}

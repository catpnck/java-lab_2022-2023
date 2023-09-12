package timus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1880 {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            Set<Integer> a1 = readArray(in);
            Set<Integer> a2 = readArray(in);
            Set<Integer> a3 = readArray(in);
            a1.retainAll(a2);
            a1.retainAll(a3);
            System.out.println(a1.size());
        }
    }

    public static Set<Integer> readArray(Scanner in) {
        int n = in.nextInt();
        HashSet<Integer> a = new HashSet<>();
        for (int i = 0; i < n; i++) {
            a.add(in.nextInt());
        }

        return a;
    }
}

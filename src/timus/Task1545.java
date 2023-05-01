package timus;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Task1545 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            HashMap<Character, ArrayList<String>> map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                String s = scanner.next();
                char c = s.charAt(0);
                if (!map.containsKey(c)) {
                    map.put(c, new ArrayList<>());
                }
                map.get(c).add(s);
            }

            char c = scanner.next().charAt(0);
            if (!map.containsKey(c)) {
                return;
            }
            for (String s : map.get(c)) {
                System.out.println(s);
            }
        }
    }
}

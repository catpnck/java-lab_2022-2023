package timus;

import java.util.HashMap;
import java.util.Scanner;

public class Task1567 {
    public static void main(String[] args) {
        HashMap<Character, Integer> d = new HashMap<>();
        int a = 1;
        for (char i = 'a'; i <= 'z'; i++) {
            d.put(i, a);
            a++;
            if (a == 4) {
                a = 1;
            }
        }
        d.put('.', 1);
        d.put(',', 2);
        d.put('!', 3);
        d.put(' ', 1);
        try (Scanner in = new Scanner(System.in)) {
            String s = in.nextLine();
            int sum = 0;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                sum += d.get(c);
            }
            System.out.println(sum);
        }
    }
}

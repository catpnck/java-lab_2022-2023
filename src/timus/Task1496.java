package timus;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task1496 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            Set<String> all = new HashSet<>();
            Set<String> spammers = new HashSet<>();
            for (int i = 0; i < n; i++) {
                String name = scanner.next();
                if (all.contains(name)) {
                    spammers.add(name);
                }
                all.add(name);
            }

            for (String spammer : spammers) {
                System.out.println(spammer);
            }
        }
    }
}

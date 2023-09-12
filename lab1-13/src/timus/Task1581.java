package timus;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1581 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int last = -1;
            int count = 0;
            List<String> res = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int num = scanner.nextInt();
                if (last == -1) {
                    last = num;
                }
                if (num == last) {
                    count++;
                } else {
                    res.add(String.valueOf(count));
                    res.add(String.valueOf(last));
                    last = num;
                    count = 1;
                }
            }

            res.add(String.valueOf(count));
            res.add(String.valueOf(last));

            System.out.println(String.join(" ", res));
        }
    }
}

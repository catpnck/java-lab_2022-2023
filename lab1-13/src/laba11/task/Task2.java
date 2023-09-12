package laba11.task;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            var num = scanner.nextInt();
            var result = new ArrayList<Integer>();
            convert(num, result);
            for (var i = result.size() - 1; i >= 0; i--) {
                System.out.print(result.get(i));
            }
            System.out.println();
        }
    }

    public static void convert(int num, List<Integer> result) {
        if (num == 0) {
             return;
        }
        var dig = num % 2;
        result.add(dig);
        convert(num / 2, result);
    }
}

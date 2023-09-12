package laba12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        try (var Scanner = new Scanner(System.in)) {
            System.out.println("Введите делитель: ");
            var den = Scanner.nextInt();
            Random rnd = new Random();
            var list = new ArrayList<Integer>();
            for (var i = 0; i < 20; i++) {
                list.add(rnd.nextInt(20));
            }
            var listCorrect = createNumsDividesBy(list, den);
            System.out.println("Исходный список: " +
                    String.join(" ", list.stream().map(a -> a.toString()).toList()));
            System.out.println("Верный список, в котором числа кратны определенному числу: " +
                    String.join(" ", listCorrect.stream().map(b -> b.toString()).toList()));

        }
    }

    public static List<Integer> createNumsDividesBy(List<Integer> num, int denominator) {
        return num.stream()
                .filter(a -> a % denominator == 0)
                .toList();
    }
}


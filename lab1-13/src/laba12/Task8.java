package laba12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        int num;
        var rnd = new Random();
        try (var Scanner = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            num = Scanner.nextInt();
        }
        var list = new ArrayList<Integer>();
        for (var i = 0; i < 30; i++) {
            list.add(rnd.nextInt(10));
        }
        var listNew = createNumsGreaterThan(list, num);
        System.out.println("Исходный список: " +
                String.join(" ", list.stream().map(a -> a.toString()).toList()));
        System.out.println("Конечный список: " +
                String.join(" ", listNew.stream().map(aa -> aa.toString()).toList()));
    }

    public static List<Integer> createNumsGreaterThan(List<Integer> nums, int num) {
        return nums.stream()
                .filter(a -> a > num)
                .toList();
    }
}

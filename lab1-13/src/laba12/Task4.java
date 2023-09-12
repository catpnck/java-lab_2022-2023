package laba12;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random rnd = new Random();
        var list = new ArrayList<Integer>();
        for (var i = 0; i < 10; i++) {
            list.add(rnd.nextInt(15));
        }
        System.out.println("Исходный список: " +
                String.join(" ", list.stream().map(a -> a.toString()).toList()));
        var listSquare = createSquareNumbers(list);
        System.out.println("Список квадратов чисел: " +
                String.join(" ", listSquare.stream().map(b -> b.toString()).toList()));
    }

    public static List<Integer> createSquareNumbers(List<Integer> num) {
        return num.stream()
                .map(a -> a * a)
                .toList();
    }
}

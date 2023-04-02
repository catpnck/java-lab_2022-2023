package laba12;

import java.util.List;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        int length;
        try (var Scanner = new Scanner(System.in)) {
            System.out.println("Введите длину строки: ");
            length = Scanner.nextInt();
        }
        var list = List.of("Какой", "же", "сегодня", "хороший", "день", "в", "Уфе");
        var listCorrect = createStringOfLength(list, length);
        System.out.println("Исходный список: " + String.join(" ", list));
        System.out.println("Список строк больше заданной длины:: " + String.join(" ", listCorrect));
    }

    public static List<String> createStringOfLength(List<String> text, int length) {
        return text.stream()
                .filter(a -> a.length() > length)
                .toList();
    }
}

package laba12;

import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        var list = List.of("Мама", "мыла", "Милу", "с", "мылом", ".");
        var listNew = createWordsOfCapitalLetters(list);
        System.out.println(String.join(" ", list));
        System.out.println(String.join(" ", listNew));
    }

    public static List<String> createWordsOfCapitalLetters(List<String> text) {
        return text.stream()
                .filter(a -> Character.isUpperCase(a.charAt(0)))
                .toList();
    }
}

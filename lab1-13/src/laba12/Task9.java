package laba12;

import java.util.List;

public class Task9 {
    public static void main(String[] args) {
        var list = List.of("fjyhgjh/8", "aaaaaa", "7ghvcj", "asdfghjk8", "657", "доршгуклма");
        var listNew = creatorStringWithoutNumsAndSymbols(list);
        System.out.println("Исходный список: " + String.join(" ", list));
        System.out.println("Конечный список: " + String.join(" ", listNew));
    }

    public static List<String> creatorStringWithoutNumsAndSymbols(List<String> text) {
        return text.stream()
                .filter(a -> a.chars().allMatch(b -> Character.isLetter(b)))
                .toList();
    }
}

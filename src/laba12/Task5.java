package laba12;

import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        var list = List.of("шла", "девочка", "по", "лесу", "с", "шампанским");
        var listElectoral = createStringsContain(list, "а");
        System.out.println(String.join(" ", list));
        System.out.println(String.join(" ", listElectoral));
    }

    public static List<String> createStringsContain(List<String> text, String substring) {
        return text.stream()
                .filter(a -> a.contains(substring))
                .toList();
    }
}

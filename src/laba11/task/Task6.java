package laba11.task;

import java.util.ArrayList;
import java.util.HashMap;

public class Task6 {
    public static void main(String[] args) {
        var map = new HashMap<Integer, String>();
        map.put(0, "zero");
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");

        var list = new ArrayList<String>();
        var hasZeroKey = false;
        var multiply = 1;
        for (var entry : map.entrySet()) {
            if (entry.getKey() > 5) {
                list.add(entry.getValue());
            }

            if (entry.getKey() == 0) {
                hasZeroKey = true;
            }

            if (entry.getValue().length() >= 5) {
                multiply *= entry.getKey();
            }
        }

        if (hasZeroKey) {
            System.out.println(String.join(", ", list));
        }
        System.out.println(multiply);
    }
}

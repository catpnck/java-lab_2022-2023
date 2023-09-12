package laba12;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        var rnd = new Random();
        var array1 = new int[15];
        for (var i = 0; i < array1.length; i++) {
            array1[i] = rnd.nextInt(10);
        }
        var array2 = new int[15];
        for (var i = 0; i < array2.length; i++) {
            array2[i] = rnd.nextInt(10);
        }
        System.out.println("Исходные массивы: " + Arrays.toString(array1) + " и " + Arrays.toString(array2));
        var arrayCommon = createCommonNums(array1, array2);
        System.out.println("Массив совпадающих чисел: " + Arrays.toString(arrayCommon));
    }

    public static int[] createCommonNums(int[] arrayFirst, int[] arraySecond) {
        var set = new HashSet<>();
        for (var num : arraySecond) {
            set.add(num);
        }
        return Arrays.stream(arrayFirst)
                .filter(a -> set.contains(a))
                .toArray();
    }
}

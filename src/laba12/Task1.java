package laba12;

import java.util.Arrays;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        var rnd = new Random();
        var array = new int[15];
        for (var i = 0; i < array.length; i++) {
            array[i] = rnd.nextInt(20);
        }
        System.out.println("исходный массив: " + Arrays.toString(array));
        var arrayEven = createEvenNumberArray(array);
        System.out.println("массив четных чисел: " + Arrays.toString(arrayEven));
    }

    private static int[] createEvenNumberArray(int[] numberArray) {
        return Arrays.stream(numberArray)
                .filter(a -> a % 2 == 0)
                .toArray();
    }
}
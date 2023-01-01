package laba6.task10;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {
        int[] maxMin = MaxMin.getMaxMin(new int[]{1, 3, 5, 7, -98, 56, 123, -3});
        System.out.println(Arrays.toString(maxMin));
    }
}

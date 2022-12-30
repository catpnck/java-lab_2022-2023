package laba6.task9;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 5, 7, 8, 10};
        System.out.println(Arrays.toString(nums));
        ArrayReverser.reversedArray(nums);
        System.out.println(Arrays.toString(nums));
    }
}

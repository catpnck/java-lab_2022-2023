package laba6.task8;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6, 78, 4, 79};
        int average = Average.getAverage(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(average);
    }
}

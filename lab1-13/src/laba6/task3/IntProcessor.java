package laba6.task3;

public class IntProcessor {
    public static int max(int... nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(max, nums[i]);
        }

        return max;
    }

    public static int min(int... nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }

        return min;
    }

    public static double average(int... nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return (double) sum / nums.length;
    }

}


package laba13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task5 {

    private static int max(int[] nums, int left, int right) {
        var max = Integer.MIN_VALUE;
        for (var i = left; i < right; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }

    public static void main(String[] args) throws InterruptedException {
        var rnd = new Random();
        int core = Runtime.getRuntime().availableProcessors();
        int[] nums = new int[100 * core];
        for (var i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(10000);
        }
        System.out.println(Arrays.toString(nums));
        var maxArray = new int[core];
        var threads = new ArrayList<Thread>();

        for (var i = 0; i < core; i++) {
            var e = i;
            var t = new Thread(() -> {
                var left = e * nums.length / core;
                var right = (e + 1) * nums.length / core;
                var a = max(nums, left, right);
                maxArray[e] = a;
            });
            threads.add(t);
            t.start();
        }
        for (var i = 0; i < threads.size(); i++) {
            threads.get(i).join();
        }
        var max = max(maxArray, 0, maxArray.length);
        System.out.println("Максимум: " + max);
    }
}

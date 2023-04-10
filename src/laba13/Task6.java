package laba13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task6 {
    private static int sum(int[] nums, int left, int right) {
        var sum = 0;
        for (var i = left; i < right; i++) {
            sum = sum + nums[i];
        }
        return sum;
    }

    public static void main(String[] args) throws InterruptedException {
        var rnd = new Random();
        int core = Runtime.getRuntime().availableProcessors();
        int[] nums = new int[100 * core];
        for (var i = 0; i < nums.length; i++) {
            nums[i] = rnd.nextInt(20);
        }
        System.out.println(Arrays.toString(nums));
        var sumArray = new int[core];
        var threads = new ArrayList<Thread>();

        for (var i = 0; i < core; i++) {
            var e = i;
            var t = new Thread(() -> {
                var left = e * nums.length / core;
                var right = (e + 1) * nums.length / core;
                var a = sum(nums, left, right);
                sumArray[e] = a;
            });
            threads.add(t);
            t.start();
        }
        for (var i = 0; i < threads.size(); i++) {
            threads.get(i).join();
        }
        var sum = sum(sumArray, 0, sumArray.length);
        System.out.println("Сумма: " + sum);
    }
}

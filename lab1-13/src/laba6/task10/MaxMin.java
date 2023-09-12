package laba6.task10;

public class MaxMin {

    public static int[] getMaxMin(int[] nums) {
        int[] maxMin = new int[]{Integer.MIN_VALUE, Integer.MAX_VALUE};
        for (int i = 0; i < nums.length; i++) {
            maxMin[0] = Math.max(maxMin[0], nums[i]);
            maxMin[1] = Math.min(maxMin[1], nums[i]);
        }

        return maxMin;
    }

}

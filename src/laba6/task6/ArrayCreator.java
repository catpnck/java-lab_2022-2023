package laba6.task6;

public class ArrayCreator {

    public static int[] createSubarray(int num, int[] nums) {
        int length = Math.min(nums.length, num);
        int[] numsNew = new int[length];
        for (int i = 0; i < length; i++) {
            numsNew[i] = nums[i];
        }

        return numsNew;
    }
}

package laba6.task9;

public class ArrayReverser {

    public static void reversedArray (int [] nums) {
        for (int i=0, j = nums.length-1; i<j; i++, j--){
            int a = nums[i];
            nums[i]=nums[j];
            nums [j]=a;
        }
    }
}

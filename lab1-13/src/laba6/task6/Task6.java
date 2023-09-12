package laba6.task6;

import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {
        int [] array = new int[]{1,2,3,4,5,6,7,8,9};
        int [] subArray = ArrayCreator.createSubarray(5,array);
        int [] subArray1 = ArrayCreator.createSubarray(10, array);
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(subArray));
        System.out.println(Arrays.toString(subArray1));

    }
}

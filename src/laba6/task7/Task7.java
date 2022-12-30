package laba6.task7;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        char[] chrs = new char[]{'a', 'h'};
        int[] codes = CharCodeProcessor.getCharCodes(chrs);
        System.out.println(Arrays.toString(chrs));
        System.out.println(Arrays.toString(codes));
    }
}

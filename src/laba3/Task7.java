package laba3;

import java.util.Arrays;

public class Task7 {
    public static void main(String[] args) {
        char[] letters = new char[10];
        char first = 'a';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = (char) (first + i * 2);
        }
        System.out.println(Arrays.toString(letters));
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i] + " ");
        }
    }
}

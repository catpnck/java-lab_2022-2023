package laba3;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        char[] vowelLetters = new char[]{'A', 'E', 'I', 'O', 'U', 'Y'};
        char[] consonants = new char[10];
        int i = 0;
        for (char letter = 'A'; letter <= 'Z' && i < consonants.length; letter++) {
            boolean isConsonant = true;
            for (int j = 0; j < vowelLetters.length; j++) {
                if (letter == vowelLetters[j]) {
                    isConsonant = false;
                }
            }
            if (isConsonant) {
                consonants[i] = letter;
                i++;
            }
        }
        System.out.println(Arrays.toString(consonants));

    }
}

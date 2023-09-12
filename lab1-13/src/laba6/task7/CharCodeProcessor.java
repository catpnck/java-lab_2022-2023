package laba6.task7;

public class CharCodeProcessor {

    public static int[] getCharCodes(char[] chars) {
        int[] codes = new int[chars.length];
        for (int i = 0; i < chars.length; i++) {
            codes[i] = (int) chars[i];
        }

        return codes;
    }
}

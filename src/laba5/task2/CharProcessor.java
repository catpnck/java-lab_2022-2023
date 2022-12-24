package laba5.task2;

public class CharProcessor {
    private char firstChar = 'q';

    private char secondChar = 'z';

    public void printChars() {
        for (char i = firstChar; i <= secondChar; i++) {
            System.out.print(i + " ");
        }
    }
}

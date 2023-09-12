package laba5.task1;

public class CharProcessor {
    private char chr;

    public void setChar(char chr) {
        this.chr = chr;
    }

    public int getCharCode() {
        return (int) chr;
    }

    public void printCharAndCode() {
        int code = getCharCode();
        System.out.println(chr + " " + code);
    }
}

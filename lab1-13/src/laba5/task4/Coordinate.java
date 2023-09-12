package laba5.task4;

public class Coordinate {
    private char chr;
    private int num;

    public Coordinate(char chr, int num) {
        this.chr = chr;
        this.num = num;
    }

    public Coordinate(double coordinate) {
        int code = (int) coordinate;
        this.chr = (char) code;
        this.num = (int) ((coordinate - code) * 100);
    }

    public void print() {
        System.out.println(num + " " + chr);
    }
}

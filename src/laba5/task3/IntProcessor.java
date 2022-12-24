package laba5.task3;

public class IntProcessor {
    private int firstInt;
    private int secondInt;

    public IntProcessor() {

    }

    public IntProcessor(int num) {
        this.firstInt = num;

    }

    public IntProcessor(int num1, int num2) {
        this.firstInt = num1;
        this.secondInt = num2;
    }

    public void print() {
        System.out.println(firstInt + " " + secondInt);
    }
}

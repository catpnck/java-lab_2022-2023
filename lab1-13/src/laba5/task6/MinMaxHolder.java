package laba5.task6;

public class MinMaxHolder {
    private int min;
    private int max;

    public MinMaxHolder(int num) {
        setNums(num);
    }

    public MinMaxHolder(int num1, int num2) {
        setNums(num1, num2);
    }

    public void setNums(int num) {
        this.min = Math.min(this.min, num);
        this.max = Math.max(this.max, num);
    }

    public void setNums(int num1, int num2) {
        setNums(num1);
        setNums(num2);
    }

    public void print() {
        System.out.println("Min: " + min + " Max: " + max);
    }
}

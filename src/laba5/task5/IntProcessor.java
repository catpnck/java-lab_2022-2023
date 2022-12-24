package laba5.task5;

public class IntProcessor {
    private int num;

    public IntProcessor() {
        setNum();
    }

    public IntProcessor(int num) {
        setNum(num);
    }

    public void setNum(int num) {
        this.num = Math.min(num, 100);
    }

    public void setNum() {
        this.num = 0;
    }

    public void print() {
        System.out.println(num);
    }

}

package laba5.task5;

public class Task5 {
    public static void main(String[] args) {
        IntProcessor proc = new IntProcessor();
        proc.print();
        proc.setNum(65);
        proc.print();
        proc.setNum(101);
        proc.print();

        IntProcessor proc1 = new IntProcessor(74);
        proc1.print();
        proc1.setNum();
        proc1.print();
    }
}

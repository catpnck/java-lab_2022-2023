package laba5.task3;

public class Task3 {
    public static void main(String[] args) {
        IntProcessor proc = new IntProcessor();
        proc.print();

        IntProcessor proc1 = new IntProcessor(2);
        proc1.print();

        IntProcessor proc2 = new IntProcessor(4,7);
        proc2.print();
    }
}

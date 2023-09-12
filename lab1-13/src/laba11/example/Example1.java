package laba11.example;

public class Example1 {
    public static void main(String[] args) {
        recurse(1);
    }

    public static void recurse(int num) {
        System.out.println("x = " + num);
        var s = 2 * num + 1;
        if (s < 20) {
            recurse(s);
        }
    }
}

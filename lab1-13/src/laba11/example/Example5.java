package laba11.example;

public class Example5 {
    private static int step = 0;

    public static void main(String[] args) {
        System.out.println(fib(5));
    }

    public static int fib(int n) {
        try {
            space();
            System.out.println("" + n + " ->");
            step++;
            if (n == 0) {
                return 0;
            }
            if (n == 1) {
                return 1;
            }
            return fib(n - 2) + fib(n - 1);
        } finally {
            space();
            System.out.println("" + n + " <-");
            step--;
        }
    }

    public static void space() {
        for (var i = 0; i < step; i++) {
            System.out.print(" ");
        }
    }
}

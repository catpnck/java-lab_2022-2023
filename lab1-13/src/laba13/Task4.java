package laba13;

public class Task4 {
    public static void main(String[] args) {
        for (var i = 1; i <= 10; i++) {
            var e = i;
            Thread num = new Thread(() -> {
                System.out.println("Поток:" + e);
            });
            num.start();
        }
    }
}

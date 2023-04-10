package laba13;

public class Task3 {
    private static final Object lock = new Object();
    private static int num = 1;

    public static void main(String[] args) {
        Thread even = new Thread(() -> {
            synchronized (lock) {

                while (num <= 10) {
                    if (num % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + ": " + num);
                        num++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        Thread odd = new Thread(() -> {
            synchronized (lock) {
                while (num <= 10) {
                    if (num % 2 == 1) {
                        System.out.println(Thread.currentThread().getName() + ": " + num);
                        num++;
                    } else {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    lock.notifyAll();
                }
            }
        });

        even.setName("Четные числа");
        odd.setName("Нечетные числа");

        even.start();
        odd.start();
    }
}

package laba3;

import java.util.Scanner;

public class Task5_for {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество чисел в сумме");
        int a = in.nextInt();
        int sum = 0;
        int count = 0;
        for (int i = 0; count <= a; i++) {
            if (i % 5 == 2 || i % 3 == 1) {
                System.out.print(i + " ");
                count++;
                sum = i + sum;
            }
        }
        System.out.println("Сумма: " + sum);
        in.close();
    }
}

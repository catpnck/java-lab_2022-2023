package laba3;

import java.util.Scanner;

public class Task5_while {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите количество числел в сумме");
        int a = in.nextInt();
        int sum = 0;
        int count = 0;
        int current = 0;
        while (count <= a) {
            if (current % 5 == 2 || current % 3 == 1) {
                System.out.print(current + " ");
                count++;
                sum = current + sum;
            }
            current++;
        }
        System.out.println("Сумма: " + sum);
        in.close();
    }
}

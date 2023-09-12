package laba5.task6;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        int num1, num2;
        try (Scanner in = new Scanner(System.in)) {
            System.out.println("Введите первое число: ");
            num1 = in.nextInt();
            System.out.println("Введите второе число: ");
            num2 = in.nextInt();
        }
        MinMaxHolder holder = new MinMaxHolder(num1, num2);
        holder.print();

        holder.setNums(1564);
        holder.print();
    }
}

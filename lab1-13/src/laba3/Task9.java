package laba3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int length = in.nextInt();
        int[] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000);
        }
        System.out.println(Arrays.toString(numbers));
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            min = Math.min(min, numbers[i]);
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == min) {
                System.out.println("На месте " + i + " минамальное значение массива " + min);
            }
        }
        in.close();
    }
}

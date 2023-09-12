package laba3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int length = in.nextInt();
        int [] numbers = new int[length];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++){
            numbers[i]=random.nextInt(780);
        }
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        int [] sortNumbers = new int[numbers.length];
        for (int i = numbers.length-1; i>=0; i--){
            sortNumbers [numbers.length-i-1] = numbers[i];
        }
        System.out.println(Arrays.toString(sortNumbers));
        in.close();
    }
}

package laba4;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        var random = new Random();
        int size = random.nextInt(2, 9);
        int arr[][] = new int[size][];
        int size1 = random.nextInt(2, 6);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[size1];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(3, 7);
            }
        }
        System.out.println("Исходный массив:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
        }
        int reversed[][] = new int[size1][];
        for (int i = 0; i < reversed.length; i++) {
            reversed[i] = new int[size];
            for (int j = 0; j < reversed[i].length; j++) {
                reversed[i][j] = arr[j][i];
            }
        }
        System.out.println();
        System.out.println("Перевернутый массив:");
        for (int i = 0; i< reversed.length; i++){
            System.out.println();
            for (int j = 0; j< reversed[i].length; j++){
                System.out.print(reversed[i][j]);
            }
        }

    }
}

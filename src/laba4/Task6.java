package laba4;

import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        int width = 10;
        int height = 10;

        int[][] arr = new int[height][];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++) {
            arr[i] = new int[width];
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = random.nextInt(9);
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
            }
        }

        System.out.println();

        var skipRow = random.nextInt(0, arr.length);
        var skipColumn = random.nextInt(0, arr[0].length);

        int[][] newArr = new int[height - 1][];
        int iAdd = 0;
        for (int i = 0; i < newArr.length; i++) {
            if (i == skipRow) {
                iAdd = 1;
            }
            int jAdd = 0;
            newArr[i] = new int[width - 1];
            for (int j = 0; j < newArr[i].length; j++) {
                if (j == skipColumn) {
                    jAdd = 1;
                }
                newArr[i][j] = arr[i + iAdd][j + jAdd];
            }
        }

        for (int i = 0; i < newArr.length; i++) {
            System.out.println();
            for (int j = 0; j < newArr[i].length; j++) {
                System.out.print(newArr[i][j]);
            }
        }
    }
}

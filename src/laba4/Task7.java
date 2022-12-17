package laba4;

public class Task7 {
    public static void main(String[] args) {
        int size = 9;

        int[][] arr = new int[size][];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new int[size];
        }

        int filled = 0;
        int a = 0;
        int b = 0;
        while (filled < size * size - 1) {
            while (b + 1 < size && arr[a][b + 1] == 0) {
                arr[a][b] = filled + 1;
                b++;
                filled++;
            }

            while (a + 1 < size && arr[a + 1][b] == 0) {
                arr[a][b] = filled + 1;
                a++;
                filled++;
            }

            while (b - 1 >= 0 && arr[a][b - 1] == 0) {
                arr[a][b] = filled + 1;
                b--;
                filled++;
            }

            while (a - 1 >= 0 && arr[a - 1][b] == 0) {
                arr[a][b] = filled + 1;
                a--;
                filled++;
            }
        }

        if (size % 2 == 0) {
            arr[size / 2][size / 2 - 1] = size * size;
        } else {
            arr[size / 2][size / 2] = size * size;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] / 10 == 0) {
                    System.out.print("0" + arr[i][j] + " ");
                } else {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}

package laba4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ширину прямоугольника:");
        int width = in.nextInt();
        System.out.println("Введите высоту прямоугольника:");
        int height = in.nextInt();
        int[][] fig = new int[height][];
        for (int i = 0; i < fig.length; i++) {
            fig[i] = new int[width];
            for (int j = 0; j < fig[i].length; j++) {
                fig[i][j] = 2;
            }
        }
        for (int i = 0; i < fig.length; i++) {
            System.out.println();
            for (int j = 0; j < fig[i].length; j++) {
                System.out.print(fig[i][j]);
            }
        }
        in.close();
    }
}

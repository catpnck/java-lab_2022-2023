package laba4;

public class Task1 {
    public static void main(String[] args) {
        int width = 23;
        int height = 11;
        System.out.println("Высота прямоугольника: " + height);
        System.out.println("Ширина прямоугольника: " + width);
        for (int i = 0; i <= height; i++) {
            System.out.println();
            for (int j = 0; j < width; j++) {
                System.out.print("o");
            }
        }

    }
}

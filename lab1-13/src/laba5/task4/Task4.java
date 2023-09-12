package laba5.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        double coordinate;
        try (Scanner in = new Scanner(System.in)){
            System.out.println("Введите координату:");
            coordinate = in.nextDouble();
        }
        Coordinate crd = new Coordinate(coordinate);
        crd.print();

    }
}

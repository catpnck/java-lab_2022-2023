package timus;

import java.util.Scanner;

public class Task1893 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String seat = scanner.next();
            String rs = "";
            String letter = "";
            for (int i = 0; i < seat.length(); i++) {
                char c = seat.charAt(i);
                if (Character.isDigit(c)) {
                    rs += c;
                } else if (Character.isLetter(c)) {
                    letter += c;
                }
            }

            int r = Integer.parseInt(rs);

            if (r >= 1 && r <= 2) {
                if (letter.equals("A") || letter.equals("D")) {
                    System.out.println("window");
                } else {
                    System.out.println("aisle");
                }
            } else if (r >= 3 && r <= 20) {
                if (letter.equals("A") || letter.equals("F")) {
                    System.out.println("window");
                } else {
                    System.out.println("aisle");
                }
            } else {
                if (letter.equals("A") || letter.equals("K")) {
                    System.out.println("window");
                } else if (letter.equals("C") || letter.equals("D") || letter.equals("G") || letter.equals("H")) {
                    System.out.println("aisle");
                } else {
                    System.out.println("neither");
                }
            }
        }
    }
}

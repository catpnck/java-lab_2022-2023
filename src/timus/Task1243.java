package timus;

import java.math.BigInteger;
import java.util.Scanner;

public class Task1243 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String v = scanner.next();
            BigInteger n = new BigInteger(v);
            System.out.println(n.mod(new BigInteger("7")));
        }
    }
}

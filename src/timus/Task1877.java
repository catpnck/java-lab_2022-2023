package timus;

import java.util.Scanner;

public class Task1877 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        if (a%2==0 || b%2==1){
            System.out.println("yes");
        } else System.out.println("no");
        in.close();
    }
}

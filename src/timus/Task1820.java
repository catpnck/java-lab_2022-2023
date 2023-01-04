package timus;

import java.util.Scanner;

public class Task1820 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int t = 0;
        if (2 * n % k == 0) {
            t = 2 * n / k;
        } else {
            t = 2 * n / k + 1;
        }
        if (n<k){
            t = 2;
        }
        System.out.println(t);
        in.close();
    }
}

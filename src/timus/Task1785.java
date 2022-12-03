package timus;

import java.util.Scanner;

public class Task1785 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a>=1 && a<=4) {
            System.out.println("few");
        }
        if (a>=5 && a<=9) {
            System.out.println("several");
        }
        if (a>=10 && a<=19) {
            System.out.println("pack");
        }
        if (a>=20 && a<=49) {
            System.out.println("lots");
        }
        if (a>=50 && a<=99) {
            System.out.println("horde");
        }
        if (a>=100 && a<=249) {
            System.out.println("throng");
        }
        if (a>=250 && a<=499) {
            System.out.println("swarm");
        }
        if (a>=500 && a<=999) {
            System.out.println("zounds");
        }
        if (a>=1000) {
            System.out.println("legion");
        }
        in.close();
    }
}

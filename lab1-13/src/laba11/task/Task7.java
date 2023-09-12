package laba11.task;

import java.util.ArrayList;
import java.util.LinkedList;

public class Task7 {
    public static void main(String[] args) {
        var n = 20000;
        var t1 = System.currentTimeMillis();
        solveWithArrayList(n);
        var t2 = System.currentTimeMillis();
        var elapsed = t2 - t1;
        System.out.println(elapsed);

        System.out.println();

        t1 = System.currentTimeMillis();
        solveWithLinkedList(n);
        t2 = System.currentTimeMillis();
        elapsed = t2 - t1;
        System.out.println(elapsed);
    }

    private static void solveWithArrayList(int n) {
        var list = new ArrayList<Integer>();
        for (var i = 1; i <= n; i++) {
            list.add(i);
        }

        while (list.size() > 1) {
            for (var i = 0; i < list.size(); i += 2) {
                list.remove(i);
            }
        }

        System.out.println(list.get(0));
    }

    private static void solveWithLinkedList(int n) {
        var list = new LinkedList<Integer>();
        for (var i = 1; i <= n; i++) {
            list.add(i);
        }
        while (list.size() > 1) {
            for (var i = 0; i < list.size(); i += 2) {
                list.remove(i);
            }
        }

        System.out.println(list.get(0));
    }
}

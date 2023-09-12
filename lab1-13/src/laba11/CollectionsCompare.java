package laba11;

import java.util.*;

public class CollectionsCompare {
    public static void main(String[] args) {

        var queue = new ArrayDeque<Integer>();
        var set = new LinkedHashSet<Integer>();
        var list = new ArrayList<Integer>();

        System.out.println("Время выполнения операции добавления ArrayDeque = " + getAddTime(queue));
        System.out.println("Время выполнения операции добавления LinkedHashSet = " + getAddTime(set));
        System.out.println("Время выполнения операции добавления ArrayList = " + getAddTime(list));

//        System.out.println("Удаление = " + getDeleteTime(queue));
//        System.out.println("Удаление = " + getDeleteTime(set));
        System.out.println("Удаление = " + getDeleteTime(list));
    }

    private static long getDeleteTime(ArrayList<Integer> collection) {
        long start = System.currentTimeMillis();

        while (collection.size() > 0) {
            collection.remove(0);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getAddTime(Collection<Integer> collection) {

        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();

        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 3000000; i++) {
            collection.add(i);
        }

        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();

        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;

    }
}

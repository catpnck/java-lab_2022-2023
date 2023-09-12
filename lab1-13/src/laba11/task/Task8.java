package laba11.task;

import java.util.Scanner;

public class Task8 {
    private Node head;
    private int size;

    public static void main(String[] args) {
        var list = new Task8();
        list.createHead();
        list.addFirst(-100);
        list.addLast(100);
        list.insert(2, 300);
        System.out.println(list.toString());

        var listRec = new Task8();
        listRec.createTailRec();
        listRec.addFirst(-100);
        listRec.addLast(100);
        listRec.insert(2, 300);
        System.out.println(listRec.toStringRec());
    }

    public void createHead() {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Введите количество элементов: ");
            size = scanner.nextInt();

            if (size <= 0) {
                return;
            }
            System.out.println("Вводите элементы по одному:\n");
            head = new Node(scanner.nextInt(), null);
            var current = head;
            for (var i = 1; i < size; i++) {
                var node = new Node(scanner.nextInt(), null);
                current.next = node;
                current = node;
            }
            System.out.println("Все элементы введены");
        }
    }

    public void createTail() {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Введите количество элементов: ");
            size = scanner.nextInt();

            if (size <= 0) {
                return;
            }
            head = null;
            System.out.println("Вводите элементы по одному:\n");
            for (var i = size - 1; i >= 0; i--) {
                head = new Node(scanner.nextInt(), head);
            }
            System.out.println("Все элементы введены");
        }
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        var current = head;
        while (current != null) {
            sb.append(current.value).append(" ");
            current = current.next;
        }

        return sb.toString();
    }

    public void addFirst(int value) {
        head = new Node(value, head);
        size++;
    }

    public void addLast(int value) {
        var node = new Node(value, null);
        var current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        size++;
    }

    public void insert(int index, int value) {
        if (index > size) {
            throw new IllegalArgumentException();
        }

        if (index == 0) {
            addFirst(value);
            return;
        }

        var current = head;
        for (var i = 1; i < index; i++) {
            current = current.next;
        }

        current.next = new Node(value, current.next);
        size++;
    }

    public void RemoveFirst() {
        head = head.next;
        size--;
    }

    public void removeLast() {
        if (head.next == null) {
            head = null;
            return;
        }

        var current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;

        size--;
    }

    public void remove(int index) {
        if (head == null) {
            return;
        }

        if (index == 0) {
            head = head.next;
        }

        var current = head;
        for (var i = 1; i < index - 1; i++) {
            current = current.next;
        }
        current.next = current.next.next;
    }

    public void createHeadRec() {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Введите количество элементов: ");
            size = scanner.nextInt();

            if (size <= 0) {
                return;
            }
            System.out.println("Вводите элементы по одному:\n");
            createHeadRec(scanner, null, size);
            System.out.println("Все элементы введены");
        }
    }

    private void createHeadRec(Scanner scanner, Node last, int n) {
        if (n <= 0) {
            return;
        }
        var i = scanner.nextInt();
        var node = new Node(i, null);
        if (last == null) {
            head = node;
        }
        createHeadRec(scanner, node, n - 1);
    }

    public void createTailRec() {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Введите количество элементов: ");
            size = scanner.nextInt();

            if (size <= 0) {
                return;
            }
            System.out.println("Вводите элементы по одному:\n");
            createTailRec(scanner, size);
            System.out.println("Все элементы введены");
        }
    }

    private void createTailRec(Scanner scanner, int n) {
        if (n <= 0) {
            return;
        }
        var i = scanner.nextInt();
        head = new Node(i, head);
        createTailRec(scanner, n - 1);
    }

    public String toStringRec() {
        var sb = new StringBuilder();
        toStringRec(sb, head);
        return sb.toString();
    }

    private void toStringRec(StringBuilder sb, Node current) {
        if (current == null) {
            return;
        }
        sb.append(current.value).append(" ");
        toStringRec(sb, current.next);
    }
}

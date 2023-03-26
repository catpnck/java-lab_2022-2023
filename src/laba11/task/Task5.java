package laba11.task;

public class Task5 {
    public static void main(String[] args) {
        fromTail();
        System.out.println();
        fromHead();
    }

    private static void fromTail() {
        Node head = null;
        for (var i = 9; i >= 0; i--) {
            head = new Node(i, head);
        }

        var ref = head;
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }

    private static void fromHead() {
        var head = new Node(0, null);
        var current = head;
        for (var i = 1; i <= 9; i++) {
            var node = new Node(i, null);
            current.next = node;
            current = node;
        }

        var ref = head;
        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}

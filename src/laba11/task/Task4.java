package laba11.task;

public class Task4 {
    public static void main(String[] args) {
        var node0 = new Node(0, null);
        var node1 = new Node(1, null);
        var node2 = new Node(2, null);
        var node3 = new Node(3, null);

        node0.next = node1;
        node1.next = node2;
        node2.next = node3;

        var ref = node0;

        while (ref != null) {
            System.out.println(ref.value);
            ref = ref.next;
        }
    }
}

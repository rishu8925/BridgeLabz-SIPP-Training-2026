class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class InsertAfterNode {

    static void insertAfter(Node current, int value) {
        if (current == null) return;

        Node newNode = new Node(value);
        newNode.next = current.next;
        current.next = newNode;
    }

    static void print(Node head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        insertAfter(head, 15);

        print(head);
    }
}
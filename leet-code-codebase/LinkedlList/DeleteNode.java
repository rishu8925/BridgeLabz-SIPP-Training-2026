class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class DeleteNode {

    static Node removeTask(Node head, int key) {

        if (head == null)
            return null;

        if (head.val == key)
            return head.next;

        Node prev = head;
        Node curr = head.next;

        while (curr != null && curr.val != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr != null)
            prev.next = curr.next;

        return head;
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

        head = removeTask(head, 20);

        print(head);
    }
}
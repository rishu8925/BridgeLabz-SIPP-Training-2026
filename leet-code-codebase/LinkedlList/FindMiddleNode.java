class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

public class FindMiddleNode {

    static Node findMiddle(Node head) {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        Node middle = findMiddle(head);

        System.out.println("Middle Node: " + middle.val);
    }
}
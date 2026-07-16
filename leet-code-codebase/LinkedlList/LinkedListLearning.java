public class LinkedListLearning<T> {

    private Node<T> head;
    private Node<T> tail;

    // Add at First
    public void addFirst(T data) {
        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
    }

    // Display
    public void display() {
        Node<T> temp = head;

        while (temp != null) {
            System.out.print(temp.getData() + " => ");
            temp = temp.getNext();
        }

        System.out.println("null");
    }

    // Add at Last
    public void addLast(T data) {

        Node<T> newNode = new Node<>(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.setNext(newNode);
        tail = newNode;
    }

    // Remove First
    public T removeFirst() {

        if (head == null) {
            throw new UnsupportedOperationException("NO ELEMENT IN LINKED LIST");
        }

        T data = head.getData();
        head = head.getNext();

        if (head == null) {
            tail = null;
        }

        return data;
    }

    // Remove Last
    public T removeLast() {

        if (head == null) {
            throw new UnsupportedOperationException("NO ELEMENT IN LINKED LIST");
        }

        T data = tail.getData();

        if (head == tail) {
            head = tail = null;
            return data;
        }

        Node<T> temp = head;

        while (temp.getNext() != tail) {
            temp = temp.getNext();
        }

        temp.setNext(null);
        tail = temp;

        return data;
    }

    // Search
    public Node<T> search(T data) {

        Node<T> temp = head;

        while (temp != null) {

            if (temp.getData().equals(data)) {
                return temp;
            }

            temp = temp.getNext();
        }

        return null;
    }

    // Insert After Search Element
    public boolean insert(T data, T searchData) {

        Node<T> searchedNode = search(searchData);

        if (searchedNode == null) {
            throw new UnsupportedOperationException("ELEMENT NOT FOUND");
        }

        Node<T> newNode = new Node<>(data);

        newNode.setNext(searchedNode.getNext());
        searchedNode.setNext(newNode);

        // If inserted after tail, update tail
        if (searchedNode == tail) {
            tail = newNode;
        }

        return true;
    }
}
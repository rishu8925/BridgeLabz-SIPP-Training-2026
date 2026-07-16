class Main {
    public static void main(String[] args) {
        LinkedListLearning<Integer> list = new LinkedListLearning<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        list.addLast(50);
        list.addLast(60);
        int rem1 = list.removeFirst();
        System.out.println("element removed from first: "+ rem1);
        int rem2 = list.removeLast();
        System.out.println("element removed from last: " + rem2);

        Node searched = list.search(40);
        System.out.println(searched != null ? "SEARCHED:- " + searched.getData() : "SEARCHED:- not found");
        boolean isInserted = list.insert(70,10);
        System.out.println("inserted:- "+isInserted);
        // list.addFirst(90);
        // list.removeLast();
        list.display();
    }
}

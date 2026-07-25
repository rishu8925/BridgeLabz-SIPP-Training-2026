class LibraryBook {
    String title;
    String author;
    double price;
    boolean available;

    LibraryBook(String title, String author,
                double price, boolean available) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.available = available;
    }

    void borrowBook() {
        if (available) {
            available = false;
            System.out.println("Book Borrowed");
        } else {
            System.out.println("Book Not Available");
        }
    }

    void display() {
        System.out.println(title + " " + author +
                " " + price + " " + available);
    }

    public static void main(String[] args) {
        LibraryBook b =
                new LibraryBook("Java", "James", 500, true);

        b.display();
        b.borrowBook();
        b.display();
    }
}
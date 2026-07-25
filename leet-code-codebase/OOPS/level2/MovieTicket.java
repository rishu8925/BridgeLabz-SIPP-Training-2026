class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movieName,
                    int seatNumber,
                    double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Movie: " + movieName);
        System.out.println("Seat No: " + seatNumber);
        System.out.println("Price: " + price);
    }

    public static void main(String[] args) {
        MovieTicket ticket = new MovieTicket();

        ticket.bookTicket("Avengers", 15, 300);
        ticket.displayDetails();
    }
}
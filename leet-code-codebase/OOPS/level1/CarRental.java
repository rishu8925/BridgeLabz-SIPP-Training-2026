class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental() {
        customerName = "Unknown";
        carModel = "Basic";
        rentalDays = 1;
    }

    CarRental(String customerName,
              String carModel,
              int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    double calculateCost() {
        return rentalDays * 1000;
    }

    void display() {
        System.out.println("Customer: " + customerName);
        System.out.println("Car: " + carModel);
        System.out.println("Days: " + rentalDays);
        System.out.println("Cost: " + calculateCost());
    }

    public static void main(String[] args) {
        CarRental c =
                new CarRental("Pragati", "Swift", 5);

        c.display();
    }
}
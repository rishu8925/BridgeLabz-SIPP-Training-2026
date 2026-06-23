class InsufficientFundsException extends Exception {
    InsufficientFundsException(String message) {
        super(message);
    }
}
public class HospitalBilling {
    static void makePayment(double bill, double paid) throws InsufficientFundsException {
        if (paid < bill) {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        }
        System.out.println("Payment successful.");
    }

    public static void main(String[] args) {
        try {
            int totalBill = 5000;
            int items = 5;
            int costPerItem = totalBill / items;
            System.out.println(costPerItem);
        } catch (ArithmeticException e) {
            System.out.println("Error: Bill cannot be divided by zero items.");
        }

        try {
            String[] patients = {"Rahul", "Aman", "Neha"};
            System.out.println(patients[1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            String input = "4500";
            int amount = Integer.parseInt(input);
            System.out.println(amount);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number input.");
        }

        try {
            makePayment(5000, 6000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}